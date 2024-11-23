import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class ContactManager {
    private ArrayList<Contact> contacts;

    public ContactManager() {
        contacts = new ArrayList<>();
    }

    public void addContact(String name, int phoneNumber) {
        for (Contact contact : contacts) {
            if (contact.getPhoneNumber() == phoneNumber) {
                System.out.println("Error: A contact with this phone number already exists (" + contact.getName() + ").");
                return;
            }
        }
        contacts.add(new Contact(name, phoneNumber));
        System.out.println("Contact added successfully.");
    }

    public void editContact(String name, int newPhoneNumber) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                contact.setPhoneNumber(newPhoneNumber);
                System.out.println("Contact updated successfully.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    public void deleteContact(int phoneNumber) {
        for (Contact contact : contacts) {
            if (contact.getPhoneNumber() == phoneNumber) {
                contacts.remove(contact);
                System.out.println("Contact with phone number " + phoneNumber + " deleted successfully.");
                return;
            }
        }
        System.out.println("Contact not found with phone number: " + phoneNumber);
    }

    public void searchContactByName(String name) {
        boolean found = false;
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                if (!found) {
                    System.out.println("Contacts with the name '" + name + "':");
                    found = true;
                }
                System.out.println(contact);
            }
        }
        if (!found) {
            System.out.println("No contacts found with the name: " + name);
        }
    }

    public void searchContactByNumber(int phoneNumber) {
        for (Contact contact : contacts) {
            if (contact.getPhoneNumber() == phoneNumber) {
                System.out.println("Contact found: " + contact);
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    public void sortContacts() {
        Collections.sort(contacts, Comparator.comparing(Contact::getName));
        System.out.println("Contacts sorted by name.");
    }

    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts to display.");
        } else {
            System.out.println("Contacts:");
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }
}
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactManager contactManager = new ContactManager();
        boolean running = true;

        while (running) {
            System.out.println("\nContact Manager");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Search Contact by Name");
            System.out.println("5. Search Contact by Phone Number");
            System.out.println("6. Sort Contacts");
            System.out.println("7. Display All Contacts");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    try {
                        int phoneNumber = scanner.nextInt();
                        contactManager.addContact(name, phoneNumber);
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter an integer for the phone number.");
                        scanner.next();
                    }
                    break;

                case 2:
                    System.out.print("Enter name of the contact to edit: ");
                    String editName = scanner.nextLine();
                    System.out.print("Enter new phone number: ");
                    try {
                        int newPhoneNumber = scanner.nextInt();
                        contactManager.editContact(editName, newPhoneNumber);
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter an integer for the phone number.");
                        scanner.next();
                    }
                    break;

                case 3:
                    System.out.print("Enter phone number of the contact to delete: ");
                    try {
                        int deletePhoneNumber = scanner.nextInt();
                        contactManager.deleteContact(deletePhoneNumber);
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter an integer for the phone number.");
                        scanner.next();
                    }
                    break;

                case 4:
                    System.out.print("Enter name of the contact to search: ");
                    String searchName = scanner.nextLine();
                    contactManager.searchContactByName(searchName);
                    break;

                case 5:
                    System.out.print("Enter phone number of the contact to search: ");
                    try {
                        int searchNumber = scanner.nextInt();
                        contactManager.searchContactByNumber(searchNumber);
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter an integer for the phone number.");
                        scanner.next();
                    }
                    break;

                case 6:
                    contactManager.sortContacts();
                    break;

                case 7:
                    contactManager.displayContacts();
                    break;

                case 8:
                    running = false;
                    System.out.println("Exiting Contact Manager.");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}
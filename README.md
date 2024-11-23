# Basic-Contact-Book-Manager

Here’s a sample `README.md` file for your GitHub repository:

```markdown
# Contact Manager

A simple **Java-based Contact Manager application** to efficiently manage, search, and organize contacts. This application provides a user-friendly command-line interface for adding, editing, deleting, and displaying contacts.

---

## Features

- **Add Contacts**: Add a new contact with a unique phone number.
- **Edit Contacts**: Update the phone number of an existing contact.
- **Delete Contacts**: Remove a contact using its phone number.
- **Search Contacts**:
  - By Name
  - By Phone Number
- **Sort Contacts**: Sort all contacts alphabetically by name.
- **Display All Contacts**: View the list of all saved contacts.

---

## How to Use

### Prerequisites
- Install **Java** (JDK 8 or later).

### Running the Application
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/contact-manager.git
   ```
2. Navigate to the project directory:
   ```bash
   cd contact-manager
   ```
3. Compile the source code:
   ```bash
   javac Main.java
   ```
4. Run the application:
   ```bash
   java Main
   ```

---

## Menu Options

The application provides the following options:
1. **Add Contact**: Add a new contact by entering the name and phone number.
2. **Edit Contact**: Modify the phone number of an existing contact by name.
3. **Delete Contact**: Delete a contact using its phone number.
4. **Search Contact by Name**: Find contacts matching a given name.
5. **Search Contact by Phone Number**: Find a contact by its phone number.
6. **Sort Contacts**: Sort the list of contacts alphabetically.
7. **Display All Contacts**: Show all stored contacts.
8. **Exit**: Exit the application.

---

## Sample Input/Output

### Adding a Contact
```
Enter name: John Doe
Enter phone number: 1234567890
Contact added successfully.
```

### Searching a Contact by Name
```
Enter name of the contact to search: John
Contacts with the name 'John':
Name: John Doe, Phone: 1234567890
```

---

## Error Handling

- Ensures phone numbers are unique.
- Validates that phone numbers are integers.
- Handles invalid input gracefully with error messages.

---

## Technologies Used

- **Language**: Java
- **IDE**: IntelliJ IDEA (Optional)

---

## Future Enhancements

- Add functionality to export and import contacts.
- Integrate a graphical user interface (GUI) for better user experience.
- Add validation for phone number length and format.

---

## Contributing

Contributions are welcome! If you'd like to enhance this project:
1. Fork the repository.
2. Create a feature branch:
   ```bash
   git checkout -b feature-name
   ```
3. Commit your changes:
   ```bash
   git commit -m "Add feature"
   ```
4. Push to the branch:
   ```bash
   git push origin feature-name
   ```
5. Submit a pull request.

---

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

## Author

- **Ayushman Behera**  
  Second-year B.Tech CSE (DSML) student at Lovely Professional University.
```

Feel free to customize the URL for cloning, your GitHub username, or any specific features you want to highlight.

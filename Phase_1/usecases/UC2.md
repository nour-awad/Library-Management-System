## Use Case 2: Add a Book

### Actor:
Admin

### Description:
Allows an admin to add a new book to the library catalog.

### Preconditions:

* The admin is logged into the system.
* The admin has the necessary permissions to add books.

### Main Flow:
1. The admin logs into the system. 
2. The admin navigates to the "Add Book" section. 
3. The system prompts the admin to provide book details (title, author, genre, and number of copies). 
4. The admin submits the details. 
5. The system validates the information and adds the book to the catalog. 
6. The system confirms the addition with a success message.

### Alternative Scenarios:

2a. Missing Details:

    2a.1. If required fields are not filled, the system 
          notifies the admin and highlights the missing fields.
3a. Duplicate Book:

    3a.1. If the book already exists, the system 
          updates the existing record instead of creating a new one.
### Post-conditions:

* The new book is added to the library catalog and is available for borrowing.

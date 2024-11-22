## Use Case 4: Return a Book

### Actor:
User

### Description:
Allows a member to return a borrowed book.

### Preconditions:

* The user is logged into the system. 
* The book to be returned exists in the user’s borrowing history.

### Main Flow:
1. The user logs into the system.
2. The user navigates to their borrowing history. 
3. The system displays a list of borrowed books. 
4. The user selects the book to return. 
5. The system marks the book as returned and updates its availability in the catalog. 
6. The system displays a success message.

### Alternative Scenarios:

4a. Book Not Borrowed:

    4a.1. If the book is not in the user’s borrowing 
          history, the system displays an error.

### Post-conditions:

* The book is marked as returned in the system.
* The book’s availability is updated in the catalog.

## Use Case 3: Borrow a Book

### Actor:
User

### Description:
Allows a member to borrow a book from the library.

### Preconditions:

* The user is logged into the system.
* The desired book exists in the library catalog.

### Main Flow:
1. The user logs into the system. 
2. The user searches for the desired book. 
3. The system displays the book details, including availability. 
4. The user selects "Borrow Book."
5. The system validates if the user is eligible to borrow (e.g., no overdue books, below borrowing limit). 
6. If eligible, the system marks the book as borrowed and updates the user's record. 
7. The system displays a success message and the due date.

### Alternative Scenarios:

2a. Book Not Found:

    2a.1. The system informs the user that the book is not available.
5a. Book Unavailable:

    5a.1. The system informs the user that all copies are currently borrowed.
### Post-conditions:

* The book is marked as borrowed and associated with the user's record.
* The book's availability is updated in the catalog.

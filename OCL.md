OCL Constraints Document

1.User Management Constraints

 User Registration:
A user’s username must be unique.
context User  
inv UniqueUsername: User.allInstances()->forAll(u1, u2 | u1 <> u2 implies u1.username <> u2.username)  

A user’s password must be at least 8 characters long.
context User  
inv PasswordLength: self.password.size() >= 8  

User Roles:
A user must have either the role "admin" or "member".
context User  
inv ValidRole: self.role = 'admin' or self.role = 'member'  


2. Book Management Constraints

Book Availability:
A book’s availability status must be consistent with its borrowing records.
context Book  
inv AvailabilityConsistency: self.isAvailable = (self.borrowedBy->isEmpty())  

Book Title and Author:
A book’s title and author must not be empty.
context Book  
inv NonEmptyTitle: self.title.size() > 0  
inv NonEmptyAuthor: self.author.size() > 0  




3. Borrowing and Returning Constraints

Borrowing a Book:
A book can only be borrowed if it is available.
context BorrowingService::borrowBook(user: User, book: Book)  
pre BookAvailable: book.isAvailable = true  

A member cannot borrow more than 5 books at a time.
context User  
inv MaxBooksBorrowed: self.borrowedBooks->size() <= 5  


Returning a Book:
A book can only be returned by the user who borrowed it.
context BorrowingService::returnBook(user: User, book: Book)  
pre BookBorrowedByUser: book.borrowedBy = user  


4. Notification Constraints
Due Date Notification:
A notification must be sent if a book is overdue (e.g., more than 14 days since borrowing).
context NotificationService::sendDueDateNotification(user: User, book: Book)  
pre BookOverdue: book.borrowedDate.daysBetween(Date.now()) > 14  



5. System-Wide Constraints
Concurrent Users:
The system must not exceed 50 concurrent users.
context System  
inv MaxConcurrentUsers: User.allInstances()->select(u | u.isLoggedIn = true)->size() <= 50  



Response Time:
The system must respond to any operation within 3 seconds.
context System  
inv MaxResponseTime: self.responseTime <= 3  


6. Admin-Specific Constraints
Book Management:
Only admins can add, update, or remove books.
context BookManagementService::addBook(admin: User, book: Book)  
pre AdminRole: admin.role = 'admin'  

User Management:
Only admins can delete user accounts.
context UserManagementService::deleteUser(admin: User, user: User)  
pre AdminRole: admin.role = 'admin'  



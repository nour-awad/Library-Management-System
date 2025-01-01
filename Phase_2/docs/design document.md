1. Introduction
1.1 Purpose of the System
The purpose of Libra, the Library Management System, is to automate and streamline library operations such as book cataloging, user registration, borrowing, and returning books. It aims to replace manual processes, reduce inefficiencies, and enhance user satisfaction and staff productivity.
1.2 Design Goals
The primary design goals for Libra include:
Modularity: The system is designed in modular components for easy maintenance and future enhancements.
Scalability: The architecture allows for future expansion (e.g., cloud integration, database support).
User-Friendliness: Intuitive interfaces for both admins and members.
Performance: Maximum response time of 3 seconds for any operation.
Security: User authentication and role-based access control.
Constraints: In-memory storage, support for up to 50 concurrent users.

2. High-Level Software Architecture
2.1 Subsystem Decomposition
The system is divided into the following subsystems:
User Management: Handles user registration, login, and role-based access.
Book Management: Manages the book catalog (add, update, remove books).
Borrowing/Returning: Handles book borrowing and returning operations.
Notifications: Sends reminders for due dates.
Admin Dashboard: Provides admins with tools to manage books and users.
2.2 Hardware/Software Mapping
Hardware: Standard desktop hardware with internet access.
Software: Java 20, IntelliJ IDEA, in-memory storage.
Dependencies: Internet access for users, Java 20 SDK for development.
2.3 Persistent Data Management
Data is stored in-memory during runtime, meaning it is not persisted across sessions.
Future versions may include database integration for persistent storage.
2.4 Access Control and Security
Authentication: Users must log in with a username and password.
Role-Based Access: Admins have full access to manage books and users, while members can only borrow and return books.
2.5 Boundary Conditions
Initialization: The system loads default data (e.g., admin accounts, sample books) at startup.
Shutdown: All in-memory data is cleared.
Error Handling: The system logs errors and provides user-friendly error messages.
Edge Cases: Handles maximum concurrent users (50) and ensures response time remains under 3 seconds.

3. Low-Level Design
3.1 Object Design Trade-offs
In-Memory Storage vs. Database: In-memory storage was chosen for simplicity and performance but limits data persistence.
Modularity vs. Performance: Modular design was prioritized for maintainability, with performance optimizations added where necessary.
3.2 Final Object Design
Key classes include:
User: Represents a library user (admin or member).
Book: Represents a book in the catalog.
BorrowingService: Handles borrowing and returning operations.
NotificationService: Sends due date reminders.
3.3 Packages
com.libra.usermanagement: Handles user registration and login.
com.libra.bookmanagement: Manages the book catalog.
com.libra.borrowing: Handles borrowing and returning books.
com.libra.notifications: Manages notifications.
com.libra.admin: Provides admin-specific functionalities.
3.4 Class Interfaces
User Class:
public class User {  
    private String username;  
    private String password;  
    private String role; // "admin" or "member"  
    // Getters and setters  
} 
Book Class:
public class Book {  
    private String title;  
    private String author;  
    private boolean isAvailable;  
    // Getters and setters  
} 
BorrowingService Class:
public class BorrowingService {  
    public void borrowBook(User user, Book book) { ... }  
    public void returnBook(User user, Book book) { ... }  
} 
3.5 Design Patterns
Singleton: Used for the NotificationService to ensure a single instance manages all notifications.
Observer: Used to notify users about due dates.
Factory: Used to create different types of users (admin or member).

4. Improvement Summary (Iteration 2 Only)
In the second iteration, the following improvements were made:
Performance Optimization: Reduced response time for borrowing and returning operations.
Enhanced Security: Added password encryption for user authentication.
New Features: Introduced due date notifications for members.
Bug Fixes: Resolved issues with concurrent user handling.

5. Glossary & References
Glossary
SRS: Software Requirements Specification.
UML: Unified Modeling Language.
JAR: Java Archive, a package file format for Java applications.
SDK: Software Development Kit.
References
IEEE SRS Template.
Java 20 Documentation.
UML Diagrams (provided in documentation).
IntelliJ IDEA User Guide.


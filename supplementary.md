Supplementary Specifications Document
1. Non-Functional Requirements
Performance:

The system must respond to any user operation within 3 seconds.

The system must support up to 50 concurrent users without degradation in performance.

Scalability:

The system should be designed to allow future enhancements, such as integration with a database or cloud-based storage.

Reliability:

The system must maintain 99% uptime during operational hours.

All in-memory data must persist during the system’s runtime without loss.

Security:

User passwords must be stored in an encrypted format.

Only authenticated users can access the system, and role-based access control must be enforced.

Usability:

The user interface must be intuitive and require minimal training for both admins and members.

Error messages must be clear and guide users toward resolving issues.

Maintainability:

The code must be well-commented and follow Java best practices.

The system must be modular to allow for easy updates and maintenance.

2. System-Wide Rules
User Roles:

Admin: Can manage books (add, update, remove) and user accounts.

Member: Can borrow and return books, and view their borrowing history.

Book Borrowing Rules:

A member can borrow a maximum of 5 books at a time.

A book can only be borrowed if it is marked as available.

Notifications:

Members must receive notifications for due dates and overdue books.

Notifications must be sent via the system interface (e.g., on the member’s dashboard).

Data Management:

All data is stored in-memory and is cleared when the system shuts down.

Future versions may include persistent storage (e.g., a database).

3. Documentation Requirements
User Documentation:

A user manual must be provided for both admins and members, explaining how to use the system.

The manual must include step-by-step instructions for key operations (e.g., borrowing a book, managing the catalog).

Technical Documentation:

The system must include detailed technical documentation, including:

Class diagrams.

Sequence diagrams.

OCL constraints.

API documentation (if applicable).

4. Compliance Requirements
Java Best Practices:

The system must adhere to Java coding standards and best practices.

The code must be compatible with Java 20.

Architecture Standards:

The system must follow a modular architecture to ensure scalability and maintainability.

The design must align with in-memory storage constraints.

5. Deployment Requirements
Installation:

The system must be packaged as a standalone JAR file for easy deployment.

Users must have Java 20 installed to run the system.

Platform Compatibility:

The system must run on any platform that supports Java 20 (e.g., Windows, macOS, Linux).

6. Testing Requirements
Unit Testing:

All core functionalities (e.g., user registration, book borrowing) must be covered by unit tests.

Integration Testing:

End-to-end workflows (e.g., borrowing and returning a book) must be tested to ensure system integration.

User Acceptance Testing (UAT):

The system must be tested by end-users (admins and members) to ensure it meets their needs.

7. Glossary
Admin: A library staff member who manages system operations.

Member: A library user who borrows and returns books.

JAR: Java Archive, a package file format for Java applications.

OCL: Object Constraint Language, used to specify constraints on the system.

8. References
IEEE SRS Template.

Java 20 Documentation.

UML Diagrams (provided in documentation).

IntelliJ IDEA User Guide.
## Use Case 1: User Registration

### Actor: 
User

### Description: 
Allows a new user to register for an account in the system.

### Preconditions:

* The user is not already registered in the system.
* The system is accessible and functional.

### Main Flow:

1. The user opens the registration page.
2. The system prompts the user to enter details (name, email, password, and phone number).
3. The user submits the registration form.
4. The system validates the entered information.
5. If validation succeeds, the system creates a new user account.
6. The system confirms the registration with a success message.

### Alternative Scenarios:

1a. Invalid Inputs:

    1a.1. The system detects missing or invalid data (e.g., invalid email format).
    1a.2. The system displays an error message and asks the user to correct the input.
2a. Duplicate Email:

    2a.1. The email provided is already associated with an existing account.
    2a.2. The system informs the user and suggests logging in instead.
### Postconditions:

* A new user account is created and saved in the system.
* The user can now log in to the system.

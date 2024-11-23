# Software Requirements Specification
## For Libra
* Version 1.0

Prepared by

**Nour Awad**

22 Nov 2024

---

### Table of Contents
* [Revision History](#revision-history)
* 1 [Introduction](#1-introduction)
    * 1.1 [Document Purpose](#11-document-purpose)
    * 1.2 [Product Scope](#12-product-scope)
    * 1.3 [Definitions, Acronyms and Abbreviations](#13-definitions-acronyms-and-abbreviations)
    * 1.4 [References](#14-references)
    * 1.5 [Document Overview](#15-document-overview)
* 2 [Product Overview](#2-product-overview)
    * 2.1 [Product Perspective](#21-product-perspective)
    * 2.2 [Product Functions](#22-product-functions)
    * 2.3 [Product Constraints](#23-product-constraints)
    * 2.4 [User Characteristics](#24-user-characteristics)
    * 2.5 [Assumptions and Dependencies](#25-assumptions-and-dependencies)
    * 2.6 [Apportioning of Requirements](#26-apportioning-of-requirements)
* 3 [Requirements](#3-requirements)
    * 3.1 [External Interfaces](#31-external-interfaces)
        * 3.1.1 [User Interfaces](#311-user-interfaces)
        * 3.1.2 [Hardware Interfaces](#312-hardware-interfaces)
        * 3.1.3 [Software Interfaces](#313-software-interfaces)
    * 3.2 [Functional](#32-functional)
    * 3.3 [Quality of Service](#33-quality-of-service)
        * 3.3.1 [Performance](#331-performance)
        * 3.3.2 [Security](#332-security)
        * 3.3.3 [Reliability](#333-reliability)
        * 3.3.4 [Availability](#334-availability)
    * 3.4 [Compliance](#34-compliance)
    * 3.5 [Design and Implementation](#35-design-and-implementation)
        * 3.5.1 [Installation](#351-installation)
        * 3.5.2 [Distribution](#352-distribution)
        * 3.5.3 [Maintainability](#353-maintainability)
        * 3.5.4 [Reusability](#354-reusability)
        * 3.5.5 [Portability](#355-portability)
        * 3.5.6 [Cost](#356-cost)
        * 3.5.7 [Deadline](#357-deadline)
        * 3.5.8 [Proof of Concept](#358-proof-of-concept)
* 4 [Verification](#4-verification)
* 5 [Appendices](#5-appendices)

---

## Revision History

| Name         | Date        | Reason For Changes | Version |  
|--------------|-------------|--------------------|---------|  
| Nour Awad    | 22 Nov 2024 | Initial SRS        | 1.0     |  

---

## 1. Introduction

### 1.1 Document Purpose
This SRS outlines the functional and non-functional requirements for **Libra**, a Library Management System. It serves as a guideline for developers, testers, and stakeholders.

### 1.2 Product Scope
**Libra** automates library operations such as book cataloging, user registration, borrowing, and returning books. It eliminates inefficiencies in manual processes, enhancing user satisfaction and staff productivity.

### 1.3 Definitions, Acronyms, and Abbreviations
- **Admin**: A library staff member who manages system operations.
- **Member**: A library user who borrows and returns books.
- **SRS**: Software Requirements Specification.

### 1.4 References
- [IEEE SRS Template](https://standards.ieee.org/)
- Libra Use Case Diagrams (provided in documentation).

### 1.5 Document Overview
This document is organized into sections detailing the product overview, requirements, and verification strategies.

---

## 2. Product Overview

### 2.1 Product Perspective
**Libra** is a standalone system designed to streamline library operations using in-memory storage. It replaces manual systems and is modular for future enhancements.

### 2.2 Product Functions
- User registration and login.
- Book catalog management (add, update, remove books).
- Borrowing and returning books.
- Notifications for due dates.

### 2.3 Product Constraints
- In-memory data storage (no external database).
- Maximum of 50 concurrent users.
- Response time of 3 seconds or less.

### 2.4 User Characteristics
- **Admins**: Technically proficient, responsible for system management.
- **Members**: General users with basic computer literacy.

### 2.5 Assumptions and Dependencies
- Users have internet access to use the system.
- System runs on Java 20 in IntelliJ.

### 2.6 Apportioning of Requirements
Advanced features like cloud integration will be deferred to future versions.

---

## 3. Requirements

### 3.1 External Interfaces

#### 3.1.1 User Interfaces
- A login page for admins and members.
- Admin dashboard to manage books and users.
- Member interface for borrowing and returning books.

#### 3.1.2 Hardware Interfaces
- Compatible with standard desktop hardware.

#### 3.1.3 Software Interfaces
- Runs on Java 20 with IntelliJ.

### 3.2 Functional Requirements
- **User Registration:** Members and admins can create accounts.
- **Book Management:** Admins can add, update, or remove books.
- **Borrow and Return:** Members can borrow and return books.

### 3.3 Quality of Service

#### 3.3.1 Performance
- Maximum response time of 3 seconds for any operation.

#### 3.3.2 Security
- User authentication with password protection.

#### 3.3.3 Reliability
- Persistent session data during runtime.

#### 3.3.4 Availability
- Accessible 99% of the time during operational hours.

### 3.4 Compliance
Follows Java best practices and in-memory architecture standards.

### 3.5 Design and Implementation

#### 3.5.1 Installation
Runs on IntelliJ IDEA with Java 20 SDK.

#### 3.5.2 Distribution
Packaged as a standalone JAR file.

#### 3.5.3 Maintainability
Commented code and modular design ensure easy updates.

#### 3.5.5 Portability
Can run on any system with Java 20 installed.

---

## 4. Verification
- Unit testing for core functionalities.
- Integration testing for use case flows.
- Manual testing for user interfaces.

---

## 5. Appendices
- Use Case Diagrams.
- Class Diagrams.
- Sequence Diagrams.

---

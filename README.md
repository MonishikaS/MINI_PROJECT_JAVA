# Online Student Management System (Spring + Hibernate)

## Overview

The **Online Student Management System** is a mini project designed to demonstrate core enterprise Java concepts—**Dependency Injection using Spring**, **CRUD operations using Hibernate ORM**, **transaction management for fee payment/refund**, and seamless **integration of Spring with Hibernate**.  
This project provides a layered architecture where admin/staff users can manage students, courses, enrollments, and fee operations through a simple user interface (console or web).

---

## Features

- **Student Management**: Add, update, delete, and view student records.
- **Course Management**: Create, update, assign, and view courses.
- **Enrollment**: Assign courses to students.
- **Fee Management**: Handle payments and refunds with transactional safety.
- **Dependency Injection**: Demonstrates Spring's Java-based configuration (`@Configuration` and `@Bean`).
- **CRUD Operations**: All main entities (Student, Course) are managed via Hibernate ORM.
- **Transaction Management**: Ensures payments and refunds are atomic and consistent using `@Transactional`.
- **Console/Web Interface**: Menu options for operations with real-time feedback.
- **Modular & Layered**: Service, DAO, and Entity layers for clean separation and easier maintenance.

---

## Technologies Used

- Java 11+
- Spring Framework (Core, Context, Tx Mgmt)
- Hibernate ORM
- MySQL or H2 Database
- Maven or Gradle (for dependency management)
- IntelliJ IDEA or Eclipse (recommended IDE)

---


## Database Schema

**Tables:**
- `students` (student_id PK, name, course_id FK, balance)
- `courses` (course_id PK, course_name, duration)
- `payments` (payment_id PK, student_id FK, amount, date)

A sample schema is provided in `/docs/schema.sql`.

---

## Getting Started

### 1. Clone the Repository


### 2. Set Up the Database

- Create a MySQL database or use H2 (for testing).
- Update DB config in `src/main/resources/application.properties`.

### 3. Build the Project

- **Maven:**  
  `mvn clean install`
- **Gradle:**  
  `./gradlew build`

### 4. Run the Application

- **Console:** Run `MainApp.java`
- **Web:** Start Spring Boot app and access endpoints (if implemented)

### 5. Usage

The application will present menu options to manage students, courses, payments, and refunds. Choose desired actions as prompted.

---

## Example Operations

- **Add Student:** Enter name, course, and opening balance.
- **Enroll Course:** Select student and assign course.
- **Update Student:** Modify student details or assigned course.
- **Fee Payment/Refund:** Enter student ID and amount for payment or refund.
- **Delete Student:** Remove records as needed.

All operations provide success/failure feedback and ensure data consistency.

---





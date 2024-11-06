# Employee Service H2 DB

This project demonstrates a simple employee management service using Spring Boot and an H2 in-memory database. It supports basic CRUD operations to manage employee data.

## Table of Contents
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Prerequisites](#prerequisites)
- [Setup](#setup)
- [Running the Application](#running-the-application)
- [Usage](#usage)

## Features
- CRUD Operations: Create, Read, Update, and Delete book records.
- Spring Boot Setup: Uses Spring Boot for easy application configuration and management.
- H2 In-Memory Database: Uses H2 as the database for quick, lightweight testing and development.
- REST API: Provides a RESTful API for interacting with the employee data.

## Technologies Used
- **Spring Boot** (Backend framework)
- **H2 in memory** (Database)
- **Maven** (Dependency management)

## Prerequisites
- **JDK 8** or higher
- **Maven** for dependency management

## Setup
1. **Clone the repository**:
   ```bash
   git clone https://github.com/rabiyag/employee-service-h2-db.git
   cd employee-service-h2-db
   ```

2. **Update application.properties with database connection details:**:
    ```properties
    spring.datasource.url=jdbc:h2:mem:testdb
    spring.datasource.driverClassName=org.h2.Driver
    spring.datasource.username=sa
    spring.datasource.password=password
    spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
    ```
   
3. **Build the project with Maven**:
   ```bash
   mvn clean install
   ```

## Running the Application
1. **Run the application**:
   ```bash
   mvn spring-boot:run
   ```

2. **Access the application**:
   - The application will be available at http://localhost:8080:
  

## API Endpoints

**Get All Employees**: GET /api/employees

**Get Employee by ID**: GET /api/employees/{id}

**Create Employee**: POST /api/employees

**Update Employee**: PUT /api/employees/{id}

**Delete Employee**: DELETE /api/employees/{id}



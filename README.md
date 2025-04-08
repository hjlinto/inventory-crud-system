# 🎻 Bow and Bridge Inventory Management System

A full-featured Java-based inventory management system designed for a fictional musical instrument company, **Bow and Bridge**. This application provides a web interface for managing products and parts, with real-time inventory validation, dynamic navigation, and a clean user experience.

This project builds upon a provided inventory management system skeleton. As part of the D287 Performance Assessment, I extended and customized the system with new features, validation logic, UI enhancements, and tests detailed below.

---

## Features

- Inventory CRUD for parts and products
- Dynamic Buy Now feature with inventory checks
- Minimum and maximum inventory validation
- About page with consistent UI elements
- Form-level error handling with user feedback
- Modular Spring Boot backend with Java-based validation logic
- Unit tests for critical functionality

---

## Developer Contributions

This project was built on a provided base structure for an Inventory Management System (IMS). My work focused on extending and customizing the application by:

- Creating new HTML views (`about.html`, `purchaseSuccess.html`, `purchaseError.html`) with improved navigation and user feedback
- Implementing controller logic (`AboutController.java`, `ProductController.java`) to support new navigation paths and purchase behavior
- Adding a "Buy Now" feature with inventory tracking and conditional routing to success or error pages
- Enhancing data validation through custom annotations and constraint validators for inventory minimum and maximum values
- Updating forms to collect min/max inputs and display user-friendly error messages
- Writing unit tests to verify new functionality
- Refactoring data seeding logic to align with improved data structure and instructor recommendations
- Removing unused validation classes for production-readiness

These contributions were implemented across several Java classes, HTML templates, and configuration files, with full version control and commit documentation.

---

## Technologies Used

- **Java 17**
- **Spring Boot**
- **Thymeleaf**
- **HTML/CSS**
- **JUnit 5** (for unit testing)

---

## Project Structure
/src ├── controller/ │ ├── AboutController.java │ ├── ProductController.java ├── model/ │ ├── Part.java │ ├── InHousePart.java │ ├── OutsourcedPart.java ├── service/ │ ├── PartServiceImpl.java │ ├── InhousePartServiceImpl.java │ ├── OutsourcedPartServiceImpl.java ├── validators/ │ ├── MaximumPartsValidator.java │ ├── MinimumPartsValidator.java ├── data/ │ └── BootStrapData.java /resources ├── templates/ │ ├── mainscreen.html │ ├── about.html │ ├── purchaseSuccess.html │ ├── purchaseError.html ├── static/ ├── application.properties

---

## ️ Usage Instructions

### ️ Prerequisites
- Java 17+
- Maven or IntelliJ (recommended)
- Internet connection (for dependency download)

### Installation

1. Clone the repo:
```bash
https://github.com/hjlinto/bow-and-bridge-ims.git
```
2. Open in Java IDE
3. Build and run the project:
```bash
./mvnw spring-boot:run
```
4. Open browser and navigate to:
   http://localhost:8080/

## Author
Created by: Hunter J Linton

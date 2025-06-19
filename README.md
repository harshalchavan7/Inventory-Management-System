# Inventory Management Application

## Overview
This is a simple Inventory Management Application built using Java and Spring Boot. It allows you to manage products with basic CRUD operations. The project uses an in-memory H2 database for data storage and is organized with a typical layered architecture following MVC principles.

---

## Project Structure

```
Inventory Management Application
│
├── .idea/                         # IntelliJ IDEA project files
├── .mvn/                          # Maven wrapper files
│   └── wrapper/
│       └── maven-wrapper.properties
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/demo/
│   │   │       ├── controller/          # REST API controllers (ProductController.java)
│   │   │       ├── model/               # Entity/model classes (Product.java)
│   │   │       ├── repository/          # JPA repositories (ProductRepository.java)
│   │   │       ├── service/             # Business logic/services (ProductService.java)
│   │   │       └── InventoryManagementApplication.java  # Main Spring Boot Application class
│   │   └── resources/
│   │       ├── application.properties   # App & DB configurations
│   │       └── data.sql                  # Sample SQL data to pre-populate H2 DB
│   └── test/
│       └── java/com/example/demo/
│           └── InventoryManagementApplicationTests.java  # Basic unit tests
├── target/                        # Compiled bytecode and build artifacts
│   ├── classes/
│   │   └── com/example/demo/...   # Compiled .class files for packages
│   └── generated-sources/
├── HELP.md                       # Help/documentation file
├── mvnw, mvnw.cmd                # Maven wrapper scripts for UNIX/Windows
└── pom.xml                      # Maven build and dependency descriptor
```

---

## Technologies Used

- **Java 17**
- **Spring Boot 3.2.2**
- **Spring Data JPA** for ORM
- **H2 In-Memory Database** for quick, transient data storage
- **Bruno** for API testing
- **Maven** for build and dependency management

---

## Features

- CRUD operations on `Product` entity
- RESTful APIs in `ProductController`
- Business logic encapsulated in `ProductService`
- Data access via `ProductRepository`
- Preloaded sample data via `data.sql`
- H2 console enabled for easy DB access at `/h2-ui`
- Logging of SQL queries enabled for debugging

---

## Configuration

### application.properties

- Enables H2 console (`/h2-ui`)
- Configures H2 in-memory DB URL, username, and driver
- JPA Hibernate settings for SQL display and auto-update of schema

### Sample SQL (data.sql)

```sql
CREATE TABLE Product(
  id number,
  name VARCHAR(20),
  description VARCHAR(20),
  count number,
  producer VARCHAR(20)
);

INSERT INTO Product VALUES (1,'Laptop','Dell Laptop',5,'Harshal');
INSERT INTO Product VALUES (2,'Mobile','ios',1,'Pankaj');
INSERT INTO Product VALUES (3,'Tablet','Lenovo',4,'Sairaj');
```

---

## How to Run

1. Clone the repository.
2. Ensure you have JDK 17 and Maven installed.
3. Run the application using:

```bash
./mvnw spring-boot:run
```

or on Windows:

```powershell
mvnw.cmd spring-boot:run
```

4. Access the API at: `http://localhost:8080/`
5. Access the H2 database console at: `http://localhost:8080/h2-ui` (use username `Harshal`, no password)

---

## Testing

- API testing can be performed using Bruno or other REST clients by hitting the endpoints exposed by `ProductController`.

---

## Notes

- This project is designed for learning and prototyping purposes with in-memory data storage.
- For production, configure a persistent database and secure API endpoints.
- Dependencies have been updated to avoid known security vulnerabilities.

---

## Contact

For questions or suggestions, feel free to reach out.

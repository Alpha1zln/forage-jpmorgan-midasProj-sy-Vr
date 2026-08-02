# JP Morgan Software Engineering Virtual Experience (Forage)

## Overview

This repository contains my implementation notes and learning documentation for the JP Morgan Chase Software Engineering Virtual Experience on Forage.

The project simulates the development of **Midas Core**, a backend service responsible for processing financial transactions in a banking system.

The experience introduces technologies commonly used in enterprise Java applications:

- Java 17
- Spring Boot
- Spring Data JPA
- Apache Kafka
- H2 Database
- REST APIs
- Maven
- JUnit Testing

Rather than simply completing the tasks, this repository documents the concepts, architecture, implementation decisions, and interview takeaways from each stage.

---

## System Architecture

```
Frontend

↓

Kafka Topic

↓

Kafka Listener

↓

Business Logic

↓

H2 Database

↓

REST API
```

---

## Proj Structure 

#### forage-midas-jpMorgan-sy-proj/

```
│
├── README.md
│
├── docs/
│   ├── Architecture.md
│   ├── Project-Flow.md
│   ├──Tasks-Detail
│   │   ├── Task-1-Project-Setup.md
│   │   ├── Task-2-Kafka.md
│   │   ├── Task-3-H2-Database.md
│   │   ├── Task-4-REST-API.md
│   │   ├── Task-5-Integration.md
│   ├── Interview-Questions.md
│   └── Glossary.md
│
└── images/

```
---

## Learning Objectives

- Understand enterprise backend architecture.
- Learn asynchronous messaging using Kafka.
- Learn how Spring Boot integrates multiple technologies.
- Understand JPA entities and relationships.
- Learn Maven project structure.
- Understand automated testing using JUnit.

---


## Tasks

### Task 1 – Project Setup

Objective:
Prepare the development environment and understand the existing project scaffold.

Topics Covered
- Java 17
- Maven
- Spring Boot
- pom.xml
- Dependency Management
- application.yml
- Project Structure
- Automated Testing

Outcome:
Successfully configured the project and verified the development environment by running Maven tests.

---

### Task 2 – Kafka Integration

Objective

Integrate Apache Kafka into the Spring Boot application and consume incoming transaction events.

Topics Covered

- Kafka Producer
- Kafka Consumer
- Kafka Topics
- Kafka Listener
- JSON Serialization
- JSON Deserialization
- Embedded Kafka
- Event-driven Architecture

Outcome

Implemented a Kafka Listener capable of consuming transaction events and converting incoming JSON into Java objects.

---

### Task 3 – H2 Database Integration

Objective

Persist valid transactions into a relational database.

Topics Covered

- H2 Database
- Spring Data JPA
- Entity Relationships
- CRUD Repository
- Validation Logic
- Business Rules
- DTO vs Entity
- SQL Database

Outcome

Validated incoming transactions, updated user balances, and persisted transaction records into an H2 database.

---

### Task 4 – REST API Integration

Objective

Expose processed information through REST endpoints and integrate the backend with external services.

Expected Topics

- REST Architecture
- Controllers
- Request Mapping
- ResponseEntity
- JSON Responses
- HTTP Status Codes
- REST Client Communication

Expected Outcome

Expose processed account information through REST APIs while following Spring Boot best practices.

---

### Task 5 – Complete System Integration

Objective

Integrate Kafka, Database, and REST APIs into a complete transaction processing pipeline.

Expected Topics

- End-to-End Request Flow
- Event Processing
- Layered Architecture
- Business Validation
- Persistence
- External Service Integration
- Enterprise Backend Design

Expected Outcome

Complete an end-to-end banking transaction workflow demonstrating how enterprise Spring Boot applications process financial events reliably.

---
---

## Technologies

- Java 17
- Spring Boot 3
- Spring Data JPA
- Apache Kafka
- H2 Database
- Maven
- JUnit
- Testcontainers

---

## Status

✔ Completed JP Morgan Software Engineering Virtual Experience
✔ Documentation in progress


---

#### Midas
Project repo for the JPMC Advanced Software Engineering Forage program

---

#### Learning Journey

This project was completed by combining hands-on implementation with self-learning through YouTube, Udemy, ChatGPT, Gemini, and the Forage virtual experience.

Through this project, I gained practical exposure to:

- Building enterprise backend applications using Spring Boot
- Event-driven communication with Apache Kafka
- Database integration using Spring Data JPA and H2
- Maven-based project configuration and dependency management
- REST API fundamentals
- Layered application architecture
- Reading and understanding an existing enterprise codebase
- Debugging, automated testing, and project setup

---
---

# Glossary

## API
Application Programming Interface.

Allows two applications to communicate.

---

## Spring Boot

Framework for rapidly building Java backend applications.

---

## Maven

Build automation and dependency management tool.

---

## pom.xml

Project configuration file.

Stores dependencies and plugins.

---

## Dependency

External library used by the project.

Example

Spring Boot Starter Web

---

## Kafka

Distributed event streaming platform.

Used for asynchronous communication.

---

## Producer

Application that sends messages to Kafka.

---

## Consumer

Application that receives messages.

---

## Topic

Logical channel where Kafka stores messages.

---

## Broker

Kafka server.

---

## DTO

Data Transfer Object.

Used to transfer data between systems.

Example

Transaction.java

---

## Entity

Class mapped to a database table.

Example

UserRecord

---

## Repository

Spring Data interface responsible for database operations.

---

## JPA

Java Persistence API.

Specification for persistence.

---

## Hibernate

Most popular implementation of JPA.

---

## H2

Lightweight in-memory SQL database.

Mostly used for development and testing.

---

## CRUD

Create

Read

Update

Delete

---

## Dependency Injection

Spring automatically creates and injects required objects.

---

## Bean

Object managed by Spring Container.

---

## Component

A Spring-managed bean.

Annotated using

@Component

---

## Service

Contains business logic.

---

## Repository Layer

Communicates with database.

---

## Controller

Handles HTTP requests.

---

## REST API

Web API following REST principles.

---

## JSON

JavaScript Object Notation.

Standard format for data exchange.

---

## Serialization

Converting Java object → JSON.

---

## Deserialization

Converting JSON → Java object.

---

## Embedded Kafka

Temporary Kafka server created only during tests.

---

## Testcontainers

Library used to create Docker containers for testing.

---

## Transaction (Project)

Incoming Kafka message.

DTO.

---

## TransactionRecord

Database entity.

Stores valid transactions.

---

## UserRecord

Represents a bank customer.

---

## Validation

Checking business rules before processing.

---

## Business Logic

Core rules of the application.

Example

Checking account balance before transfer.

---

## ManyToOne

Many transactions can belong to one user.

---

## ACID

Atomicity

Consistency

Isolation

Durability

Essential properties of SQL databases.
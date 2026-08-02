# JP Morgan Midas Core
# Interview Questions

This document contains interview questions that can be asked based on the JP Morgan Software Engineering Virtual Experience project.

---

# Task 1 – Project Setup

## Java

1. Why Java 17?
2. What are LTS versions?
3. Difference between JDK, JRE and JVM?
4. What is bytecode?

---

## Maven

1. What is Maven?
2. Why do we use Maven?
3. What is pom.xml?
4. Difference between dependency and plugin?
5. Explain Maven lifecycle.
6. What happens when you run mvn clean install?
7. Difference between compile, package and install?

---

## Spring Boot

1. What is Spring Boot?
2. Why Spring Boot instead of Spring Framework?
3. What is Auto Configuration?
4. What is Dependency Injection?
5. Explain @SpringBootApplication.
6. What is Component Scan?

---

## Configuration

1. application.properties vs application.yml
2. Why externalize configuration?
3. How are properties injected using @Value?

---

# Task 2 – Kafka

## Basics

1. What is Kafka?
2. Why do companies like JP Morgan use Kafka?
3. Difference between synchronous and asynchronous communication?
4. Difference between REST and Kafka?

---

## Kafka Components

1. Producer
2. Consumer
3. Topic
4. Broker
5. Consumer Group
6. Offset

---

## Spring Kafka

1. What is @KafkaListener?
2. How does Spring deserialize JSON automatically?
3. What is JsonSerializer?
4. What is JsonDeserializer?
5. Why Embedded Kafka for testing?

---

# Task 3 – Database

## SQL

1. Why SQL for Banking?
2. Why not NoSQL?
3. What is ACID?

---

## H2

1. What is H2 Database?
2. Why H2 during development?
3. Difference between H2 and MySQL?

---

## JPA

1. What is JPA?
2. What is Hibernate?
3. Difference between JPA and Hibernate?
4. Difference between CrudRepository and JpaRepository?
5. What is an Entity?
6. Why @Entity?
7. What is @Id?
8. Why @GeneratedValue?

---

## Relationships

1. OneToOne
2. OneToMany
3. ManyToOne
4. ManyToMany

When should each be used?

---

## Project

1. Why Transaction DTO?
2. Why TransactionRecord Entity?
3. Why separate DTO from Entity?
4. Why validate balance before persisting?
5. What happens if sender doesn't exist?
6. Why update sender before recipient?
7. How would you make this transaction atomic?

---

# Task 4 – REST API

(Expected after completion)

1. What is REST?
2. GET vs POST vs PUT vs DELETE
3. What is ResponseEntity?
4. Why JSON?
5. HTTP Status Codes

---

# Task 5 – Integration

(Expected after completion)

1. Explain complete project flow.
2. Explain request lifecycle.
3. Where is business logic written?
4. How would you deploy this project?
5. What improvements would you make for production?

---

# HR Questions

• Explain this project.

• Biggest learning.

• Challenges faced.

• Why Kafka?

• Why Spring Boot?

• What would you improve?

• Which part did you implement yourself?
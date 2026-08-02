# Task 2

## Goal

Receive transactions using Kafka.

## Flow

Producer

↓

Topic

↓

Consumer

↓

Listener

↓

Transaction DTO

## What I Learned

Kafka enables asynchronous communication.

Producer sends messages.

Consumer receives messages.

Spring Boot automatically deserializes JSON.

KafkaListener subscribes to a topic.

Embedded Kafka allows testing without installing Kafka.

## Files

Transaction.java

DTO representing incoming message.

KafkaTransactionListener.java

Consumes messages.

application.yml

Stores topic configuration.

## Interview Questions

Why Kafka?

Difference between Producer and Consumer?

What is a Topic?

What is a Consumer Group?

Why asynchronous messaging?

Advantages over REST?
# Task 3

## Goal

Persist valid transactions.

## Validation Rules

Sender exists.

Recipient exists.

Sender balance >= transaction amount.

If valid

Update balances.

Persist transaction.

Otherwise ignore.

## JPA Relationship

```
TransactionRecord

↓

ManyToOne

↓

UserRecord
```

## Why TransactionRecord?

Transaction

↓

DTO

Used for communication.

TransactionRecord

↓

Entity

Stored inside database.

## Files

UserRecord

Represents users.

TransactionRecord

Represents persisted transactions.

UserRepository

Performs CRUD.

TransactionRepository

Stores transactions.

## Interview Questions

Difference between DTO and Entity?

Why SQL for banking?

Why H2?

What is JPA?

What is Hibernate?

Difference between CrudRepository and JpaRepository?

What is @ManyToOne?
# System Architecture

```
                  Client

                     │

                     ▼

              Kafka Producer

                     │

                     ▼

               Kafka Topic

                     │

                     ▼

         KafkaTransactionListener

                     │

                     ▼

             Business Validation

                     │

         ┌───────────┴────────────┐

         ▼                        ▼

 UserRepository         TransactionRepository

         │                        │

         └────────────┬───────────┘

                      ▼

                    H2 Database

                      │

                      ▼

                  REST API
```

## Responsibilities

Kafka

- Receives incoming transactions.

Listener

- Consumes messages.

Business Layer

- Validates transactions.

Repositories

- Persist entities.

Database

- Stores users and transactions.
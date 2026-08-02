# Complete Project Flow

Transaction generated

↓

Kafka Producer

↓

Kafka Topic

↓

Kafka Consumer

↓

Deserialize JSON

↓

Transaction DTO

↓

Validate sender

↓

Validate recipient

↓

Validate balance

↓

Update balances

↓

Persist transaction

↓

Expose balance via REST API
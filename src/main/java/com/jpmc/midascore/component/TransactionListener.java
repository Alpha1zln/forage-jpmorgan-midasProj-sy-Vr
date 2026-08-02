// package com.jpmc.midascore.component;

// import com.jpmc.midascore.foundation.Transaction;
// import org.springframework.kafka.annotation.KafkaListener;
// import org.springframework.stereotype.Component;

// @Component
// public class TransactionListener {

//     @KafkaListener(
//             topics = "${general.kafka-topic}",
//             groupId = "midas-group"
//     )
//     public void receive(Transaction transaction) {

//         System.out.println(transaction);

//     }
// }


// 3
package com.jpmc.midascore.component;

import com.jpmc.midascore.entity.TransactionRecord;
import com.jpmc.midascore.entity.UserRecord;
import com.jpmc.midascore.foundation.Transaction;
import com.jpmc.midascore.repository.TransactionRepository;
import com.jpmc.midascore.repository.UserRepository;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class TransactionListener {

    private final UserRepository userRepository;
    private final TransactionRepository transactionRepository;

    public TransactionListener(UserRepository userRepository,
                               TransactionRepository transactionRepository) {

        this.userRepository = userRepository;
        this.transactionRepository = transactionRepository;
    }

    @KafkaListener(
            topics = "${general.kafka-topic}",
            groupId = "midas-group"
    )
    public void receive(Transaction transaction) {

        UserRecord sender =
                userRepository.findById(transaction.getSenderId()).orElse(null);

        UserRecord recipient =
                userRepository.findById(transaction.getRecipientId()).orElse(null);

        if (sender == null || recipient == null)
            return;

        if (sender.getBalance() < transaction.getAmount())
            return;

        sender.setBalance(sender.getBalance() - transaction.getAmount());

        recipient.setBalance(recipient.getBalance() + transaction.getAmount());

        userRepository.save(sender);

        userRepository.save(recipient);

        transactionRepository.save(
                new TransactionRecord(
                        sender,
                        recipient,
                        transaction.getAmount()
                )
        );
    }
}
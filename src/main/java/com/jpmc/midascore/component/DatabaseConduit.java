// package com.jpmc.midascore.component;

// import com.jpmc.midascore.entity.UserRecord;
// import com.jpmc.midascore.repository.UserRepository;
// import org.springframework.stereotype.Component;

// @Component
// public class DatabaseConduit {
//     private final UserRepository userRepository;

//     public DatabaseConduit(UserRepository userRepository) {
//         this.userRepository = userRepository;
//     }

//     public void save(UserRecord userRecord) {
//         userRepository.save(userRecord);
//     }

// }



// task 3
package com.jpmc.midascore.component;

import com.jpmc.midascore.entity.TransactionRecord;
import com.jpmc.midascore.entity.UserRecord;
import com.jpmc.midascore.foundation.Transaction;
import com.jpmc.midascore.repository.TransactionRepository;
import com.jpmc.midascore.repository.UserRepository;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class DatabaseConduit {

    private final UserRepository userRepository;
    private final TransactionRepository transactionRecordRepository;

    public DatabaseConduit(UserRepository userRepository, TransactionRepository transactionRecordRepository) {
        this.userRepository = userRepository;
        this.transactionRecordRepository = transactionRecordRepository;
    }

    public void save(@NonNull UserRecord userRecord) {
        userRepository.save(userRecord);
    }

    @Transactional
    public void processTransaction(Transaction transaction) {

        UserRecord sender = userRepository
                .findById(transaction.getSenderId())
                .orElse(null);

        UserRecord recipient = userRepository
                .findById(transaction.getRecipientId())
                .orElse(null);

        if (sender != null && recipient != null && sender.getBalance() >= transaction.getAmount()) {
            sender.setBalance(sender.getBalance() - transaction.getAmount());
            recipient.setBalance(recipient.getBalance() + transaction.getAmount());

            userRepository.save(sender);
            userRepository.save(recipient);

            TransactionRecord transactionRecord = new TransactionRecord(sender, recipient, transaction.getAmount());
            transactionRecordRepository.save(transactionRecord);
        }
    }
}
package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.ArrayList;

@Configuration
public class CustomerConfig {

    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private TransactionRepo transactionRepo;

    // remember to change ids to int
    Transaction t1 = new Transaction(1, 50.00d, "16/07/2024", 1, 2);
    Transaction t2 = new Transaction(2, 50.00d, "15/07/2024", 1, 2);
    Transaction t3 = new Transaction(3, 50.00d, "14/07/2024", 1, 2);

    //ArrayList<Transaction> pastTransactions = new ArrayList<Transaction>();
    /* Card c1 = new Card("Divine Wodi", "1234567890987654", "11/26", "123");
    Card c2 = new Card("Mya Kelly", "0987654321234567", "04/26", "456"); */
    
    
    @Bean
    CommandLineRunner intialiseDatabase(){
        /*pastTransactions.add(t1);
        pastTransactions.add(t2);
        pastTransactions.add(t3);*/
        return args -> {
            customerRepo.save(new Customer(1, "divine", false, "debit", "12-34-56", "12345678", "iban", "bic", 50.00d));
            customerRepo.save(new Customer(2, "Mya", false, "credit", "09-87-65", "09876543", "iban", "bic", 300.00d));
            transactionRepo.save(t1);
            transactionRepo.save(t2);
            transactionRepo.save(t3);
        };
    }
    
}

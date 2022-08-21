package dev.graphql.accounts.repository;

import dev.graphql.accounts.model.Transactions;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class TransactionRepository {

    private List<Transactions> transactionList = new ArrayList<>();

    public List<Transactions> findAll() {
        return transactionList;
    }


    public List<Transactions> findByAccountNumber(String accountNumber) {
        return (List<Transactions>) transactionList.stream()
                .filter(transactions -> transactions.getAccountNumber().equals(accountNumber))
                .toList();
             //   .orElseThrow(() -> new RuntimeException("Transactions not found"));
    }

    @PostConstruct
    private void init() {
        transactionList.add(new Transactions(1111,1000.0,995.0,"54223",5.0,"Credit","011", "P2P", new Date(), "JOD"));
        transactionList.add(new Transactions(2222,1000.0,995.0,"54223",5.0,"Credit","011", "P2P", new Date(), "JOD"));
        System.out.println("transactionList: "+transactionList.toString());
    }

}

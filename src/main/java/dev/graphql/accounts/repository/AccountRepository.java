package dev.graphql.accounts.repository;

import dev.graphql.accounts.model.Account;
import dev.graphql.accounts.model.Balances;
import dev.graphql.accounts.model.Transactions;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
@Repository
public class AccountRepository {

    private final TransactionRepository transactionRepository;
    private List<Account> accounts = new ArrayList<>();

    public AccountRepository(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public List<Account> findAll() {
        return accounts;
    }

    public Account findOne(Integer accountNumber) {
        return accounts.stream().filter(account -> account.getAccountNumber() == accountNumber).findFirst().orElseThrow(() -> new RuntimeException("Account not found"));
    }

    Transactions transactions = new Transactions();
    List<Transactions> transactionsList = new ArrayList<>();

    @PostConstruct
    private void init() {
        accounts.add(new Account(1111, "1111111", "SwiftCode", "ArabBank", new Date() , new Date(), 2.0, "Active", "JOD", "P001", new Balances(1000.0,1000.0,0.0,1000.0, new Date()), transactionRepository.findByAccountNumber("1111")));
        accounts.add(new Account(2222, "2222222", "SwiftCode", "ArabBank", new Date() , new Date(), 2.0, "Active", "JOD", "P001", new Balances(1000.0,1000.0,0.0,1000.0, new Date()), transactionsList));
        accounts.add(new Account(3333, "3333333", "SwiftCode", "ArabBank", new Date() , new Date(), 2.0, "Active", "JOD", "P001", new Balances(1000.0,1000.0,0.0,1000.0, new Date()), transactionsList));

        System.out.println("accounts: "+accounts.toString());
    }

}
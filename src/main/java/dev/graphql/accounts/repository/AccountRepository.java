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
        return accounts.stream().filter(account -> account.getAccountNumber().equals(accountNumber)).findFirst().orElseThrow(() -> new RuntimeException("Account not found"));
    }

    Transactions transactions = new Transactions();
    List<Transactions> transactionsList = new ArrayList<>();

    @PostConstruct
    private void init() {
        accounts.add(new Account(199432, "1994321111111", "SwiftCode", "ArabBank", new Date() , new Date(), 2.0, "Active", "JOD", "LOAN", new Balances(132.0,132.0,0.0,132.0, new Date()), transactionRepository.findByAccountNumber("1111")));
        accounts.add(new Account(199433, "1994322222222", "SwiftCode", "ArabBank", new Date() , new Date(), 2.0, "Active", "JOD", "ACCOUNT", new Balances(5200.0,5200.0,0.0,5200.0, new Date()), transactionsList));
        accounts.add(new Account(199434, "1994323333333", "SwiftCode", "ArabBank", new Date() , new Date(), 2.0, "Active", "JOD", "DEPOSIT", new Balances(1923.0,1923.0,0.0,1923.0, new Date()), transactionsList));
        accounts.add(new Account(199435, "1994341111111", "SwiftCode", "ArabBank", new Date() , new Date(), 2.0, "Active", "JOD", "LOAN", new Balances(12.0,12.0,0.0,32.0, new Date()), transactionRepository.findByAccountNumber("1111")));
        accounts.add(new Account(199436, "1994342222222", "SwiftCode", "ArabBank", new Date() , new Date(), 2.0, "Active", "JOD", "ACCOUNT", new Balances(500.0,520.0,0.0,500.0, new Date()), transactionsList));
        accounts.add(new Account(199447, "1994343433333", "SwiftCode", "ArabBank", new Date() , new Date(), 2.0, "Active", "JOD", "DEPOSIT", new Balances(13.0,13.0,0.0,13.0, new Date()), transactionsList));
        accounts.add(new Account(199446, "1994343533333", "SwiftCode", "ArabBank", new Date() , new Date(), 2.0, "Active", "JOD", "DEPOSIT", new Balances(193.0,193.0,0.0,193.0, new Date()), transactionsList));
        accounts.add(new Account(199445, "1994343633333", "SwiftCode", "ArabBank", new Date() , new Date(), 2.0, "Active", "JOD", "DEPOSIT", new Balances(93.0,93.0,0.0,93.0, new Date()), transactionsList));
        accounts.add(new Account(199444, "1994343733333", "SwiftCode", "ArabBank", new Date() , new Date(), 2.0, "Active", "JOD", "DEPOSIT", new Balances(193.0,193.0,0.0,193.0, new Date()), transactionsList));
        System.out.println("accounts: "+accounts.toString());
    }

}

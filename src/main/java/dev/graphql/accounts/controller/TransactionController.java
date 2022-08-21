package dev.graphql.accounts.controller;

import dev.graphql.accounts.model.Transactions;
import dev.graphql.accounts.repository.TransactionRepository;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class TransactionController {

    private final TransactionRepository transactionRepository;

    public TransactionController(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @QueryMapping
    public List<Transactions> allTransactions() {
        return transactionRepository.findAll();
    }

}

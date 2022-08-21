package dev.graphql.accounts.controller;

import dev.graphql.accounts.model.Account;
import dev.graphql.accounts.repository.AccountRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class AccountController {

    private final AccountRepository accountRepository;

    public AccountController(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @SchemaMapping(typeName = "Query",value = "allAccounts")
    public List<Account> findAll() {
        return accountRepository.findAll();
    }

    @QueryMapping
    public Account findOne(@Argument Integer id) {
        return accountRepository.findOne(id);
    }
}

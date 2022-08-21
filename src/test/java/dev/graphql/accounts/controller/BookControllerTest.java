///*
//package dev.graphql.accounts.controller;
//
//
//import dev.graphql.accounts.model.Account;
//import dev.graphql.accounts.repository.AccountRepository;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.graphql.GraphQlTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.graphql.test.tester.GraphQlTester;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.when;
//
//@GraphQlTest(AccountController.class)
//class AccountControllerTest {
//
//    @Autowired
//    private GraphQlTester graphQlTester;
//
//    @MockBean
//    private AccountRepository accountRepository;
//
//    private final List<Account> accounts = new ArrayList<>();
//
//    @Test
//    public void contextLoads() {
//        assertNotNull(graphQlTester);
//        assertNotNull(accountRepository);
//    }
//
//    @BeforeEach
//    void setUp() {
//        var josh = new Author(1,"Josh","Long");
//        var mark = new Author(2,"Mark","Heckler");
//        var greg = new Author(3,"Greg","Turnquist");
//        accounts.add(new Account(1,"Reactive Spring", 484, Rating.FIVE_STARS, josh));
//        accounts.add(new Account(2,"Spring Boot Up & Running", 328, Rating.FIVE_STARS, mark));
//        accounts.add(new Account(3,"Hacking with Spring Boot 2.3", 392, Rating.FIVE_STARS, greg));
//    }
//
//    @Test
//    void testFindAllBooksQueryReturnsAllBooks() {
//        String document = """
//            query {
//                allBooks {
//                    id
//                    title
//                }
//            }
//        """;
//
//        when(accountRepository.findAll()).thenReturn(accounts);
//
//        graphQlTester.document(document)
//                .execute()
//                .path("allBooks")
//                .entityList(Account.class)
//                .hasSize(3);
//    }
//
//}*/

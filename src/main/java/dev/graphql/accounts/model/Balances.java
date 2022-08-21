package dev.graphql.accounts.model;


import java.util.Date;

public class Balances {
    public Double outstandingBalance;
    public Double currentBalance;
    public Double holdAmount;
    public Double closingBalance;
    public Date closingBalanceDate;

    public Balances(Double outstandingBalance, Double currentBalance, Double holdAmount, Double closingBalance, Date closingBalanceDate) {
        this.outstandingBalance = outstandingBalance;
        this.currentBalance = currentBalance;
        this.holdAmount = holdAmount;
        this.closingBalance = closingBalance;
        this.closingBalanceDate = closingBalanceDate;
    }
}

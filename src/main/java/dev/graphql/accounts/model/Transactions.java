package dev.graphql.accounts.model;

import java.util.Date;

public class Transactions {
    public Integer accountNumber;
    public Double previousBalance;
    public Double currentBalance;
    public String transactionId;
    public Double transactionAmount;
    public String transactionType;
    public String transactionCode;
    public String transactionDescription;
    public Date transactionDate;
    public String transactionCurrency;

    public Transactions() {
    }

    public Transactions(Integer accountNumber, Double previousBalance, Double currentBalance, String transactionId, Double transactionAmount, String transactionType, String transactionCode, String transactionDescription, Date transactionDate, String transactionCurrency) {
        this.accountNumber = accountNumber;
        this.previousBalance = previousBalance;
        this.currentBalance = currentBalance;
        this.transactionId = transactionId;
        this.transactionAmount = transactionAmount;
        this.transactionType = transactionType;
        this.transactionCode = transactionCode;
        this.transactionDescription = transactionDescription;
        this.transactionDate = transactionDate;
        this.transactionCurrency = transactionCurrency;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getPreviousBalance() {
        return previousBalance;
    }

    public void setPreviousBalance(Double previousBalance) {
        this.previousBalance = previousBalance;
    }

    public Double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(Double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(Double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getTransactionCode() {
        return transactionCode;
    }

    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    }

    public String getTransactionDescription() {
        return transactionDescription;
    }

    public void setTransactionDescription(String transactionDescription) {
        this.transactionDescription = transactionDescription;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionCurrency() {
        return transactionCurrency;
    }

    public void setTransactionCurrency(String transactionCurrency) {
        this.transactionCurrency = transactionCurrency;
    }

    @Override
    public String toString() {
        return "Transactions{" +
                "accountNumber=" + accountNumber +
                ", previousBalance=" + previousBalance +
                ", currentBalance=" + currentBalance +
                ", transactionId='" + transactionId + '\'' +
                ", transactionAmount=" + transactionAmount +
                ", transactionType='" + transactionType + '\'' +
                ", transactionCode='" + transactionCode + '\'' +
                ", transactionDescription='" + transactionDescription + '\'' +
                ", transactionDate=" + transactionDate +
                ", transactionCurrency='" + transactionCurrency + '\'' +
                '}';
    }
}

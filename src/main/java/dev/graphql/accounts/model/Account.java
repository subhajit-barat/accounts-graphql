package dev.graphql.accounts.model;


import java.util.Date;
import java.util.List;

public class Account {

    public Integer accountNumber;
    public String iban;
    public String swiftCode;
    public String bankName;
    public Date openingDate;
    public Date closingDate;
    public Double interestRate;
    public String accountStatus;
    public String currency;
    public String productCode;
    public Balances balances;
    //public List<LifeCyles> accountStatusLifeCycles;
    //public List<Capabilities> capabilities;
    public List<Transactions> transactions;


    public Account() {
    }

    public Account(Integer accountNumber, String iban, String swiftCode, String bankName, Date openingDate, Date closingDate, Double interestRate, String accountStatus, String currency, String productCode, Balances balances, List<Transactions> transactions) {
        this.accountNumber = accountNumber;
        this.iban = iban;
        this.swiftCode = swiftCode;
        this.bankName = bankName;
        this.openingDate = openingDate;
        this.closingDate = closingDate;
        this.interestRate = interestRate;
        this.accountStatus = accountStatus;
        this.currency = currency;
        this.productCode = productCode;
        this.balances = balances;
        this.transactions = transactions;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getSwiftCode() {
        return swiftCode;
    }

    public void setSwiftCode(String swiftCode) {
        this.swiftCode = swiftCode;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Date getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(Date openingDate) {
        this.openingDate = openingDate;
    }

    public Date getClosingDate() {
        return closingDate;
    }

    public void setClosingDate(Date closingDate) {
        this.closingDate = closingDate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public Balances getBalances() {
        return balances;
    }

    public void setBalances(Balances balances) {
        this.balances = balances;
    }

    public List<Transactions> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transactions> transactions) {
        this.transactions = transactions;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", iban='" + iban + '\'' +
                ", swiftCode='" + swiftCode + '\'' +
                ", bankName='" + bankName + '\'' +
                ", openingDate=" + openingDate +
                ", closingDate=" + closingDate +
                ", interestRate=" + interestRate +
                ", accountStatus='" + accountStatus + '\'' +
                ", currency='" + currency + '\'' +
                ", productCode='" + productCode + '\'' +
                ", balances=" + balances +
                ", transactions=" + transactions +
                '}';
    }
}

package com.example.demo;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {

    @Id
    private int custID;

    private String custName;

    private boolean accountBlocked;

    private String acctType;

    private String sortCode;

    private String acctNum;

    private String iban;

    private String bic;

    private double balance;

    private List<Transaction> transactions;

    private Card card;

    public Customer(int custID, String custName, boolean accountBlocked, String acctType, String sortCode,
                    String acctNum, String iban, String bic, double balance, List<Transaction> customerTransactions, Card card) {
        this.custID = custID;
        this.custName = custName;
        this.accountBlocked=accountBlocked;
        this.acctType=acctType;
        this.sortCode=sortCode;
        this.acctNum=acctNum;
        this.iban=iban;
        this.bic=bic;
        this.balance=balance;
        this.transactions = customerTransactions;
        this.card = card;
    }

    public String getAcctType() {return this.acctType;}
    public String getSortCode() {return this.sortCode;}
    public String getAcctNum() {return this.acctNum;}
    public String getIban() {return this.iban;}
    public String getBic() {return this.bic;}
    public List<Transaction> getTransactions(){ return this.transactions; }
    public Card getCard(){ return this.card; }
    public int getCustID() {
        return this.custID;
    }
    public String getCustName() {
        return this.custName;
    }
    public boolean getBlockedStatus() {
        return this.accountBlocked;
    }
    public double getBalance(){return this.balance;}

    public void setAcctType(String acctType) {this.acctType=acctType;}
    public void setSortCode(String sortCode) {this.sortCode=sortCode;}
    public void setAcctNum(String acctNum){this.acctNum=acctNum;}
    public void setIban(String iban){this.iban=iban;}
    public void setBic(String bic){this.bic=bic;}
    public void setBlockedStatus(boolean accountBlocked){
        this.accountBlocked=accountBlocked;
    }
    public void setCustID(int custID) {this.custID = custID; }
    public void setCustName(String custName) {this.custName = custName;
    }
    public void setBalance(double balance){this.balance=balance;}

}

package com.example.demo;

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

    public Customer(int custID, String custName, boolean accountBlocked, String acctType, String sortCode,
                    String acctNum, String iban, String bic, double balance) {
        this.custID = custID;
        this.custName = custName;
        this.accountBlocked=accountBlocked;
        this.acctType=acctType;
        this.sortCode=sortCode;
        this.acctNum=acctNum;
        this.iban=iban;
        this.bic=bic;
        this.balance=balance;
    }

    public String getAcctType() {return acctType;}
    public String getSortCode() {return sortCode;}
    public String getAcctNum() {return acctNum;}
    public String getIban() {return iban;}
    public String getBic() {return bic;}
    public int getCustID() {
        return custID;
    }
    public String getCustName() {
        return custName;
    }
    public boolean getBlockedStatus() {
        return accountBlocked;
    }
    public double getBalance(){return balance;}

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

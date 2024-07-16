package com.example.demo;

public class Card {
    private String nameOnCard;

    private String cardNumber;

    private String expiryDate;
    
    private String CVV;

    public Card(String nameOnCard, String cardNumber, String expiryDate, String CVV){
        this.nameOnCard = nameOnCard;
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.CVV = CVV;
    }

    public String getName(){ return this.nameOnCard; }
    public String getCardNumber(){ return this.cardNumber; }
    public String getExpiryDate(){ return this.expiryDate; }
    public String getCVV(){ return this.CVV; }

    public void setName(String name){ this.nameOnCard = name; }
    public void setCardNumber(String number){ this.cardNumber = number; }
    public void setExpiryDate(String date){ this.expiryDate = date; }
    public void setCVV(String CVV){ this.CVV = CVV; }
}

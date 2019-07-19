package com.example.harjoitustyo;

import java.util.ArrayList;

public class Account {

    private String number;
    private int balance;
    private int limit;


    ArrayList<AccountEvent> accountEvents;

    public Account( String number, int balance, int limit) {
        this.number = number;
        this.balance = balance;
        this.limit = limit;
        this.accountEvents = new ArrayList<AccountEvent>();
    }



    public String getNumber() {
        return number;
    }

    public int getBalance() {
        return balance;
    }

    public int getLimit() {
        return limit;
    }

    public ArrayList<AccountEvent> getAccountEvents() {
        return accountEvents;
    }



    public void setNumber(String number) {
        this.number = number;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public void setAccountEvents(ArrayList<AccountEvent> accountEvents) {
        this.accountEvents = accountEvents;
    }
}

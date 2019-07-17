package com.example.harjoitustyo;

import java.util.ArrayList;

public class Account {

    private int id;
    private String type;
    private int number;
    private int balance;
    private int limit;


    ArrayList<AccountEvent> accountEvents;

    public Account(int id, String type, int number, int balance, int limit, ArrayList<AccountEvent> accountEvents) {
        this.id = id;
        this.type = type;
        this.number = number;
        this.balance = balance;
        this.limit = limit;
        this.accountEvents = accountEvents;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public int getNumber() {
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

    public void setId(int id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setNumber(int number) {
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

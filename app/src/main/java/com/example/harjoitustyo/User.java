package com.example.harjoitustyo;

import java.util.ArrayList;

public class User {
    private String username;
    private String email;
    private String password;

    ArrayList<Account> accountList;

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
        accountList = new ArrayList<Account>();
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public ArrayList<Account> getAccountList() {
        return accountList;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAccauntList(ArrayList<Account> accountList) {
        this.accountList = accountList;
    }
}


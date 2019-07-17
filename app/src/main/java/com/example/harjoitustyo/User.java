package com.example.harjoitustyo;

import java.util.ArrayList;

public class User {
    private int id;
    private String username;
    private String email;
    private String password;

    ArrayList<Account> accauntList;

    public User(String username, String email, String password, ArrayList<Account> accauntList) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.accauntList = accauntList;
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

    public ArrayList<Account> getAccauntList() {
        return accauntList;
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

    public void setAccauntList(ArrayList<Account> accauntList) {
        this.accauntList = accauntList;
    }
}


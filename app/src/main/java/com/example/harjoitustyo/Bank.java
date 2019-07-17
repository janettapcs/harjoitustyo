package com.example.harjoitustyo;

import java.util.ArrayList;

public class Bank {

    private int id;
    private String name;
    private String address;
    private String country;

    ArrayList<User> userList;

    public Bank(int id, String name, String address, String country, ArrayList<User> userList) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.country = country;
        this.userList = userList;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCountry() {
        return country;
    }

    public ArrayList<User> getUserList() {
        return userList;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }
}

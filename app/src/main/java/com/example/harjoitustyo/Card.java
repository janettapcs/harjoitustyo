package com.example.harjoitustyo;

public class Card {

    private int id;
    private String name;
    private int limit;

    public Card(int id, String name, int limit) {
        this.id = id;
        this.name = name;
        this.limit = limit;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getLimit() {
        return limit;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}

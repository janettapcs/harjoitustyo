package com.example.harjoitustyo;

public class AccountEvent {

    private int id;
    private String source;
    private String target;
    private int quantity;
    private String type;

    public AccountEvent(int id, String source, String target, int quantity, String type) {
        this.id = id;
        this.source = source;
        this.target = target;
        this.quantity = quantity;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getSource() {
        return source;
    }

    public String getTarget() {
        return target;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getType() {
        return type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setType(String type) {
        this.type = type;
    }
}

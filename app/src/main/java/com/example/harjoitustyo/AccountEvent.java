package com.example.harjoitustyo;

public class AccountEvent {

    private int id;
    private String source;
    private String target;
    private int quantity;
    private String type;
    private String message;

    public AccountEvent(int id, String source, String target, int quantity, String type, String message) {
        this.id = id;
        this.source = source;
        this.target = target;
        this.quantity = quantity;
        this.type = type;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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

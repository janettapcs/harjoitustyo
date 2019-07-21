package com.example.harjoitustyo;

public class AccountEvent {

    private String source;
    private String target;
    private String quantity;
    private String type;
    private String message;
    private String name;

    public AccountEvent(String source, String target, String quantity, String type, String message) {

        this.source = source;
        this.target = target;
        this.quantity = quantity;
        this.type = type;
        this.message = message;
    }

    public AccountEvent(String target, String quantity, String type) {
        this.target = target;
        this.quantity = quantity;
        this.type = type;
    }

    public AccountEvent(String source, String target, String quantity, String type) {
        this.source = source;
        this.target = target;
        this.quantity = quantity;
        this.type = type;
    }

    public AccountEvent(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public String getSource() {
        return source;
    }

    public String getTarget() {
        return target;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getType() {
        return type;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public void setType(String type) {
        this.type = type;
    }
}

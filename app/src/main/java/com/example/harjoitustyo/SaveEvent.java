package com.example.harjoitustyo;

public class SaveEvent {
    private static final SaveEvent ourInstance = new SaveEvent();

    public static SaveEvent getInstance() {
        return ourInstance;
    }

    private SaveEvent() {
    }
}

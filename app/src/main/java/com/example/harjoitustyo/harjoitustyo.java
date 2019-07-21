package com.example.harjoitustyo;

import android.app.Application;
import android.content.Context;

public class harjoitustyo extends Application{

    private static Context context;

    public void onCreate() {
        super.onCreate();
        com.example.harjoitustyo.harjoitustyo.context = getApplicationContext();
    }

    public static Context getAppContext() {
        return com.example.harjoitustyo.harjoitustyo.context;
    }

}

package com.example.harjoitustyo;

import android.app.Application;
import android.content.Context;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SaveEvent {
    private static final SaveEvent ourInstance = new SaveEvent();

    public static SaveEvent getInstance() {
        return ourInstance;
    }

    private SaveEvent() {
    }

    public boolean saveJson(AccountEvent event, Context context) {

        Gson gson = new Gson();

        String json = gson.toJson(event);
        FileOutputStream f;

        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy_HH:mm:ss");
        String filename = formatter.format(date);

        try {
            f = context.openFileOutput(filename, Context.MODE_PRIVATE);
            f.write(json.getBytes());
            System.out.println("file saved.");
            f.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return true;


    }


}

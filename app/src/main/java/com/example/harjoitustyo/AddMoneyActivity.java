package com.example.harjoitustyo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddMoneyActivity extends AppCompatActivity {

    EditText target;
    EditText quantity;
    EditText message;
    EditText source;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_money);

        target = findViewById(R.id.target);
        source = findViewById(R.id.source);
        quantity = findViewById(R.id.quantity);
        message = findViewById(R.id.message);
    }

    public void onClick(View v) {
        System.out.println("helouu");
    }

    public void addMoney(View v){
        int amount;



    }
}

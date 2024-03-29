package com.example.harjoitustyo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddMoneyActivity extends AppCompatActivity {

    EditText target;
    EditText quantity;
    EditText message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_money);

        target = findViewById(R.id.target);

        quantity = findViewById(R.id.quantity);
        message = findViewById(R.id.message);
    }

    /*saves user inputs to variables and calls addMoney function from Bank class*/
    public void addMoney(View v){
        String targetText = target.getText().toString();
        String quantityText = quantity.getText().toString();
        String messageText = message.getText().toString();

        Bank.getInstance().addMoney(targetText, quantityText);
        /*Creates money deposit event*/
        AccountEvent event = new AccountEvent(targetText, quantityText, "Money deposit");
        /*Saves account transactions in json file format.*/
        SaveEvent.getInstance().saveJson(event, getApplicationContext());

        startActivity(new Intent(AddMoneyActivity.this, MainActivity.class));

    }
}

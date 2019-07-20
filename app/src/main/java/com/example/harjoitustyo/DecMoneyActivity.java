package com.example.harjoitustyo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class DecMoneyActivity extends AppCompatActivity {

    EditText target;
    EditText quantity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dec_money);

        target = findViewById(R.id.client);
        quantity = findViewById(R.id.amount);
    }

    public void decMoney(View v){
        System.out.println("decmoney");
        String targetText = target.getText().toString();
        String quantityText = quantity.getText().toString();

        Bank.getInstance().decMoney(targetText, quantityText);

        startActivity(new Intent(DecMoneyActivity.this, MainActivity.class));


    }
}

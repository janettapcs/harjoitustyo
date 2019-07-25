package com.example.harjoitustyo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateAccountActivity extends AppCompatActivity {


    EditText accountNumber;
    EditText limit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        limit = findViewById(R.id.limit);
        accountNumber = findViewById(R.id.accountNumber);
    }

    public void createAccount(View v) {

        String accountNumberText = accountNumber.getText().toString();
        String limitText = limit.getText().toString();

        Bank.getInstance().createAccount(accountNumberText, limitText, Session.getUser());
        AccountEvent event = new AccountEvent("Account creation", accountNumberText);
        SaveEvent.getInstance().saveJson(event, getApplicationContext());

        startActivity(new Intent(CreateAccountActivity.this, MainActivity.class));

    }
}

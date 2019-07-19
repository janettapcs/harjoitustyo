package com.example.harjoitustyo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateAccountActivity extends AppCompatActivity {

    EditText firstName;
    EditText lastName;
    EditText identityNumber;
    EditText accountNumber;
    EditText limit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        firstName = findViewById(R.id.firstName);
        lastName = findViewById(R.id.lastName);
        identityNumber = findViewById(R.id.identityNumber);
        limit = findViewById(R.id.limit);
        accountNumber = findViewById(R.id.accountNumber);
        System.out.println("heippa");
    }

    public void createAccount(View v) {

    }
}

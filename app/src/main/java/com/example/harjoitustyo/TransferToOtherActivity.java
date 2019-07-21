package com.example.harjoitustyo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class TransferToOtherActivity extends AppCompatActivity {

    EditText target;
    EditText source;
    EditText amount;
    EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer_to_other);

        target = findViewById(R.id.targetTransOther);
        name = findViewById(R.id.nameTransOther);

        source = findViewById(R.id.sourceTransOther);
        amount = findViewById(R.id.amountTransOther);
    }

    public void transferMoneyToOtherAccount(View v){
        String targetText = target.getText().toString();
        String sourceText = source.getText().toString();
        String amountText = amount.getText().toString();
        String nameText = name.getText().toString();

        Bank.getInstance().transMoneyToOther(sourceText, amountText);
        startActivity(new Intent(TransferToOtherActivity.this, MainActivity.class));
    }
}

package com.example.harjoitustyo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class TransferMoneyActivity extends AppCompatActivity {

    EditText target;
    EditText source;
    EditText amount;
    EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer_money);

        target = findViewById(R.id.targetTrans);
        name = findViewById(R.id.nameTrans);

        source = findViewById(R.id.sourceTrans);
        amount = findViewById(R.id.amountTrans);
    }

    public void transferMoney(View v){
        String targetText = target.getText().toString();
        String sourceText = source.getText().toString();
        String amountText = amount.getText().toString();
        String nameText = name.getText().toString();

        Bank.getInstance().transMoney(targetText, sourceText, amountText);
        startActivity(new Intent(TransferMoneyActivity.this, MainActivity.class));
    }
}

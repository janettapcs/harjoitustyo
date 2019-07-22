package com.example.harjoitustyo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class TransferMoneyActivity extends AppCompatActivity {

    EditText target;
    EditText source;
    EditText amount;
    EditText name;

    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer_money);

        target = findViewById(R.id.targetTrans);
        name = findViewById(R.id.nameTrans);

        source = findViewById(R.id.sourceTrans);
        amount = findViewById(R.id.amountTrans);

        Context context = getApplicationContext();
        CharSequence text = "Tilillä ei ole tarpeeksi katetta. Lisää rahaa.";
        int duration = Toast.LENGTH_LONG;

        toast = Toast.makeText(context, text, duration);
    }

    public void transferMoney(View v){
        String targetText = target.getText().toString();
        String sourceText = source.getText().toString();
        String amountText = amount.getText().toString();
        String nameText = name.getText().toString();


        boolean transferSuccess = Bank.getInstance().transMoney(targetText, sourceText, amountText);
        if(!transferSuccess) {
            toast.show();
        } else {
            AccountEvent event = new AccountEvent(sourceText, targetText, amountText, "Money transfer to own account.");
            SaveEvent.getInstance().saveJson(event, getApplicationContext());

            startActivity(new Intent(TransferMoneyActivity.this, MainActivity.class));
        }

    }
}

package com.example.harjoitustyo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class TransferToOtherActivity extends AppCompatActivity {

    EditText target;
    EditText source;
    EditText amount;
    EditText name;
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer_to_other);

        target = findViewById(R.id.targetTransOther);
        name = findViewById(R.id.nameTransOther);

        source = findViewById(R.id.sourceTransOther);
        amount = findViewById(R.id.amountTransOther);

        Context context = getApplicationContext();
        CharSequence text = "Tilisiirto epäonnistui. Lisää katetta.";
        int duration = Toast.LENGTH_LONG;

        toast = Toast.makeText(context, text, duration);
    }

    public void transferMoneyToOtherAccount(View v){
        String targetText = target.getText().toString();
        String sourceText = source.getText().toString();
        String amountText = amount.getText().toString();
        String nameText = name.getText().toString();



        boolean transferSuccess = Bank.getInstance().transMoneyToOther(sourceText, amountText);
        if(!transferSuccess) {
            toast.show();
        } else {
            AccountEvent event = new AccountEvent(sourceText, targetText, amountText, "Money transfer to external account.");
            SaveEvent.getInstance().saveJson(event, getApplicationContext());

            startActivity(new Intent(TransferToOtherActivity.this, MainActivity.class));
        }

    }
}

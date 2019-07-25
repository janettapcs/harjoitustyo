package com.example.harjoitustyo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class DecMoneyActivity extends AppCompatActivity {

    EditText target;
    EditText quantity;
    Toast toast;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dec_money);

        target = findViewById(R.id.client);
        quantity = findViewById(R.id.amount);

        Context context = getApplicationContext();
        CharSequence text = "Tilillä ei ole tarpeeksi katetta";
        int duration = Toast.LENGTH_LONG;

        toast = Toast.makeText(context, text, duration);
    }

    /*saves user inputs to variables and calls decMoney function from Bank class*/
    public void decMoney(View v){
        String targetText = target.getText().toString();
        String quantityText = quantity.getText().toString();

        boolean decMoneySuccess = Bank.getInstance().decMoney(targetText, quantityText);
        //if balance is not enough
        if(!decMoneySuccess){
            toast.show();
        }
        else {
            AccountEvent event = new AccountEvent(targetText, quantityText, "Money withdraw");
            SaveEvent.getInstance().saveJson(event, getApplicationContext());
            startActivity(new Intent(DecMoneyActivity.this, MainActivity.class));
        }




    }
}

package com.example.cardview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.cardview.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View rootView = mainBinding.getRoot();
        setContentView(rootView);

        mainBinding.cardScheduler.setOnClickListener(this);
        mainBinding.cardSms.setOnClickListener(this);
        mainBinding.cardAlarm.setOnClickListener(this);
        mainBinding.cardPhone.setOnClickListener(this);
        mainBinding.cardAnchor.setOnClickListener(this);
        mainBinding.cardHook.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.card_alarm:
                Toast.makeText(this, "Card Alarm", Toast.LENGTH_SHORT).show();
                break;

            case R.id.card_scheduler:
                Toast.makeText(this, "Card Scheduler", Toast.LENGTH_SHORT).show();
                break;

            case R.id.card_sms:
                Toast.makeText(this, "Card SMS", Toast.LENGTH_SHORT).show();
                break;

            case R.id.card_phone:
                Toast.makeText(this, "Card Phone", Toast.LENGTH_SHORT).show();
                break;

            case R.id.card_anchor:
                Toast.makeText(this, "Card Anchor", Toast.LENGTH_SHORT).show();
                break;

            case R.id.card_hook:
                Toast.makeText(this, "Card Hook", Toast.LENGTH_SHORT).show();
                break;

        }


    }
}
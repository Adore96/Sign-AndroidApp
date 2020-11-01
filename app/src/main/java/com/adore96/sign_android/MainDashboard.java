package com.adore96.sign_android;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainDashboard extends AppCompatActivity implements View.OnClickListener {

    private CardView liveFeed, imageTrans, videoTrans, generalSigns, aboutApp, contactAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dashboard);

        liveFeed = (CardView) findViewById(R.id.livefeed);
        imageTrans = (CardView) findViewById(R.id.imageTrans);
        videoTrans = (CardView) findViewById(R.id.videoTrans);
        generalSigns = (CardView) findViewById(R.id.generalSigns);
        aboutApp = (CardView) findViewById(R.id.aboutApp);
        contactAuth = (CardView) findViewById(R.id.contactAuth);

        liveFeed.setOnClickListener(this);
        imageTrans.setOnClickListener(this);
        videoTrans.setOnClickListener(this);
        generalSigns.setOnClickListener(this);
        aboutApp.setOnClickListener(this);
        contactAuth.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        Intent i;

        switch (view.getId()) {
            case R.id.livefeed:
                i = new Intent(this, liveFeed.class);
                startActivity(i);
                break;

            case R.id.imageTrans:
                i = new Intent(this, MainActivity.class);
                startActivity(i);
                break;

            case R.id.videoTrans:
                i = new Intent(this, videoTrans.class);
                startActivity(i);
                break;

            case R.id.generalSigns:
                i = new Intent(this, generalSigns.class);
                startActivity(i);
                break;
            case R.id.aboutApp:
                i = new Intent(this, aboutApp.class);
                startActivity(i);
                break;
            case R.id.contactAuth:
                i = new Intent(this, com.adore96.sign_android.contactAuth.class);
                startActivity(i);
                break;
            default:
                break;

        }
    }
}
package com.adore96.sign_android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainDashboard extends AppCompatActivity implements View.OnClickListener{

    private CardView liveFeed,imageTrans,videoTrans,generalSigns,openGallery,contactAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dashboard);

        liveFeed = (CardView) findViewById(R.id.livefeed);
        imageTrans = (CardView) findViewById(R.id.imageTrans);
        videoTrans = (CardView) findViewById(R.id.videoTrans);
        generalSigns = (CardView) findViewById(R.id.generalSigns);
        openGallery = (CardView) findViewById(R.id.openGallery);
        contactAuth = (CardView) findViewById(R.id.contactAuth);

        liveFeed.setOnClickListener(this);
        imageTrans.setOnClickListener(this);
        videoTrans.setOnClickListener(this);
        generalSigns.setOnClickListener(this);
        openGallery.setOnClickListener(this);
        contactAuth.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        Intent i ;

        switch (view.getId()){
            case R.id.livefeed :
                i = new Intent(this,liveFeed.class);
                startActivity(i);
                break;

            case R.id.image :
                i = new Intent(this,ImagePred.class);
                startActivity(i);
                break;

            case R.id.video :
                i = new Intent(this,VideoPred.class);
                startActivity(i);
                break;

            case R.id.general :
                i = new Intent(this,GeneralInfo.class);
                startActivity(i);
                break;
            default:
                break;

        }
    }
}
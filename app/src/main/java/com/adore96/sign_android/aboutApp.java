package com.adore96.sign_android;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class aboutApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_app);

    }

    public void goToAnActivity(View view) {
        Intent intent = new Intent(this, contributions.class);
        startActivity(intent);
    }
}
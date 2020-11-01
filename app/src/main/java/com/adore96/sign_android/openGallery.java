package com.adore96.sign_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class openGallery extends AppCompatActivity {

    private static final int SELECT_PICTURE = 1;

    private String selectedImagePath;
//    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_gallery);
    }
}
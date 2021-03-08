package com.example.buraik_midt1;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

public class Activity4 extends AppCompatActivity {

    MediaPlayer mpanimalsound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        mpanimalsound = new MediaPlayer();

        mpanimalsound = MediaPlayer.create(this, R.raw.happy);
        mpanimalsound.start();

    }
}
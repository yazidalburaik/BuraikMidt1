package com.example.buraik_midt1;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class First extends AppCompatActivity {
    MediaPlayer sound;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        final Button a1toa2 = (Button) findViewById(R.id.bttn_1to2);
        final Button a1toa3 = (Button) findViewById(R.id.bttn_1to3);
        final ImageView cat = (ImageView) findViewById(R.id.catpic);

        a1toa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1tos2 = new Intent(First.this,Activity2.class);
                startActivity(s1tos2);
            }
        });

        a1toa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1tos3 = new Intent(First.this,Activity3.class);
                startActivity(s1tos3);
            }
        });

        cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound= MediaPlayer.create(First.this, R.raw.meow);
                sound.start();


                // Mp3filename.MediaPlayer.create(YourActivity.this, R.raw.mp3filenam
                // Then MpName.start();
            }
        });




    }
}
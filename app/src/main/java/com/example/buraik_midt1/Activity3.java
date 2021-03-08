package com.example.buraik_midt1;



import androidx.appcompat.app.AppCompatActivity;




import androidx.appcompat.app.AppCompatActivity;
import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

public class Activity3 extends ListActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main3);
        setTitle("You are in Activity3");

        String[] attraction = {
                "First Item",
                "Second Item",
                "Third Item",
                "Fourth Item",
                "Fifth Item",
                "GO TO ACT 1",
                "GO TO ACT 2"};

        setListAdapter(new ArrayAdapter<String>(this,R.layout.activity_3,R.id.travel,attraction));

    }

    protected void onListItemClick(
            ListView l, View v, int position, long id){
        super.onListItemClick(l,v,position,id);

        switch(position) {
            case 0:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://alfaisal.edu")));
                break;

            case 1:

            startActivity(new Intent(Activity3.this, Activity4.class));
            break;

            case 2:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://amazon.com")));
                break;

            case 3:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://apple.com")));
                break;

            case 4:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com")));
                break;

            case 5:
                startActivity(new Intent(Activity3.this, First.class));
                break;

            case 6:
                startActivity(new Intent(Activity3.this, Activity2.class));
                break;
        }

    }

}
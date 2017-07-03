package com.example.application.cyclistapp;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import stanford.androidlib.SimpleActivity;

public class MainActivity extends SimpleActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void radioClick(View view){
        ImageView img = (ImageView)findViewById(R.id.cyclist_image);

        int id = view.getId();
        if (id == R.id.greg_button){

            img.setImageResource(R.drawable.gregvanavermaet);

        }else if (id == R.id.peter_button){

            img.setImageResource(R.drawable.petersagan);

        } else if (id == R.id.philippe_button){

            img.setImageResource(R.drawable.philippegilbert);

        }else if (id == R.id.tom_button){

            img.setImageResource(R.drawable.tomboonen );

        }

    }
}

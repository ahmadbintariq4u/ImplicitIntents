package com.example.implicit_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void action(View view){


        switch (view.getId()){

            case R.id.chrome:{
                Intent intent=new Intent(Intent.ACTION_VIEW);
            }
            break;

        }



    }



}
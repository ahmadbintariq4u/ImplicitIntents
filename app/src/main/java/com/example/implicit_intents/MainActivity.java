package com.example.implicit_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void action(View view){

        Intent intent;
        switch (view.getId()){

            case R.id.chrome:{
                intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=HEf_xrgmuRI"));
                startActivity(intent);
            }
            break;

            case R.id.dial:{
                intent=new Intent(Intent.ACTION_VIEW,Uri.parse("tel:03039089804"));
                startActivity(intent);
            }
            break;

            case R.id.map:{

                Uri gmmIntentUri = Uri.parse("google.streetview:cbll=46.414382,10.013988");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
            break;

            case R.id.activity:{

                intent=new Intent(this,Whatsapp_Msg.class);
                startActivity(intent);

            }
            break;



        }


    }

}
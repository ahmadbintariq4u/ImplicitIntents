package com.example.implicit_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Whatsapp_Msg extends AppCompatActivity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whatsapp__msg);

        text = findViewById(R.id.msg);
    }


    public void share(View view) {

        String data = text.getText().toString();
        Intent whatsappIntent = new Intent(Intent.ACTION_SEND);
        whatsappIntent.setType("text/plain");
        whatsappIntent.setPackage("com.Fmwhatsapp");
        whatsappIntent.putExtra(Intent.EXTRA_TEXT, data);
        try {

            startActivity(whatsappIntent);

        } catch (android.content.ActivityNotFoundException ex) {

            Toast.makeText(getApplicationContext(), "Whatsap not installed", Toast.LENGTH_SHORT).show();

        }


    }

}
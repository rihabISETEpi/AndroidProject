package com.example.miniprojet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.*;
import android.widget.Button;

public class Formulaire extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulaire);
        Button button1 = (Button) findViewById(R.id.button2);

        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {   Intent i = new Intent(Formulaire.this,FomDataPro.class);
                startActivity(i);

            }   });
    }
}
package com.example.uaspemrogramanmobil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pendaftaran extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pendaftaran);

        final Button button = (Button) findViewById(R.id.btnMenu);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
// Perform action on click
                Intent activityChangeIntent = new Intent(Pendaftaran.this, Home.class);

// currentContext.startActivity(activityChangeIntent);

                Pendaftaran.this.startActivity(activityChangeIntent);
            }
        });

    }
}

package com.example.tk3_project_g31;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button bttnMensa, bttnRMV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        bttnMensa = findViewById(R.id.bttnTestMensa);
        bttnRMV = findViewById(R.id.bttnTestRMV);


        bttnMensa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Launch Mensa App
                openMensaApp();
            }
        });

        bttnRMV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Launch RMV Departures View
                openRMVDepartures();
            }
        });
    }


    // Open Mensa app if installed, else open link to install it
    public void openMensaApp(){
        Intent intent = getPackageManager().getLaunchIntentForPackage("de.incloud.mensaapp");

        // Checks if Mensa app installed
        if (intent == null){
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=de.incloud.mensaapp"));
        }
        startActivity(intent);
    }


    // Open RMV Departure View
    public void openRMVDepartures(){

        Intent intent = new Intent(this, RMVActivity.class);
        //Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.rmv.de/auskunft/bin/jp/stboard.exe/dn?L=vs_anzeigetafel&cfgfile=DarmstadtA_3024011_1707051365&start=1"));
        startActivity(intent);


    }




}

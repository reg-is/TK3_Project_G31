package com.example.tk3_project_g31;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class RMVActivity extends AppCompatActivity {

    private WebView rmvWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rmv);

        rmvWebView = findViewById(R.id.rmvWebView);
        rmvWebView.setWebViewClient(new WebViewClient());

        // Load next departures from rmv.de and display them
        rmvWebView.loadUrl("https://www.rmv.de/auskunft/bin/jp/stboard.exe/dn?L=vs_anzeigetafel&cfgfile=DarmstadtA_3024011_1707051365&start=1");

        // Departure View can be modified here:
        // https://www.rmv.de/auskunft/bin/jp/stboard.exe/dn?L=vs_anzeigetafel&cfgfile=DarmstadtA_3024011_1707051365&editorMode=edit


        // Enable JavaScript
        rmvWebView.getSettings().setJavaScriptEnabled(true);

        // Change Scale of WebView
        rmvWebView.setInitialScale(200);



    }
}

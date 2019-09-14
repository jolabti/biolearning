package com.corry.biolearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class ContentMateri extends AppCompatActivity {

    WebView wvContent;

    String googleDocs = "https://docs.google.com/gview?embedded=true&url=";

    String sample = "http://biolearn.johannainggolan.site/k5/K5_materi_1.pdf";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_materi);
        wvContent = findViewById(R.id.content_materi_pdf_id);
        Bundle bundle = getIntent().getExtras();

        settingWebView();



        if(bundle.getString(getResources().getString(R.string.intent_identifier))!=null){

            wvContent.loadUrl(googleDocs+bundle.getString(getResources().getString(R.string.intent_identifier)));

        }

        else {

            Toast.makeText(getApplicationContext(),"File tidak ditemukan", Toast.LENGTH_LONG).show();
        }




    }


    private  void settingWebView(){



        wvContent.getSettings().setAllowContentAccess(true);
        wvContent.getSettings().setAllowFileAccess(true);
        wvContent.setWebChromeClient(new WebChromeClient());
        wvContent.setWebViewClient(new WebViewClient());
        wvContent.getSettings().setJavaScriptEnabled(true);



    }
}

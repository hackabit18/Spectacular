package com.example.akhilbatchu.makearecipe;
import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.Toast;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class Main3Activity extends AppCompatActivity {

    WebView MyWebView;
    ProgressBar pb;
    private ValueCallback<Uri> mUploadMessage;
    private final static int FILECHOOSER_RESULTCODE = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        if(cm.getActiveNetworkInfo()==null)
        {
                Toast.makeText(getApplicationContext(),"Please Switch on your Mobile data ",Toast.LENGTH_LONG).show();


        }

        else if(cm.getActiveNetworkInfo()!=null)
        {
            check();
        }

    }

    public void check()
    {
        pb = (ProgressBar) findViewById(R.id.progress);
        pb.setVisibility(View.VISIBLE);
        pb.getIndeterminateDrawable().setColorFilter(Color.rgb(255, 128, 0), PorterDuff.Mode.MULTIPLY);

        MyWebView = (WebView) findViewById(R.id.webss);
        MyWebView.setWebViewClient(new MyWebViewClient());
        MyWebView.setWebChromeClient(new WebChromeClient() {
            //The undocumented magic method override
            //Eclipse will swear at you if you try to put @Override here


            public void openFileChooser(ValueCallback<Uri> uploadMsg) {
                Main3Activity.this.showAttachmentDialog(uploadMsg);
            }

            // For Android > 3.x
            public void openFileChooser(ValueCallback<Uri> uploadMsg, String acceptType) {
                Main3Activity.this.showAttachmentDialog(uploadMsg);
            }

            // For Android > 4.1
            public void openFileChooser(ValueCallback<Uri> uploadMsg, String acceptType, String capture) {
                Main3Activity.this.showAttachmentDialog(uploadMsg);
            }
        });

        MyWebView.loadUrl("https://test-upload-189.herokuapp.com");
        MyWebView.setWebViewClient(new WebViewClient() {
            public void onPageFinished(WebView view, String url) {
                pb.setVisibility(View.GONE);
            }
        });
    }
    private class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }

    private void showAttachmentDialog(ValueCallback<Uri> uploadMsg) {
        this.mUploadMessage = uploadMsg;

        Intent i = new Intent(Intent.ACTION_GET_CONTENT);
        i.addCategory(Intent.CATEGORY_OPENABLE);
        i.setType("*/*");

        this.startActivityForResult(Intent.createChooser(i, "Choose type of attachment"), FILECHOOSER_RESULTCODE);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        if (requestCode == FILECHOOSER_RESULTCODE) {
            if (null == this.mUploadMessage) {
                return;
            }
            Uri result = intent == null || resultCode != RESULT_OK ? null : intent.getData();
            this.mUploadMessage.onReceiveValue(result);
            this.mUploadMessage = null;
        }
    }



}
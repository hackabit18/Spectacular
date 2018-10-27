package com.example.akhilbatchu.makearecipe;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);


        Intent intent = getIntent();
        String pkg = intent.getStringExtra("myfile");
        pkg = pkg +"/";

        String result = null;
DownLoadweb d = new DownLoadweb();

        try {
           result = d.execute("http://seznam.cz").get();
           Log.i("value",result);

        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }


    public class DownLoadweb extends AsyncTask<String,Void,String>
    {

        @Override
        protected String doInBackground(String... strings) {


            URL url;
            String content = "";
            HttpURLConnection connection =null;
            try
            {
                url = new URL(strings[0]);
                connection = (HttpURLConnection)url.openConnection();
                InputStream in = connection.getInputStream();
                InputStreamReader reader = new InputStreamReader(in);
                int data = reader.read();
                while(data!=-1)
                {
                    char c = (char)data;
                    content = content + c;
                    data = reader.read();

                }
                return  content;
            }catch (Exception e)
            {
                e.printStackTrace();
                return "fail";
            }
        }
    }
}

package com.example.akhilbatchu.makearecipe;


import android.content.Intent;
import android.support.v4.app.Fragment;
import android.graphics.Bitmap;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    Bitmap bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        Bundle b;
        b = new Bundle();
        Intent intent = getIntent();
        int number = (Integer)intent.getExtras().getInt("fragment");
        Log.i("hello",number+"s");


        if(number==2)
        {
//            Log.i("entered","with number"+number);
//            Toast.makeText(getApplicationContext(), "went", Toast.LENGTH_SHORT).show();
//            FragmentTwo fragment2 = new FragmentTwo();
//            FragmentManager fragmentManager = getSupportFragmentManager();
//
//            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//            fragmentTransaction.replace(R.id.placeFragment, fragment2);
//            fragmentTransaction.commit();

        }

    }
}

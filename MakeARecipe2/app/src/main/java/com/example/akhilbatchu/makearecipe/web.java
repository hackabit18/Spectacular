package com.example.akhilbatchu.makearecipe;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class web extends AppCompatActivity {


    ListView list;
    ArrayList<String> arrayList;
    ArrayAdapter<String> adapter;
    String pkg;
    LinearLayout layout;
    WebView webView;
    EditText et;
    Button bt,bt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        pkg = "https://www.allrecipes.com/search/results/?ingIncl=";
        list  =(ListView)findViewById(R.id.listview);
        bt = (Button)findViewById(R.id.enterButton);
        bt1 = (Button)findViewById(R.id.browseid) ;
        et = (EditText)findViewById(R.id.itemText);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("pacs",pkg);
                Intent intent = new Intent(web.this,list.class);
                intent.putExtra("myfile",pkg);
                startActivity(intent);
            }
        });


        arrayList = new ArrayList<>();
        adapter = new ArrayAdapter<String>(web.this,android.R.layout.simple_list_item_1,arrayList);
        list.setAdapter(adapter);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.notifyDataSetChanged();
                arrayList.add(et.getText().toString());

                pkg = pkg + et.getText().toString()+"%20";
                adapter.notifyDataSetChanged();
                et.setText("");
                adapter.notifyDataSetChanged();

            }
        });



        list.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                final int p = position;
                AlertDialog.Builder alert = new AlertDialog.Builder(web.this);
                alert.setMessage("Are you sure, You wanted to make decision");
                alert.setNegativeButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        adapter.remove(arrayList.get(p));
                        adapter.notifyDataSetChanged();
                        Toast.makeText(getApplicationContext(),"You have deleted the item successfully",Toast.LENGTH_LONG).show();
                    }
                }).setPositiveButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"You clicked No button",Toast.LENGTH_LONG).show();
                    }
                }).create().show();

                return false;
            }
        });


    }



}

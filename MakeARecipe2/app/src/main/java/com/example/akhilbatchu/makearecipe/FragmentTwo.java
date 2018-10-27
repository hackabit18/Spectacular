package com.example.akhilbatchu.makearecipe;


import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class FragmentTwo extends Fragment {


ListView list;
ArrayList<String> arrayList;
 ArrayAdapter<String> adapter;
 String pkg;
 LinearLayout layout;
 WebView webView;
EditText et;
Button bt,bt1;

    public FragmentTwo() {
        // Required empty public constructor
    }






    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment_two, container, false);
////        ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
////        ((AppCompatActivity)getActivity()).getSupportActionBar().setCustomView(R.layout.actionbar);
//        list  =(ListView)view.findViewById(R.id.listview);
//        bt = (Button)view.findViewById(R.id.enterButton);
//        bt1 = (Button)view.findViewById(R.id.browseid) ;
//        et = (EditText)view.findViewById(R.id.itemText);
//        layout = (LinearLayout)view.findViewById(R.id.myInvisible);
//        Toolbar toolbar = (Toolbar)view.findViewById(R.id.toolbar);
//        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
//        arrayList = new ArrayList<>();
//        adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,arrayList);
//        list.setAdapter(adapter);
//        bt.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                arrayList.add(et.getText().toString());
//                adapter.notifyDataSetChanged();
//                et.setText("");
//            }
//        });
//
//        bt1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                pkg = "https://www.allrecipes.com/search/results/?ingIncl=";
//                for(int i=0;i<arrayList.size();i++)
//                {
//                    pkg = pkg + arrayList.get(i)+"%20";
//                }
//                Log.i("pacs",pkg);
//            }
//        });
//        list.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
//            @Override
//            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
//
//                final int p = position;
//                AlertDialog.Builder alert = new AlertDialog.Builder(getActivity());
//                alert.setMessage("Are you sure, You wanted to make decision");
//                alert.setNegativeButton("Yes", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//
//                        adapter.remove(arrayList.get(p));
//                        adapter.notifyDataSetChanged();
//                        Toast.makeText(getActivity(),"You have deleted the item successfully",Toast.LENGTH_LONG).show();
//                    }
//                }).setPositiveButton("No", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        Toast.makeText(getActivity(),"You clicked No button",Toast.LENGTH_LONG).show();
//                    }
//                }).create().show();
//
//                return false;
//            }
//        });
//
//


        return  view;
    }


    public void onEnter(View view)
    {
        arrayList.add(et.getText().toString());

        adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,arrayList);
        list.setAdapter(adapter);

    }







}

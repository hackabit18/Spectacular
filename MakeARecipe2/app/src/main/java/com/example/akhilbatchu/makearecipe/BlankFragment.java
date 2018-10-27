package com.example.akhilbatchu.makearecipe;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

import java.io.ByteArrayOutputStream;


public class BlankFragment extends Fragment {


    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        Bundle bundle = this.getArguments();
        if(bundle!=null) {
//            Bitmap bitmapimage = (Bitmap) bundle.getParcelable("image");
//
//            //changes
////            ByteArrayOutputStream stream = new ByteArrayOutputStream();
////            bitmapimage.compress(Bitmap.CompressFormat.JPEG,70,stream);
//
//
//            // Bitmap bitmapimage =  getArguments().getParcelable("image");
//            ImageView image = getActivity().findViewById(R.id.imagess);
//
//            image.setImageBitmap(bitmapimage);

//            WebView web = (WebView)view.findViewById(R.id.webview);
//            web.getSettings().setJavaScriptEnabled(true);
//            web.setWebViewClient(new WebViewClient());
//
//            web.loadUrl("https://test-upload-189.herokuapp.com/");

        }
        else
        {
            Log.i("message","error in app");
        }
        return view;


    }
}

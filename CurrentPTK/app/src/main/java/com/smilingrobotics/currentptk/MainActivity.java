package com.smilingrobotics.currentptk;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.zxing.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class MainActivity extends AppCompatActivity {
    ImageButton imageButton;

    private ZXingScannerView scannerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.actionbar);
        getSupportActionBar().setIcon(R.mipmap.app_logo);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        imageButton = (ImageButton) findViewById(R.id.imageButton4);




     //   imageButton.setOnClickListener(new View.OnClickListener() {
      //      public void onClick(View v){

        //        Intent intent = new Intent(MainActivity.this, RecycleActivity.class);
        //        startActivity(intent);
        //    }
       // });
    }

   public void product(View view)
   {
       Intent intent = new Intent(MainActivity.this, RecycleActivity.class);
               startActivity(intent);
   }
public void scanBarcode(View view)
{
  scannerView = new ZXingScannerView(this);
    scannerView.setResultHandler(new ZXingScannerResultHandler());

    setContentView(scannerView);
    scannerView.startCamera();
}
//@Override
//public void onPause()
//{
  // super.onPause();
   //scannerView.stopCamera();
//}

class ZXingScannerResultHandler implements ZXingScannerView.ResultHandler
{
   @Override
    public void handleResult(Result result)
   {
        String resultCode = result.getText();

        Toast.makeText(MainActivity.this, resultCode, Toast.LENGTH_SHORT).show();
       Intent intent = new Intent(MainActivity.this, AluminumActivity.class);
       startActivity(intent);
       if (resultCode == "012000028496")
       {

           //Intent intent = new Intent(MainActivity.this, AluminumActivity.class);
           //startActivity(intent);
       }
        setContentView(R.layout.activity_main);

        scannerView.stopCamera();


        {

        }



    }

}

}

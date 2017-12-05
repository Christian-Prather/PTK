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

       if (result.getText() == "012000028496")
       {
            	Intent intent = new Intent(MainActivity.this, AluminumActivity.class);
    		startActivity(intent);
       }
 
       if (result.getText() == "012000162473")
       {
            	Intent intent = new Intent(MainActivity.this, AluminumActivity.class);
    		startActivity(intent);
       }
 
       if (result.getText() == "012000141430")
       {
            	Intent intent = new Intent(MainActivity.this, AluminumActivity.class);
    		startActivity(intent);
       }
 
       if (result.getText() == "012000110467")
       {
            	Intent intent = new Intent(MainActivity.this, AluminumActivity.class);
    		startActivity(intent);
       }
 
       if (result.getText() == "012000162152")
       {
            	Intent intent = new Intent(MainActivity.this, AluminumActivity.class);
    		startActivity(intent);
       }
 
       if (result.getText() == "012000043000")
       {
            	Intent intent = new Intent(MainActivity.this, AluminumActivity.class);
    		startActivity(intent);
       }
 
       if (result.getText() == "012000126352")
       {
            	Intent intent = new Intent(MainActivity.this, AluminumActivity.class);
    		startActivity(intent);
       }
 
       if (result.getText() == "012000016431")
       {
            	Intent intent = new Intent(MainActivity.this, AluminumActivity.class);
    		startActivity(intent);
       }
 
       if (result.getText() == "012000162688")
       {
            	Intent intent = new Intent(MainActivity.this, AluminumActivity.class);
    		startActivity(intent);
       }
 
       if (result.getText() == "012000162572")
       {
            	Intent intent = new Intent(MainActivity.this, AluminumActivity.class);
    		startActivity(intent);
       }
 
       if (result.getText() == "012000162565")
       {
            	Intent intent = new Intent(MainActivity.this, AluminumActivity.class);
    		startActivity(intent);
       }
 
       if (result.getText() == "818094003001")
       {
            	Intent intent = new Intent(MainActivity.this, AluminumActivity.class);
    		startActivity(intent);
       }
 
       if (result.getText() == "818094000017")
       {
            	Intent intent = new Intent(MainActivity.this, AluminumActivity.class);
    		startActivity(intent);
       }
 
       if (result.getText() == "818094007436")
       {
            	Intent intent = new Intent(MainActivity.this, AluminumActivity.class);
    		startActivity(intent);
       }
 
       if (result.getText() == "818094000703")
       {
            	Intent intent = new Intent(MainActivity.this, AluminumActivity.class);
    		startActivity(intent);
       }
 
       if (result.getText() == "818094000024")
       {
            	Intent intent = new Intent(MainActivity.this, AluminumActivity.class);
    		startActivity(intent);
       }
 
       if (result.getText() == "818094003889")
       {
            	Intent intent = new Intent(MainActivity.this, AluminumActivity.class);
    		startActivity(intent);
       }
 
       if (result.getText() == "818094002240")
       {
            	Intent intent = new Intent(MainActivity.this, AluminumActivity.class);
    		startActivity(intent);
       }
 
       if (result.getText() == "818094003926")
       {
            	Intent intent = new Intent(MainActivity.this, AluminumActivity.class);
    		startActivity(intent);
       }
 
       if (result.getText() == "818094007139")
       {
            	Intent intent = new Intent(MainActivity.this, AluminumActivity.class);
    		startActivity(intent);
       }
 
       if (result.getText() == "818094007283")
       {
            	Intent intent = new Intent(MainActivity.this, AluminumActivity.class);
    		startActivity(intent);
       }
 
       if (result.getText() == "1126942672")
       {
            	Intent intent = new Intent(MainActivity.this, AluminumActivity.class);
    		startActivity(intent);
       }
 
       if (result.getText() == "1126912211")
       {
            	Intent intent = new Intent(MainActivity.this, AluminumActivity.class);
    		startActivity(intent);
       }
 
       if (result.getText() == "2000423712991")
       {
           		Intent intent = new Intent(MainActivity.this, AluminumActivity.class);
    		startActivity(intent);
       }
 
       if (result.getText() == "721864915100")
       {
           		Intent intent = new Intent(MainActivity.this, AluminumActivity.class);
    		startActivity(intent);
       }
 
       if (result.getText() == "721864915506")
       {
            	Intent intent = new Intent(MainActivity.this, AluminumActivity.class);
    		startActivity(intent);
       }
 
       if (result.getText() == "611269235685")
       {
            	Intent intent = new Intent(MainActivity.this, AluminumActivity.class);
    		startActivity(intent);
       }
 
       if (result.getText() == "721864915490")
       {
            	Intent intent = new Intent(MainActivity.this, AluminumActivity.class);
    		startActivity(intent);
       }
 
       if (result.getText() == "721864915162")
       {
            	Intent intent = new Intent(MainActivity.this, AluminumActivity.class);
    		startActivity(intent);
       }
 
       if (result.getText() == "721864914417")
       {
            	Intent intent = new Intent(MainActivity.this, AluminumActivity.class);
    		startActivity(intent);
       }
 
       if (result.getText() == "611269212457")
       {
            	Intent intent = new Intent(MainActivity.this, AluminumActivity.class);
    		startActivity(intent);
       }
 
       if (result.getText() == "611269235791")
       {
            	Intent intent = new Intent(MainActivity.this, AluminumActivity.class);
    		startActivity(intent);
       }
 
       if (result.getText() == "611269226126")
       {
            	Intent intent = new Intent(MainActivity.this, AluminumActivity.class);
    		startActivity(intent);
       }
 
       if (result.getText() == "890817001020")
       {
            	Intent intent = new Intent(MainActivity.this, AluminumActivity.class);
    		startActivity(intent);
       }
 
       if (result.getText() == "847349011973")
       {
            	Intent intent = new Intent(MainActivity.this, AluminumActivity.class);
    		startActivity(intent);
       }
 
       if (result.getText() == "070847003236")
       {
            	Intent intent = new Intent(MainActivity.this, AluminumActivity.class);
    		startActivity(intent);
       }
 
       if (result.getText() == "070847017516")
       {
            	Intent intent = new Intent(MainActivity.this, AluminumActivity.class);
    		startActivity(intent);
       }
 
       if (result.getText() == "070847810162")
       {
            	Intent intent = new Intent(MainActivity.this, AluminumActivity.class);
    		startActivity(intent);
       }
 
       if (result.getText() == "070847000068")
       {
            	Intent intent = new Intent(MainActivity.this, AluminumActivity.class);
    		startActivity(intent);
       }
 
       if (result.getText() == "070847013259")
       {
            	Intent intent = new Intent(MainActivity.this, AluminumActivity.class);
    		startActivity(intent);
       }
 
       if (result.getText() == "070847811244")
       {
            	Intent intent = new Intent(MainActivity.this, AluminumActivity.class);
    		startActivity(intent);
       }
           
       if (result.getText() == "01212901")
       {
            Intent intent = new Intent(MainActivity.this, PlasticBottleActivity.class);
    		startActivity(intent);
       }
        
       if (result.getText() == "01213007")
       {
            Intent intent = new Intent(MainActivity.this, PlasticBottleActivity.class);
    		startActivity(intent);
       }
        
       if (result.getText() == "01255906")
       {
            Intent intent = new Intent(MainActivity.this, PlasticBottleActivity.class);
    		startActivity(intent);
       }
       if (result.getText() == "01257904")
       {
            Intent intent = new Intent(MainActivity.this, PlasticBottleActivity.class);
    		startActivity(intent);
	   }
        
       if (result.getText() == "01200081131")
       {
            Intent intent = new Intent(MainActivity.this, PlasticBottleActivity.class);
    		startActivity(intent);
       }
        
       if (result.getText() == "01200002862")
       {
            Intent intent = new Intent(MainActivity.this, PlasticBottleActivity.class);
    		startActivity(intent);
       }
        
       if (result.getText() == "01222403")
       {
            Intent intent = new Intent(MainActivity.this, PlasticBottleActivity.class);
    		startActivity(intent);
       }
        
       if (result.getText() == "078000206401")
       {
            Intent intent = new Intent(MainActivity.this, PlasticBottleActivity.class);
    		startActivity(intent);
	   }
        
       if (result.getText() == "012000150098")
       {
            Intent intent = new Intent(MainActivity.this, PlasticBottleActivity.class);
    		startActivity(intent);
       }
        
       if (result.getText() == "012000013812")
       {
            Intent intent = new Intent(MainActivity.this, PlasticBottleActivity.class);
    		startActivity(intent);
       }
        
       if (result.getText() == "01255906")
       {
            Intent intent = new Intent(MainActivity.this, PlasticBottleActivity.class);
    		startActivity(intent);
       }
        
       if (result.getText() == "01257904")
       {
        Intent intent = new Intent(MainActivity.this, PlasticBottleActivity.class);
    		startActivity(intent);
	   }
        
       if (result.getText() == "01200081131")
       {
            Intent intent = new Intent(MainActivity.this, PlasticBottleActivity.class);
    		startActivity(intent);
       }
        
       if (result.getText() == "01200002862")
       {
            Intent intent = new Intent(MainActivity.this, PlasticBottleActivity.class);
    		startActivity(intent);
       }
        
       if (result.getText() == "078000013528")
       {
            Intent intent = new Intent(MainActivity.this, PlasticBottleActivity.class);
    		startActivity(intent);
       }
        
       if (result.getText() == "078000013283")
       {
            Intent intent = new Intent(MainActivity.this, PlasticBottleActivity.class);
    		startActivity(intent);
	   }
        
       if (result.getText() == "01213104")
       {
            Intent intent = new Intent(MainActivity.this, PlasticBottleActivity.class);
    		startActivity(intent);
       }
        
       if (result.getText() == "078000202403")
       {
            Intent intent = new Intent(MainActivity.this, PlasticBottleActivity.class);
    		startActivity(intent);
       }
        
       if (result.getText() == "078000209402")
       {
            Intent intent = new Intent(MainActivity.this, PlasticBottleActivity.class);
    		startActivity(intent);
       }
        
       if (result.getText() == "078000082401")
       {
            Intent intent = new Intent(MainActivity.this, PlasticBottleActivity.class);
    		startActivity(intent);
	   }
        
       if (result.getText() == "078000083408")
       {
            Intent intent = new Intent(MainActivity.this, PlasticBottleActivity.class);
    		startActivity(intent);
       }
        
       if (result.getText() == "051000138033")
       {
            Intent intent = new Intent(MainActivity.this, PlasticBottleActivity.class);
    		startActivity(intent);
       }
        
       if (result.getText() == "876063002813")
       {
            Intent intent = new Intent(MainActivity.this, PlasticBottleActivity.class);
    		startActivity(intent);
       }
        
       if (result.getText() == "876063002806")
       {
            Intent intent = new Intent(MainActivity.this, PlasticBottleActivity.class);
    		startActivity(intent);
	   }
        
       if (result.getText() == "876063002011")
       {
            Intent intent = new Intent(MainActivity.this, PlasticBottleActivity.class);
    		startActivity(intent);
       }
       if (result.getText() == "876063002028")
       {
            Intent intent = new Intent(MainActivity.this, PlasticBottleActivity.class);
    		startActivity(intent);
       }
        
       if (result.getText() == "739510002845")
       {
            Intent intent = new Intent(MainActivity.this, PlasticBottleActivity.class);
    		startActivity(intent);
       }
        
       if (result.getText() == "739510000612")
       {
            Intent intent = new Intent(MainActivity.this, PlasticBottleActivity.class);
    		startActivity(intent);
	   }
        
       if (result.getText() == "739510002821")
       {
            Intent intent = new Intent(MainActivity.this, PlasticBottleActivity.class);
    		startActivity(intent);
       }
        
       if (result.getText() == "01215908")
       {
            Intent intent = new Intent(MainActivity.this, PlasticBottleActivity.class);
    		startActivity(intent);
       }
        
       if (result.getText() == "01215704")
       {
            Intent intent = new Intent(MainActivity.this, PlasticBottleActivity.class);
    		startActivity(intent);
       }
        
       if (result.getText() == "012000286193")
       {
            Intent intent = new Intent(MainActivity.this, PlasticBottleActivity.class);
    		startActivity(intent);
	   }

       if (result.getText() == "012000286223")
       {
            Intent intent = new Intent(MainActivity.this, PlasticBottleActivity.class);
    		startActivity(intent);
       }
       if (result.getText() == "012000286209")
       {
            Intent intent = new Intent(MainActivity.this, PlasticBottleActivity.class);
    		startActivity(intent);
       }
        
       if (result.getText() == "082592720153")
       {
            Intent intent = new Intent(MainActivity.this, PlasticBottleActivity.class);
    		startActivity(intent);
	   }
        
       if (result.getText() == "012000286186")
       {
            Intent intent = new Intent(MainActivity.this, PlasticBottleActivity.class);
    		startActivity(intent);
       }
        
       if (result.getText() == "012000046445")
       {
            Intent intent = new Intent(MainActivity.this, PlasticBottleActivity.class);
    		startActivity(intent);
       }
        
       if (result.getText() == "052000324860")
       {
            Intent intent = new Intent(MainActivity.this, PlasticBottleActivity.class);
    		startActivity(intent);
       }
        
       if (result.getText() == "052000204063")
       {
            Intent intent = new Intent(MainActivity.this, PlasticBottleActivity.class);
    		startActivity(intent);
       }
        
       if (result.getText() == "052000328684")
       {
            Intent intent = new Intent(MainActivity.this, PlasticBottleActivity.class);
    		startActivity(intent);
       }
       if (result.getText() == "052000328660")
       {
            Intent intent = new Intent(MainActivity.this, PlasticBottleActivity.class);
    		startActivity(intent);
       }
       if (result.getText() == "052000324815")
       {
            Intent intent = new Intent(MainActivity.this, PlasticBottleActivity.class);
    		startActivity(intent);
       }
        
       if (result.getText() == "739510900417")
       {
            Intent intent = new Intent(MainActivity.this, PlasticBottleActivity.class);
    		startActivity(intent);
       }
        
       if (result.getText() == "739510900400")
       {
            Intent intent = new Intent(MainActivity.this, PlasticBottleActivity.class);
    		startActivity(intent);
       }
        
       if (result.getText() == "739510900400")
       {
            Intent intent = new Intent(MainActivity.this, PlasticBottleActivity.class);
    		startActivity(intent);
       }
        
       if (result.getText() == "739510900004")
       {
            Intent intent = new Intent(MainActivity.this, PlasticBottleActivity.class);
    		startActivity(intent);
       }
        
       if (result.getText() == "739510400108")
       {
            Intent intent = new Intent(MainActivity.this, PlasticBottleActivity.class);
    		startActivity(intent);
       }
        
       if (result.getText() == "739510800106")
       {
            Intent intent = new Intent(MainActivity.this, PlasticBottleActivity.class);
    		startActivity(intent);
       }
        
       if (result.getText() == "082592726155")
       {
            Intent intent = new Intent(MainActivity.this, PlasticBottleActivity.class);
    		startActivity(intent);
       }
       if (result.getText() == "082592917157")
       {
            Intent intent = new Intent(MainActivity.this, PlasticBottleActivity.class);
    		startActivity(intent);
       }
       if (result.getText() == "082592660152")
       {
           Intent intent = new Intent(MainActivity.this, PlasticBottleActivity.class);
           startActivity(intent);
       }
        
       if (result.getText() == "082592194152")
       {
            Intent intent = new Intent(MainActivity.this, PlasticBottleActivity.class);
    		startActivity(intent);
       }
        
       if (result.getText() == "082592722157")
       {
            Intent intent = new Intent(MainActivity.this, PlasticBottleActivity.class);
    		startActivity(intent);
       }
        
       if (result.getText() == "082592633750")
       {
            Intent intent = new Intent(MainActivity.this, PlasticBottleActivity.class);
    		startActivity(intent);
       }
        
       if (result.getText() == "082592631954")
       {
            Intent intent = new Intent(MainActivity.this, PlasticBottleActivity.class);
    		startActivity(intent);
	   }
        
       if (result.getText() == "082592988157")
       {
            Intent intent = new Intent(MainActivity.this, PlasticBottleActivity.class);
    		startActivity(intent);
       }
        
       if (result.getText() == "048500017753")
       {
            Intent intent = new Intent(MainActivity.this, PlasticBottleActivity.class);
    		startActivity(intent);
       }
        
       if (result.getText() == "048500017814")
       {
            Intent intent = new Intent(MainActivity.this, PlasticBottleActivity.class);
    		startActivity(intent);
       }
        
       if (result.getText() == "048500018668")
       {
            Intent intent = new Intent(MainActivity.this, PlasticBottleActivity.class);
    		startActivity(intent);
       }

       if (result.getText() == "070847027324")
       {
             Intent intent = new Intent(MainActivity.this, AluminumActivity.class);
             startActivity(intent);
       }
        
       if (result.getText() == "082592010407")
       {
            Intent intent = new Intent(MainActivity.this, TetraPaksActivity.class);
    		startActivity(intent);
       }
       if (result.getText() == "082592010216")
       {
            Intent intent = new Intent(MainActivity.this, TetraPaksActivity.class);
    		startActivity(intent);
       }
        
       if (result.getText() == "867980000150")
       {
            Intent intent = new Intent(MainActivity.this, TetraPaksActivity.class);
    		startActivity(intent);
       }
        
       if (result.getText() == "082592010407")
       {
            Intent intent = new Intent(MainActivity.this, TetraPaksActivity.class);
    		startActivity(intent);
       }
        
       if (result.getText() == "016229916688")
       {
            Intent intent = new Intent(MainActivity.this, TetraPaksActivity.class);
    		startActivity(intent);
       }  
        
       if (result.getText() == "024321930891")
       {
            Intent intent = new Intent(MainActivity.this, TetraPaksActivity.class);
    		startActivity(intent);
       }
        
       if (result.getText() == "01241000")
       {
            Intent intent = new Intent(MainActivity.this, GlassBottleActivity.class);
    		startActivity(intent);
       }
        
       if (result.getText() == "01235504")
       {
            Intent intent = new Intent(MainActivity.this, GlassBottleActivity.class);
    		startActivity(intent);
       }
        
       if (result.getText() == "01227107")
       {
            Intent intent = new Intent(MainActivity.this, GlassBottleActivity.class);
    		startActivity(intent);
       }
       if (result.getText() == "01264904")
       {
            Intent intent = new Intent(MainActivity.this, GlassBottleActivity.class);
    		startActivity(intent);
       }
       if (result.getText() == "853311003051")
       {
            Intent intent = new Intent(MainActivity.this, GlassBottleActivity.class);
    		startActivity(intent);
       }
        
       if (result.getText() == "853311003693")
       {
            Intent intent = new Intent(MainActivity.this, GlassBottleActivity.class);
    		startActivity(intent);
       }
        
       if (result.getText() == "853311003303")
       {
            Intent intent = new Intent(MainActivity.this, GlassBottleActivity.class);
    		startActivity(intent);
       }
        
       if (result.getText() == "836093401154")
       {
            Intent intent = new Intent(MainActivity.this, GlassBottleActivity.class);
    		startActivity(intent);
       }
        
       if (result.getText() == "836093001057")
       {
            Intent intent = new Intent(MainActivity.this, GlassBottleActivity.class);
    		startActivity(intent);
       }
        
       if (result.getText() == "836093001040")
       {
            Intent intent = new Intent(MainActivity.this, GlassBottleActivity.class);
    		startActivity(intent);
       }
       if (result.getText() == "836093001026")
       {
            Intent intent = new Intent(MainActivity.this, GlassBottleActivity.class);
    		startActivity(intent);
       }
        
       if (result.getText() == "836093001071")
       {
            Intent intent = new Intent(MainActivity.this, GlassBottleActivity.class);
    		startActivity(intent);
       }
        
       if (result.getText() == "794522909001")
       {
            Intent intent = new Intent(MainActivity.this, GlassBottleActivity.class);
    		startActivity(intent);
       }
        
       if (result.getText() == "794522915002")
       {
            Intent intent = new Intent(MainActivity.this, GlassBottleActivity.class);
    		startActivity(intent);
       }


        setContentView(R.layout.activity_main);

        scannerView.stopCamera();


        {

        }



    }

}

}

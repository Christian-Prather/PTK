package com.smilingrobotics.currentptk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;

import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

import android.widget.SearchView;
import android.widget.Toast;

import android.support.v7.app.AppCompatActivity;


public class RecycleActivity extends AppCompatActivity implements SearchView.OnQueryTextListener{

    ListView listView;
    SearchView searchView;
    ArrayAdapter<String> adapter;
    String[] frats = {"Paper Cup", "Aluminum Can", "Saran Wrap", "Aluminum Foil", "Styrofoam container", "Plastic milk carton", "Paper milk carton","Yogurt cup", "Colored Paper", "White Paper", "Napkin", "Plastic spoon", "Plastic fork", "Plastic knife", "Popcorn bag from RRCC", "Paper Plate", "Pizza Box" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.actionbar);
        getSupportActionBar().setIcon(R.mipmap.app_logo);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        //getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        //getSupportActionBar().setCustomView(R.layout.actionbar);
        listView = (ListView) findViewById(R.id.listView);
        searchView = (SearchView) findViewById(R.id.searchView);




        adapter = new ArrayAdapter<String>(this, R.layout.list_text, R.id.list_content, frats);
        listView.setAdapter(adapter);
        searchView.setOnQueryTextListener(this);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int itemPosition = position;
                String itemValue = (String) listView.getItemAtPosition(position);

                if (itemPosition == 0) {
                    Intent frat0 = new Intent(view.getContext(), PaperCupActivity.class);
                    startActivity(frat0);
                }
                if (itemPosition == 1) {
                    Intent frat1 = new Intent(view.getContext(), AluminumActivity.class);
                    startActivity(frat1);
                }
                if (itemPosition == 2) {

                }
                if (itemPosition == 3) {
                   // Intent frat3 = new Intent(view.getContext(), KappaAlphaOrderActivity.class);
                   // startActivity(frat3);
                }
                if (itemPosition == 4) {
                   // Intent frat4 = new Intent(view.getContext(), KappaSigmaActivity.class);
                   // startActivity(frat4);
                }
                if (itemPosition == 5) {
                   // Intent frat5 = new Intent(view.getContext(), PhiDeltaThetaActivity.class);
                   // startActivity(frat5);
                }
                if (itemPosition == 6) {
                    //Intent frat6 = new Intent(view.getContext(), PiKappaAlphaActivity.class);
                    //startActivity(frat6);
                }
                if (itemPosition == 7) {
                  //  Intent frat7 = new Intent(view.getContext(), PiKappaPhiActivity.class);
                  //  startActivity(frat7);
                }
                if (itemPosition == 8) {
                   // Intent frat8 = new Intent(view.getContext(), SigmaAlphaEpsilonActivity.class);
                   // startActivity(frat8);
                }
                if (itemPosition == 9) {
                   // Intent frat9 = new Intent(view.getContext(), SigmaAlphaMuActivity.class);
                   // startActivity(frat9);
                }
                if (itemPosition == 10) {
                  //  Intent frat10 = new Intent(view.getContext(), SigmaChiActivity.class);
                  //  startActivity(frat10);
                }
                if (itemPosition == 11) {
                  //  Intent frat11 = new Intent(view.getContext(), SigmaPhiEpsilonActivity.class);
                   // startActivity(frat11);
                }
                if (itemPosition == 12) {
                  //  Intent frat12 = new Intent(view.getContext(), ThetaDeltaChiActivity.class);
                   // startActivity(frat12);
                }
                if (itemPosition == 13) {
                  //  Intent frat13 = new Intent(view.getContext(), ThetaXiActivity.class);
                  //  startActivity(frat13);
                }
                if (itemPosition == 14) {
                  //  Intent frat14 = new Intent(view.getContext(), ZetaBetaTauActivity.class);
                  //  startActivity(frat14);
                }
            }
        });



    }


    @Override
    public boolean onQueryTextSubmit(String query) {

        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        String frats = newText;
        adapter.getFilter().filter(newText);
        return false;
    }
}


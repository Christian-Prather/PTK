package com.smilingrobotics.currentptk;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

public class PaperCupActivity extends AppCompatActivity {
    Button button;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paper_cup);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.actionbar);
        getSupportActionBar().setIcon(R.mipmap.app_logo);
        getSupportActionBar().setDisplayShowHomeEnabled(true);




    }

}

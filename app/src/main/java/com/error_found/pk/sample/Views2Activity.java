package com.error_found.pk.sample;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.Toolbar;
import android.widget.ViewSwitcher;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Views2Activity extends AppCompatActivity {

    ArrayList<String> mList=new ArrayList<>();


    private TextSwitcher mSwitcher;
    Switch mSwitch;
    private android.support.v7.widget.Toolbar mToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_views2);
        Button btnStart=findViewById(R.id.btn_start);
        mToolbar=findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);


        mList.add("Android");
        mList.add("Angular");
        mList.add("Android");
        mList.add("Angular");
        mList.add("Android");
        mList.add("Angular");
        mList.add("Android");
        mList.add("Angular");
        Spinner spinner=findViewById(R.id.spinner);
        mSwitch=findViewById(R.id.switch1);
        ArrayAdapter<String> countryAdapter=new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.countries));
        spinner.setAdapter(countryAdapter);
        mSwitcher=findViewById(R.id.tswitcher);
        mSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                TextView myText=new TextView(Views2Activity.this);
                myText.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL);
                myText.setTextSize(36);
                myText.setTextColor(Color.BLUE);
                return myText;
            }
        });

        Animation in= AnimationUtils.loadAnimation(this,R.anim.slide_down);
        Animation out=AnimationUtils.loadAnimation(this,R.anim.slide_up);

        mSwitcher.setInAnimation(in);
        mSwitcher.setOutAnimation(out);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (String sam:mList)
                {
                    mSwitcher.setText(sam);
                }
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }
}

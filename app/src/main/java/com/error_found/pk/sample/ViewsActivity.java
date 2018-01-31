package com.error_found.pk.sample;

import android.app.DatePickerDialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.CountDownTimer;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.Chronometer;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ListPopupWindow;
import android.widget.MultiAutoCompleteTextView;
import android.widget.PopupWindow;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ViewsActivity extends AppCompatActivity implements DateCallBack{
    ListPopupWindow mListPopupWindow;
    Button btnPickDate,btnPickTime;
    private View mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_views);
        final Button button=findViewById(R.id.btn_map);

        new CountDownTimer(10000,1000){
            @Override
            public void onTick(long millisUntilFinished) {
                button.setText("seconds remaining"+millisUntilFinished/1000);
            }

            @Override
            public void onFinish() {
                button.setText("done");
            }
        }.start();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater= (LayoutInflater) getSystemService(
                        Context.LAYOUT_INFLATER_SERVICE);
                View popupWIndowLayout=inflater.inflate(R.layout.popup_window,null);
                PopupWindow popupWindow=new PopupWindow(popupWIndowLayout,500,
                        500,true);
                popupWindow.showAtLocation(popupWIndowLayout, Gravity.CENTER,0,0);
                popupWindow.setAnimationStyle(R.anim.slide_down);


            }
        });


        final RadioGroup radioGroup=findViewById(R.id.rg);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
/*
                RadioButton button1=findViewById(checkedId);
                String text= (String) button1.getText();*/
                Toast.makeText(ViewsActivity.this,
                        "you have selected"+((RadioButton)findViewById(checkedId)).getText(),
                                Toast.LENGTH_SHORT).show();
            }
        });

        btnPickDate=findViewById(R.id.btn_setdate);
        btnPickTime=findViewById(R.id.btn_settime);

        btnPickDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment datePick=new MyDatePicker();
                datePick.show(getFragmentManager(),"datePicker");

            }
        });

        btnPickTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
         mEditText=findViewById(R.id.et_popup);
        ArrayAdapter<String> mArrayAdapter=new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                new String[]{"Ansdroid","Angular","IoS","NodeJS"});
        mListPopupWindow=new ListPopupWindow(this);
        mListPopupWindow.setAdapter(mArrayAdapter);
        mListPopupWindow.setModal(true);
        mListPopupWindow.setAnchorView(mEditText);
        mEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListPopupWindow.show();
            }
        });
        MultiAutoCompleteTextView macTv=findViewById(R.id.mactv);
        ArrayAdapter<String> countryAdapter=new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.countries));
        macTv.setAdapter(countryAdapter);
        macTv.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());


    }

    @Override
    public void getSelectedDate(int year, int month, int date) {
        btnPickDate.setText(date+"/"+(month+1)+"/"+year);
    }





}


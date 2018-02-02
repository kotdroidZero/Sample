package com.error_found.pk.sample.NewDesigns;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListPopupWindow;
import android.widget.TextView;

import com.error_found.pk.sample.R;

public class ContactUsActivity extends AppCompatActivity {

    private ListPopupWindow listPopupWindow;
    private String[] subject;
    private TextView tvSubject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
        tvSubject=findViewById(R.id.tv_subject);
        subject=new String[]{"Android","Angular","Node"};
        popupWindow();
        tvSubject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listPopupWindow.show();
            }
        });
        listPopupWindow.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                tvSubject.setText(subject[i]);
                listPopupWindow.dismiss();
            }
        });
        Button btnSell=findViewById(R.id.btn_sell);
        btnSell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ContactUsActivity.this,
                        SellYourStuffActivity.class));
            }
        });

    }
    public void popupWindow() {
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(ContactUsActivity.this,
                android.R.layout.simple_list_item_1,subject);
        listPopupWindow = new ListPopupWindow(ContactUsActivity.this);
        listPopupWindow.setAdapter(arrayAdapter);
        listPopupWindow.setModal(true);
        listPopupWindow.setAnchorView(tvSubject);
    }
}

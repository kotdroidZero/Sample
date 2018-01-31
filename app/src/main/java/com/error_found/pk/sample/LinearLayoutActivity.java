package com.error_found.pk.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LinearLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);
        Button button=   ((Button)findViewById(R.id.btn_two));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTableLayout frag=new FragmentTableLayout();
                getFragmentManager().beginTransaction().add(R.id.frame_l,frag).commit();
            }
        });


    }
}

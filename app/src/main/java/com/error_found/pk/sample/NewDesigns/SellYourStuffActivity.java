package com.error_found.pk.sample.NewDesigns;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.error_found.pk.sample.R;

public class SellYourStuffActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell_your_stuff);

        mRecyclerView=findViewById(R.id.recycler_sellyourstuff);
        RecyclerAdapter adapter=new RecyclerAdapter(this);
        mRecyclerView.setLayoutManager(new
                LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,
                false));
        mRecyclerView.setAdapter(adapter);

    }
}

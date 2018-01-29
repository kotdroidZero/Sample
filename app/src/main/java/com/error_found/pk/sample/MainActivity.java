package com.error_found.pk.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final FrameLayout frameLayout=findViewById(R.id.fl);

        //frameLayout.measure(View.MeasureSpec.UNSPECIFIED, View.MeasureSpec.UNSPECIFIED);
        /*ViewTreeObserver treeObserver=frameLayout.getViewTreeObserver();
        treeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                int width=frameLayout.getWidth();
                int height=frameLayout.getHeight();
                Toast.makeText(MainActivity.this,"height ="+height+" width="+width,
                        Toast.LENGTH_SHORT).show();
            }
        });*/



    }
}

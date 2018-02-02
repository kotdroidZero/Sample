package com.error_found.pk.sample.NewDesigns;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.error_found.pk.sample.R;
import com.error_found.pk.sample.fragments.AlarmFragment;
import com.error_found.pk.sample.fragments.TimerFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SampleFragmentActivity extends AppCompatActivity {



    @BindView(R.id.fl)
    FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_fragment);
        ButterKnife.bind(this);

        FragmentManager manager=getFragmentManager();
        FragmentTransaction transaction=manager.beginTransaction();
        transaction.replace(R.id.fl,new TimerFragment(),"timer");

        transaction.commit();





    }
}

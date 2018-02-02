package com.error_found.pk.sample;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;

import java.util.ArrayList;
import java.util.List;

public class TabActivity extends AppCompatActivity {

    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private List<Tab> mTabList;
    ClockAdapter mClockAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);
        init();
        mTabLayout.setupWithViewPager(mViewPager);
        mClockAdapter=new ClockAdapter(mTabList,getFragmentManager());
        mViewPager.setAdapter(mClockAdapter);
        settingTabIcon();


    }

    private void settingTabIcon() {
        for (int i = 0; i< mTabList.size(); i++)
        {
            mTabLayout.getTabAt(i).setIcon(mTabList.get(i).tabIcon);

        }
    }

    private void init() {
        mTabLayout=findViewById(R.id.tablayout);
        mViewPager=findViewById(R.id.viewpager);
        mTabList=new ArrayList<>();
        mTabList.add(new Tab("Alarm",R.drawable.ic_access_alarm_black_24dp,
                new AlarmFragment(),true));
        mTabList.add(new Tab("CLock",R.drawable.ic_clock_black_24dp,
                new ClockFragment(),true));
        mTabList.add(new Tab("Timer",R.drawable.if_sand_watch_322494,
                new TimerFragment(),true));
        mTabList.add(new Tab("StopWatch",R.drawable.if_stopwatch_172560,
                new StopWatchFragment(),true));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.alarm_menu,menu);
        return true;
    }
}

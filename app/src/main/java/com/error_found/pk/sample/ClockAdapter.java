package com.error_found.pk.sample;



import android.app.Fragment;
import android.app.FragmentManager;
import android.support.annotation.Nullable;
import android.support.v13.app.FragmentPagerAdapter;
import java.util.List;

/**
 * Created by user on 31/1/18.
 */

public class ClockAdapter extends FragmentPagerAdapter {

    List<Tab> mTabList;
    public ClockAdapter(List<Tab> mTabList, FragmentManager fm) {
        super(fm);
        this.mTabList=mTabList;
    }

    @Override
    public Fragment getItem(int position) {
        return mTabList.get(position).tabFragment;
    }


    @Override
    public int getCount() {
        return mTabList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mTabList.get(position).tabTitle;
    }
}

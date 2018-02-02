package com.error_found.pk.sample;

import android.app.Fragment;

/**
 * Created by user on 31/1/18.
 */

public class Tab {
    public String tabTitle;
    public int tabIcon;
    public Fragment tabFragment;
    public boolean isTitleShown;

    public Tab(String tabTitle, int tabIcon, Fragment tabFragment, boolean isTitleShown) {
        this.tabTitle = tabTitle;
        this.tabIcon = tabIcon;
        this.tabFragment = tabFragment;
        this.isTitleShown = isTitleShown;
    }
}

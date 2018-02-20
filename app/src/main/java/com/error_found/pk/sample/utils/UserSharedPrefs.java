package com.error_found.pk.sample.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by user12 on 16/2/18.
 */

public class UserSharedPrefs {
    private static final String PREFS_FILENAME = "sample";
    private static final int PREFS_MODE = 0;
    private static final String NAME = "name";
    private final SharedPreferences mSharedPreferences;
    private SharedPreferences.Editor mEditor;

    public UserSharedPrefs(Context context) {
        this.mSharedPreferences = context.getSharedPreferences(PREFS_FILENAME, PREFS_MODE);
        mEditor = mSharedPreferences.edit();
    }

    public void saveInPrefs(String name)
    {
        mEditor.putString(NAME,name);
        mEditor.apply();
    }

    public String getFromPrefs()
    {
        return mSharedPreferences.getString(NAME," ");
    }

}

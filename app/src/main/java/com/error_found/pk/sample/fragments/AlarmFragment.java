package com.error_found.pk.sample.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.error_found.pk.sample.R;
import com.error_found.pk.sample.utils.UserSharedPrefs;

/**
 * Created by user on 31/1/18.
 */

public class AlarmFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_alarm, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        UserSharedPrefs userSharedPrefs=new UserSharedPrefs(getActivity());
        userSharedPrefs.saveInPrefs("Antonio Pablo");

    }
}

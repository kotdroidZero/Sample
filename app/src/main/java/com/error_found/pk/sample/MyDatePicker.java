package com.error_found.pk.sample;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.widget.DatePicker;

import java.util.Calendar;
import java.util.Date;

public  class MyDatePicker extends DialogFragment implements DatePickerDialog.OnDateSetListener{

    DateCallBack mDateCallBack;
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Calendar calendar=Calendar.getInstance();
        int date=calendar.get(calendar.DAY_OF_MONTH);
        int year=calendar.get(calendar.YEAR);
        int month=calendar.get(calendar.MONTH);
        return new DatePickerDialog(getActivity(),this,year,month,date);
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        ((ViewsActivity)getActivity()).getSelectedDate(year,month,dayOfMonth);
    }
}

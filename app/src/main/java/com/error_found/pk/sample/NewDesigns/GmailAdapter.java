package com.error_found.pk.sample.NewDesigns;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.error_found.pk.sample.R;

/**
 * Created by user on 1/2/18.
 */

public class GmailAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    Context mContext;

    public GmailAdapter(Context context) {
        mContext = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new RecycleViewHolder(LayoutInflater.from(mContext).
                inflate(R.layout.primary_mail_row_item,parent,false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 30;
    }

    public class RecycleViewHolder extends RecyclerView.ViewHolder {

        public RecycleViewHolder(View itemView) {
            super(itemView);
        }
    }
}

package com.error_found.pk.sample.NewDesigns;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.error_found.pk.sample.R;

/**
 * Created by user on 31/1/18.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder>{

    Context mContext;

    public RecyclerAdapter(Context context) {
        mContext = context;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new RecyclerViewHolder(LayoutInflater.from(mContext).inflate(R.layout.row_item,
                parent,false));
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.mImageView.setImageDrawable(mContext.getResources()
                .getDrawable(R.mipmap.ic_launcher_round));
    }

    @Override
    public int getItemCount() {
        return 15;
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        ImageView mImageView;
        public RecyclerViewHolder(View itemView) {
            super(itemView);
            mImageView=itemView.findViewById(R.id.iv_launcher);

        }
    }
}

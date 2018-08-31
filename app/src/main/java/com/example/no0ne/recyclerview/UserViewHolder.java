package com.example.no0ne.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by no0ne on 2/25/18.
 */

public class UserViewHolder extends RecyclerView.ViewHolder {

    public View mView;
    public TextView mNameTextView;

    public UserViewHolder(View itemView) {
        super(itemView);
        mView = itemView;
    }

    public void setName(String name) {
        mNameTextView = mView.findViewById(R.id.text_view_name);
    }
}

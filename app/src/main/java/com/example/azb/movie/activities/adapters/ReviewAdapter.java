package com.example.azb.movie.activities.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.azb.movie.R;
import com.example.azb.movie.activities.viewholders.ItemReviewViewHolder;

import java.util.zip.Inflater;

/**
 * Created by azb on 1/6/18.
 */

public class ReviewAdapter extends RecyclerView.Adapter {

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View reviewItemView = layoutInflater.inflate(R.layout.item_review, parent, false);
        ItemReviewViewHolder itemReviewViewHolder = new ItemReviewViewHolder(reviewItemView);
        return itemReviewViewHolder;

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 3;
    }
}

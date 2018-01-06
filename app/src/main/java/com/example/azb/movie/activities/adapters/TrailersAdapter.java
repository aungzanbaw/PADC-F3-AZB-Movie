package com.example.azb.movie.activities.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.azb.movie.R;
import com.example.azb.movie.activities.viewholders.ItemGenresViewHolder;

import java.util.zip.Inflater;

/**
 * Created by azb on 1/6/18.
 */

public class TrailersAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View trailersItemView = layoutInflater.inflate(R.layout.item_trailer ,parent,false);
        ItemGenresViewHolder itemGenresViewHolder = new ItemGenresViewHolder(trailersItemView);
        return itemGenresViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }
}

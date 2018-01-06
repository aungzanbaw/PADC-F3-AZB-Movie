package com.example.azb.movie.activities.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.azb.movie.R;
import com.example.azb.movie.activities.viewholders.ItemMoviesViewHolder;

/**
 * Created by azb on 12/9/17.
 */

public class MoviesAdapter extends RecyclerView.Adapter {

//    get context, get layout inflater, inflate the details item, pass detail item into view holder, return view holder

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View newsItemView = inflater.inflate(R.layout.item_movie, parent, false);
        ItemMoviesViewHolder itemMoviesViewHolder = new ItemMoviesViewHolder(newsItemView);
        return itemMoviesViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}

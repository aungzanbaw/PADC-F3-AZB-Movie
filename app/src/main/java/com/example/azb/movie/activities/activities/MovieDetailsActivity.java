package com.example.azb.movie.activities.activities;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;


import com.example.azb.movie.R;
import com.example.azb.movie.activities.adapters.GenresAdapter;
import com.example.azb.movie.activities.adapters.ReviewAdapter;
import com.example.azb.movie.activities.adapters.TrailersAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by azb on 1/5/18.
 */

public class MovieDetailsActivity extends AppCompatActivity {

    // there are two toolbars use from support not from android lib
    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.rv_genre)
    RecyclerView rvGenre;

    @BindView(R.id.rv_trailer)
    RecyclerView rvTrailer;

    @BindView(R.id.rv_review)
    RecyclerView rvReview;

    private GenresAdapter genresAdapter;
    private TrailersAdapter trailersAdapter;
    private ReviewAdapter reviewAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies_details);
        ButterKnife.bind(this,this);

        /**
         * instead of those image we like to show parallax solid primary color send this tool bar from java
         * set scroll flag in collapse toolbar as scroll and exit until collapsed
         * then set content scrim as desire color
         */
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowTitleEnabled(false);

        /**
         * Add adapter
         */
        genresAdapter = new GenresAdapter();
        trailersAdapter = new TrailersAdapter();
        reviewAdapter = new ReviewAdapter();

        /**
         * bind adapter and layout manager => respective Recycler View
         */

        LinearLayoutManager linearLayoutManagerGenre = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        rvGenre.setAdapter(genresAdapter);
        rvGenre.setLayoutManager(linearLayoutManagerGenre);

        LinearLayoutManager linearLayoutManagerTrailer = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        rvTrailer.setAdapter(trailersAdapter);
        rvTrailer.setLayoutManager(linearLayoutManagerTrailer);

        LinearLayoutManager linearLayoutManagerReview= new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        rvReview.setAdapter(reviewAdapter);
        rvReview.setLayoutManager(linearLayoutManagerReview);
    }
}

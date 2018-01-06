package com.example.azb.movie.activities.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toolbar;

import com.example.azb.movie.R;

import butterknife.BindView;
import butterknife.ButterKnife;

import com.example.azb.movie.activities.adapters.MoviesAdapter;


public class MainActivity extends AppCompatActivity {

    @BindView(R.id.rv_movies)
    RecyclerView rvMovies;

    private MoviesAdapter moviesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this,this);

        moviesAdapter = new MoviesAdapter();

        // LinearLayoutManager, GridLayoutManager, StaggeredGridLayoutManager
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        // RecyclerView need to set layout and set adapter
        rvMovies.setLayoutManager(linearLayoutManager);
        rvMovies.setAdapter(moviesAdapter);
    }


}

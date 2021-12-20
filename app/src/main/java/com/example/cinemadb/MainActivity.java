package com.example.cinemadb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.cinemadb.Adapters.HomeRecyclerAdapter;
import com.example.cinemadb.Listeners.OnMovieClickListener;
import com.example.cinemadb.Listeners.OnSearchListener;
import com.example.cinemadb.Models.SearchApiResponse;

public class MainActivity extends AppCompatActivity implements OnMovieClickListener {
    SearchView search_view;
    RecyclerView recycler_view_home;
    HomeRecyclerAdapter adapter;
    RequestManager requestManager;
    ProgressDialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setTheme(R.style.splashScreenTheme);
        setContentView(R.layout.activity_main);



        search_view=findViewById(R.id.search_view);
        recycler_view_home=findViewById(R.id.recycler_view_home);
        requestManager=new RequestManager(this);
        dialog=new ProgressDialog(this);

        search_view.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                dialog.setTitle("Loading...");
                dialog.show();
                requestManager.searchMovies(listener,query);
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
    }

    private final OnSearchListener listener=new OnSearchListener() {
        @Override
        public void onResponse(SearchApiResponse response) {
            dialog.dismiss();;
            if(response==null) {
                Toast.makeText(MainActivity.this, "No data available!", Toast.LENGTH_SHORT).show();
                return;
            }
            showResult(response);
        }

        @Override
        public void onError(String message) {
            dialog.dismiss();
            Toast.makeText(MainActivity.this, "An Error Occured!", Toast.LENGTH_SHORT).show();
        }
    };

    private void showResult(SearchApiResponse response) {
        recycler_view_home.setHasFixedSize(true);
        recycler_view_home.setLayoutManager(new GridLayoutManager(MainActivity.this,2));
        adapter=new HomeRecyclerAdapter(this,response.getTitles(),this);
        recycler_view_home.setAdapter(adapter);
    }

    @Override
    public void onMovieClicked(String id) {
        startActivity(new Intent(MainActivity.this,DetailsActivity.class)
        .putExtra("data",id));
    }
}
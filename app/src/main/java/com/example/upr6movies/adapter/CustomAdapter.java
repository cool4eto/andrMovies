package com.example.upr6movies.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.upr6movies.R;
import com.example.upr6movies.holder.MovieViewHolder;
import com.example.upr6movies.model.Movie;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<MovieViewHolder>{

    private List<Movie> movies;
    private Context context;

    public CustomAdapter(List<Movie> movies) {
        this.movies = movies;
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View contactView = inflater.inflate(R.layout.rowlayout, parent, false);
        MovieViewHolder viewHolder = new MovieViewHolder((contactView));
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {

        final Movie movie = movies.get(position);
        holder.setName(movie.getName());
        holder.setGenre(movie.getGenre());
        holder.setYear(Integer.toString(movie.getYear()));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, movie.getName() + ": " + movie.getGenre()+ ": " + movie.getYear(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }
}

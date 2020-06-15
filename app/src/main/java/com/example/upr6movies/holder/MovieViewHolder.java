package com.example.upr6movies.holder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.upr6movies.R;

public class MovieViewHolder extends RecyclerView.ViewHolder{
    private TextView name;
    private TextView genre;
    private TextView year;


    public MovieViewHolder(@NonNull View itemView) {
        super(itemView);
        name=itemView.findViewById(R.id.textView);
        genre=itemView.findViewById(R.id.textView2);
        year=itemView.findViewById(R.id.textView3);
    }

    public TextView getName() {
        return name;
    }

    public void setName(String name) {
        this.name.setText(name);
    }

    public TextView getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre.setText(genre);
    }

    public TextView getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year.setText(year);
    }


}

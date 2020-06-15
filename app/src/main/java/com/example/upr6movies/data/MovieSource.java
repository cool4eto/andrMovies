package com.example.upr6movies.data;

import com.example.upr6movies.model.Movie;

import java.util.ArrayList;
public class MovieSource {
    public static ArrayList<Movie>  generateMovies(){
        ArrayList<Movie> movies= new ArrayList<Movie>();
        Movie movie1=new Movie(" Spenser Confidential ","Comedy",2020);
        Movie movie2=new Movie(" Parasite ","Comedy",2019);
        Movie movie3=new Movie(" The hunt ","Action",2020);
        Movie movie4=new Movie(" Vikings ","Action",2013);
        Movie movie5=new Movie(" Onward ","Animation",2020);
        for(int i=0;i<15;i++) {
            movies.add(movie1);
            movies.add(movie2);
            movies.add(movie3);
            movies.add(movie4);
            movies.add(movie5);
        }

        return movies;
    }
}

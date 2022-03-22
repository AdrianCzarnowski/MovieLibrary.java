package models;

import java.util.List;
import java.util.Random;

public class MoviesLiblary {

    private List<Movie> movies;

    private Random random = new Random();

    public MoviesLiblary() {
    }

    public MoviesLiblary(List<Movie> movies) {
        this.movies = movies;
    }

    public Movie getRandomMovie() {
        return movies.get(random.nextInt(movies.size()));
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public String toString() {
        return "Movies" + movies;
    }
}







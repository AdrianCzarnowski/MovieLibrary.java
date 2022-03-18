package movies;

import java.util.List;

public class Movie {

    private Director director;
    private List<Actor> actors;
    private String title;
    private String genre;
    private int date;

    public Movie() {
    }

    public Movie(Director director, List<Actor> actors, String title, String genre, int date) {
        this.director = director;
        this.actors = actors;
        this.title = title;
        this.genre = genre;
        this.date = date;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Movie" + " " + director + " " + actors + " " + title + " " + genre + " " + date;
    }
}

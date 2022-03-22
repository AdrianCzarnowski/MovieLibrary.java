import models.Actor;
import models.Movie;
import models.MoviesLiblary;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MenuActions {

    private static final String WHITE = "\u001B[37m";
    private static final String BLACK_BACKGROUND = "\u001B[40m";
    private static final String PURPLE = "\u001B[35m";
    private static final String RESET = "\u001B[0m";


    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();

    public void printMenu() {
        System.out.println(BLACK_BACKGROUND + WHITE +
                "Please select 1,2 or 3" + "\n" + "1 - You can check movies for any range of years in our library " +
                "\n" + "2 - You will get all information about a random movie from our collection"
                + "\n" + "3 - You can check which films a given actor has played in" + "\n" + RESET);
    }

    public void rageOfYears(List<Movie> movies) {
        System.out.println(BLACK_BACKGROUND + WHITE + "Please enter start year" + RESET);
        int startingYear = scanner.nextInt();
        System.out.println(BLACK_BACKGROUND + WHITE + "Please enter end year" + RESET);
        int endingYear = scanner.nextInt();

        System.out.println(BLACK_BACKGROUND + WHITE + "Movies in period "
                + startingYear + " - " + endingYear + " :" + RESET);

        for (Movie movie : movies) {
            if (movie.getDate() >= startingYear && movie.getDate() <= endingYear) {
                System.out.println(BLACK_BACKGROUND + PURPLE + movie.getTitle() + RESET);
            }
        }
    }

    public void randomMovie(MoviesLiblary moviesLiblary) {
        Movie randomMovie = moviesLiblary.getRandomMovie();
        System.out.println(PURPLE + BLACK_BACKGROUND + "title : " + randomMovie.getTitle() + "\n" +
                randomMovie.getDirector() + "\n" + "genre : "
                + randomMovie.getGenre() + "\n" + "data : " + randomMovie.getDate() + "\n" + randomMovie.getActors() + RESET);
    }

    public void actorsMovies(List<Movie> movies) {
        System.out.println(BLACK_BACKGROUND + WHITE + "Please enter actor's firstname :" + RESET);
        String actorFirstName = scanner.next();
        System.out.println(BLACK_BACKGROUND + WHITE + "Please enter actor's lastname :" + RESET);
        String actorLastName = scanner.next();

        System.out.println(BLACK_BACKGROUND + WHITE + actorFirstName + " " + actorLastName + " movies :" + RESET);

        for (Movie movie : movies) {
            for (Actor actor : movie.getActors()) {
                if (actor.getFirstName().equals(actorFirstName) && actor.getLastName().equals(actorLastName)) {
                    System.out.println(BLACK_BACKGROUND + PURPLE + movie.getTitle() + RESET);
                }
            }
        }
    }

    public void wrongNumber() {
        System.out.println(BLACK_BACKGROUND + WHITE + "You choose wrong number. Program will be close." + RESET);
    }
}

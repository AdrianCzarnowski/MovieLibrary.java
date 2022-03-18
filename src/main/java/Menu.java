import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import movies.MoviesLiblary;

import java.util.Scanner;

public class Menu {

    MoviesLiblary moviesLiblary;
    MenuActions menuAction = new MenuActions();
    private Scanner scanner = new Scanner(System.in);

    public void startMenu() throws JsonProcessingException {
        moviesLiblary = createMovieLiblary();
        menuAction.printMenu();

        int menuOptions = scanner.nextInt();

        switch (menuOptions) {
            case 1:
                menuAction.rageOfYears(moviesLiblary.getMovies());
                startMenu();
                break;
            case 2:
                menuAction.randomMovie(moviesLiblary);
                startMenu();
                break;
            case 3:
                menuAction.actorsMovies(moviesLiblary.getMovies());
                startMenu();
                break;
            default:
                menuAction.wrongNumber();
                System.exit(0);
        }
    }

    private MoviesLiblary createMovieLiblary() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String fileContent = FileHandler.getDataFromJsonFile("src/main/resources/movies.json");
        return objectMapper.readValue(fileContent, MoviesLiblary.class);
    }
}


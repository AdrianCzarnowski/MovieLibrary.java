import java.nio.file.Files;
import java.nio.file.Path;

public class FileHandler {

    public static String getDataFromJsonFile(String path) {
        try {
            Path filePath = Path.of(path);
            return Files.readString(filePath);
        } catch (final Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}

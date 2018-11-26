import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IOPractice {
    public static void main(String[] args) {
        Path p = Paths.get("./src/toyota/cars.txt");
        p = p.normalize();
        int i = 1;

        List<String> addMe = Arrays.asList("RAV4", "Yaris", "Sienna", "Avalon", "Mirai", "C-HR");

        try {
            Files.write(p, addMe, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<String> models = new ArrayList<>();
        try {
            models = Files.readAllLines(p);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String model : models) {
            System.out.println(i + ": " + model);
            i++;
        }
    }
}

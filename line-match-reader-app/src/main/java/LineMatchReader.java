import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LineMatchReader {

    public static void getMatchLines(File file, String string) {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            br.lines().filter(s -> s.contains(string)).forEach(System.out::println);
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}

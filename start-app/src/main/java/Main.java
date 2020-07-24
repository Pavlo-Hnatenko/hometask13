import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        LineMatchReader.getMatchLines(new File("text.txt"), "текст");

        DirectoryContentCopy.copyDirectoryContent(new File("source"), new File("destination"));
    }
}

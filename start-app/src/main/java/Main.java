import java.io.File;
import java.nio.file.StandardCopyOption;

public class Main {

    public static void main(String[] args) {

        LineMatchReader.getMatchLines(new File("text.txt"), "текст");

        DirectoryContentCopy.copyDirectoryContent(new File("source"), new File("destination"), StandardCopyOption.REPLACE_EXISTING);
    }
}

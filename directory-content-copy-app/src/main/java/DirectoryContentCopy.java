import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class DirectoryContentCopy {

    public static void copyDirectoryContent(File source, File destination) throws IOException {

        FileUtils.copyDirectory(source, destination);
    }
}



import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import exception.IncorrectDirectoryException;

public class DirectoryContentCopy {

    public static void copyDirectoryContent(File source, File destination, StandardCopyOption copyOption) {
/*        THERE ARE PRETTY SIMPLE WAY TO RESOLVE THIS TASK:)
        FileUtils.copyDirectory(source, destination); */

        if (source.isDirectory()) {
            if(!destination.exists()) {
                destination.mkdir();
            }
            File[] directoryContent = source.listFiles();
            copyFiles(directoryContent, destination);
        } else {
            try {
                throw new IncorrectDirectoryException((source.getName() + " isn't a directory, please choose an existing directory for copy!"));
            } catch (IncorrectDirectoryException e) {
                e.printStackTrace();
            }
        }
    }

    private static void copyFiles(File[] files, File destinationDirectory){
        for (File file : files) {
            if (file.isDirectory()) {
                File dir = new File(destinationDirectory, file.getName());
                dir.mkdir();
                copyDirectoryContent(file, dir, StandardCopyOption.REPLACE_EXISTING);
            } else if (file.isFile()) {
                try {
                    Files.copy(file.toPath(), new File(destinationDirectory, file.getName()).toPath(), StandardCopyOption.REPLACE_EXISTING);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}



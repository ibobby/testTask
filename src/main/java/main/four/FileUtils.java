package main.four;

import java.io.*;
import java.nio.file.Files;

/**
 * Created by b.istomin on 30.03.2016.
 */
public class FileUtils {

    public static void copyFile(File source, File dest) {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Can not find file");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error during copying file");
            e.printStackTrace();
        } finally {
            try {
                is.close();
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath());
    }
}

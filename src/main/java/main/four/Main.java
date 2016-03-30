package main.four;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by b.istomin on 30.03.2016.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter source file name:");
        String sourceFileStr = br.readLine();
        System.out.print("Enter destination file name:");
        String destFileStr = br.readLine();

        File source = new File(sourceFileStr);
        File dest = new File(destFileStr);

        long start = System.nanoTime();
        FileUtils.copyFile(source, dest);
        System.out.println("Time of copying using streams = " + (System.nanoTime() - start) + " nano sec");

        /*start = System.nanoTime();
        FileUtils.copyFileUsingJava7Files(source, dest);
        System.out.println("Time of copying using files = " + (System.nanoTime() - start) + " nano sec");*/
    }

}

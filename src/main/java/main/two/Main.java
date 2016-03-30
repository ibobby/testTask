package main.two;




import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by b.istomin on 30.03.2016.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        int occurCount = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter file name:");
        String sourceFileStr = br.readLine();

        System.out.print("Enter word for occurrences count:");
        String patternStr = br.readLine();

        try {
            br = new BufferedReader(new FileReader(sourceFileStr));
            for (String line; (line = br.readLine()) != null; ) {
                occurCount       += OccurenceUtils.getCountOccurences(line, patternStr);
            }
        } catch (Exception e) {
            System.out.println("Couldn't parse " + sourceFileStr + "\n" + e.getMessage());
            System.exit(-1);
        }

        System.out.println("The count of occurrences " + "'" + patternStr + "'" + " is " + occurCount);
    }

}

package main.two;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by b.istomin on 30.03.2016.
 */
public class OccurenceUtils {

    public static int getCountOccurences(String originStr, String patternStr) {

        Pattern pattern = Pattern.compile(patternStr);
        Matcher matcher = pattern.matcher(originStr);
        int count = 0;
        while (matcher.find()){
            count +=1;
        }
        return count;
    }

}

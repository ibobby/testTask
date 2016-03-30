package main.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * Created by b.istomin on 30.03.2016.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input:");
        int inputVal = 0;
        try{
            inputVal = Integer.parseInt(br.readLine());
        }catch(NumberFormatException nfe){
            System.err.println("Invalid Format!");
            System.exit(0);
        }

        BigInteger factorialReult = Factorial.countFactorial(inputVal);
        System.out.println("Output: " + factorialReult);
    }

}

package main.three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by b.istomin on 30.03.2016.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter operation in [число][ариф. знак][число] format ");
        String inputStr = br.readLine();


        int num1 = Character.getNumericValue(inputStr.charAt(0));
        int num2 = Character.getNumericValue(inputStr.charAt(2));
        char operator = inputStr.charAt(1);
        long answer = 0;


        switch (operator) {
            case '+':
                answer = num1 + num2;
                break;
            case '-':
                answer = num1 - num2;
                break;
            case '*':
                answer = num1 * num2;
                break;
            case '/':
                answer = num1 / num2;
                break;
        }

        System.out.println("Output " + answer);


    }
}



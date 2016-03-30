package main.one;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by b.istomin on 30.03.2016.
 */
public class Factorial {

    public static BigInteger countFactorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; ++i) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

}

package modul_1;

import java.math.BigInteger;

public class z_1_4_7 {
    public static void main(String[] args) {
        System.out.println(factorial(6));
    }

    public static BigInteger factorial(int value) {
        int result = 1;
        for (int i = 1; i <= value; i++) {
            result = result * i;
        }
        return BigInteger.valueOf(result);
    }
}

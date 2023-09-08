package modul_1;

import java.math.BigInteger;

public class z_1_2_14 {
    public static void  maxLongSqr() {
        BigInteger maxLongSqr = BigInteger.valueOf(Long.MAX_VALUE);
        BigInteger sqrt = maxLongSqr.multiply(maxLongSqr);
        System.out.println(sqrt);
    }
}

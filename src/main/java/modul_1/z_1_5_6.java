package modul_1;

import java.util.Arrays;
import java.util.Collections;

public class z_1_5_6 {
    public static void main(String[] args) {
        z_1_5_6 aa = new z_1_5_6();
        z_1_5_6.inverseArray(new Integer[]{1, 4, 6, 7});
    }

    public static Integer[] inverseArray(Integer[] numbers) {
        Collections.reverse(Arrays.asList(numbers));
        System.out.println(Arrays.toString(numbers));
        return numbers;
    }
}

package modul_1;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class z_1_5_12 {
    public static void main(String[] args) {
        z_1_5_12 p12 = new z_1_5_12();
        z_1_5_12.printOddNumbers(new int[]{3, 5, 20, 8, 7, 3, 10});
    }

    public static void printOddNumbers(int[] arr) {
        System.out.println(IntStream.of(arr)
                .filter(i -> (i & 1) == 1)
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(", ")));
        System.out.println("");
    }
}

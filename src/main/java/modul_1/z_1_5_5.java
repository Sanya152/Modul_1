package modul_1;

import java.util.Arrays;

public class z_1_5_5 {
    public static void main(String[] args) {
        z_1_5_5 dich2 = new z_1_5_5();
        z_1_5_5.getArrayMiddle(new int[]{});
    }
    public static int[] getArrayMiddle(int[] numbers) {
            if (numbers.length > 2) {
                if (numbers.length % 2 == 0) {
                    int[] arr = new int[2];
                    arr[0] = numbers[numbers.length / 2 - 1];
                    arr[1] = numbers[numbers.length / 2];
                    System.out.println(Arrays.toString(arr));
                } else {
                    int[] arr1 = new int[1];
                    arr1[0] = numbers[numbers.length / 2];
                    System.out.println(Arrays.toString(arr1));
                }
            }else {
                System.out.println( "[]");
            }
        return numbers;
    }
}

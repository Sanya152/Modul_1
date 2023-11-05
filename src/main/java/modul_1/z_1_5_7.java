package modul_1;


import java.util.Arrays;

public class z_1_5_7 {
    public static void main(String[] args) {
        z_1_5_7 doubleArray = new z_1_5_7();
        z_1_5_7.mergeAndSort(new int[]{1, 3, 5, 7}, new int[]{8, 4, 2, 4});
    }

    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        int[] array = new int[firstArray.length + secondArray.length];
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }
            }
            System.out.println(Arrays.toString(array));
        }
        return array;
    }
}
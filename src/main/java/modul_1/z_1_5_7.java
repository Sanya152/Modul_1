package modul_1;


import java.util.Arrays;

public class z_1_5_7 {
    public static void main(String[] args) {
        z_1_5_7 doubleArray = new z_1_5_7();
        z_1_5_7.mergeAndSort(new int[]{1, 3, 5, 7}, new int[]{8, 4, 2, 4});
    }

    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        int[] array = new int[firstArray.length + secondArray.length];
        int n = firstArray.length;
        int m = secondArray.length;
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (firstArray[i] <= secondArray[j]) {
                array[k] = firstArray[i];
                i++;
            } else {
                array[k] = secondArray[j];
                j++;
            }
            k++;
        }
        while (i < n) {
            array[k] = firstArray[i];
            i++;
            k++;
        }
        while (j < m) {
            array[k] = secondArray[j];
            j++;
            k++;
        }
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int l = 1; l < array.length; l++) {
                if (array[l] < array[l - 1]) {
                    int temp = array[l];
                    array[l] = array[l - 1];
                    array[l - 1] = temp;
                    isSorted = false;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
}
package modul_1;

public class z_1_5_4 {
    public static void main(String[] args) {
        z_1_5_4 dich = new  z_1_5_4();
        z_1_5_4.getSubArrayBetween(new int[]{1, 3, 5, 6, 9, 11, 24}, 2, 12);
    }
    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {
        int a = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= start && numbers[i] <= end) {
                a++;
            }
        }
        int b = 0;
        int[] result = new int[a];
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= start && numbers[i] <= end) {
                result[b] = numbers[i];
                if (b + 1 < a) {
                    System.out.print(result[b] + ",");
                } else {
                    System.out.print(result[b] + "]");
                }
                b++;
            }
        }
        return result;
    }
}
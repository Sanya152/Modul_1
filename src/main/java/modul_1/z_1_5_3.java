package modul_1;

public class z_1_5_3 {
    public static int[] printArray(int[] numbers) {
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            if (i < numbers.length - 1) {
                System.out.print(numbers[i] + ", ");
            } else {
                System.out.print(numbers[i] + "]");
            }
        }
        return numbers;
    }

    public static void main(String[] args) {
        z_1_5_3 fgf = new z_1_5_3();
        z_1_5_3.printArray(new int[]{1, 2, 3, 4, 5, 5, 6, 7, 7});
    }
}



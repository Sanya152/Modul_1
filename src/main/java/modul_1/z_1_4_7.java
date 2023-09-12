package modul_1;

public class z_1_4_7 {
    public static void main(String[] args) {
        System.out.println(factorial(6));
    }
    public static int factorial(int value) {
        int result = 1;
        for (int i = 1; i <=value; i++) {
            result = result*i;
        }
        return result;
    }
}

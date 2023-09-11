package modul_1;

public class z_1_3_8 {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(0));
    }
    public static boolean isPowerOfTwo(int value){
        int a = Integer.bitCount(Math.abs(value));
        return a == 1;
    }
}

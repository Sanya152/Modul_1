package modul_1;

public class z_1_6_10 {
    public static void main(String[] args) {
        z_1_6_10 kor = new z_1_6_10();
        kor.parseAndSqrt("64");
    }
    public long parseAndSqrt(String number) {
        Long.parseLong(number);
        double sqrt = Math.sqrt(Double.parseDouble(number));
        long round = Math.round(sqrt);
        System.out.println(round);
        return 0;
    }

}

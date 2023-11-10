package modul_1;

public class z_1_4_9 {
    public static void main(String[] args) {
        System.out.println(determineGroup(897));
    }

    static public int determineGroup(int age) {
        if (age >= 7 && age <= 13) {
            return 1;
        }
        if (age >= 14 && age <= 17) {
            return 2;
        }
        if (age >= 18 && age <= 65) {
            return 3;
        } else return  Integer.parseInt("-1");
    }
}

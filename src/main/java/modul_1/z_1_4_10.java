package modul_1;

public class z_1_4_10 {
    public static void main(String[] args) {
        System.out.println(isWeekend("Sanday"));
    }
    public static boolean isWeekend(String weekday) {
        switch (weekday){
            case "Saturday": return true;
            case "Sanday": return true;
        }
        return false;
    }
}
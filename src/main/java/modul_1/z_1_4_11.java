package modul_1;

public class z_1_4_11 {
    public static void main(String[] args) {
        System.out.println(isWeekend("Sunda"));
    }
    public static boolean isWeekend(String weekday) {
        if (weekday == "Saturday") {
            return true;
        } else if (weekday == "Sunday") {
            return true;
        }
        return false;
    }
}
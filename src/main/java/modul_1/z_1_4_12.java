package modul_1;

public class z_1_4_12 {
    public static void main(String[] args) {
        System.out.println(checkWeekend("Saturday"));
    }

    public static String checkWeekend(String weekday) {
        return (weekday.equals("Saturday") || weekday.equals("Sunday")) ? "Ура, выходной!" : "Надо еще поработать";
    }
}

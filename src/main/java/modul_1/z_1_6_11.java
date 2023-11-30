package modul_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class z_1_6_11 {
    public static void main(String[] args) {
        z_1_6_11 pat = new z_1_6_11();
        z_1_6_11.isGmailOrOutlook("1@outlook.com");
    }
    public static boolean isGmailOrOutlook(String email) {
        Pattern p = Pattern.compile("\\w{1,}@\\w{5,7}.\\w{3}");
        Matcher m = p.matcher(email);
        System.out.println(m.matches());
        return false;
    }
}

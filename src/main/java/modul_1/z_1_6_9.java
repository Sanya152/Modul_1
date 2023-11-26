package modul_1;

public class z_1_6_9 {
    public static void main(String[] args) {
        z_1_6_9 pal = new z_1_6_9();
        pal.isPalindrome("Was it a cat I saw");
    }
    public static boolean isPalindrome(String text) {
            text = text.replaceAll("[^a-zA-Z0-9]", "");
            if (text.toLowerCase().equals((new StringBuilder(text)).reverse().toString().toLowerCase()))
                System.out.println(true);
            else
                System.out.println(false);
        return false;
    }
}

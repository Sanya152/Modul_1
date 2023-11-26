package modul_1;

import com.sun.tools.javac.Main;

import java.io.PrintStream;

public class z_1_6_8 {
    public static void main(String[] args) {
       z_1_6_8 zad = new z_1_6_8();
       zad.parseAndPrintNumber("1234");
    }
    public void parseAndPrintNumber(String str) {
        System.out.println(Integer.parseInt(str)/2);
    }
}

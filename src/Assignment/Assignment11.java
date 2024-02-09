package Assignment;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Assignment11 {
    public static void main(String[] args) {
        printCurrentDate();
        alternatePrintCurrentDate();
        printCurrentTime();
        printRandomNumber();
        calculateRoots(1,4,3);
    }

    public static void printCurrentDate() {
        System.out.println(LocalDate.now());
    }
    public static void alternatePrintCurrentDate(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter d1 = DateTimeFormatter.ofPattern("dd-MM-yyyy"); // just change the format pattern to print time
        System.out.println(d1.format(now));
    }

    public static void printCurrentTime() {
        System.out.println(LocalTime.now());
    }

    public static void printRandomNumber() {
        Random r = new Random();

        int x = r.nextInt(100, 200);
        System.out.println(x);
    }

    public static void calculateRoots(int x, int y, int c) {
        int D = (y*y) - (4*x*c);
        int firstRoot = (int)(-y + Math.sqrt(D) / 2*x);
        int secondRoot = (int)(-y - Math.sqrt(D) / 2*x);
        System.out.println("First Root: "+firstRoot + ", Second Root: "+secondRoot);
    }
}

import java.util.Scanner;

public class Class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year % 4 == 0 && year % 100 != 0) {
            System.out.print("Leap year");
        } else if (year % 400 == 0) {
            System.out.print("Leap year");
        } else {
            System.out.print("Not leap year");
        }
    }
}

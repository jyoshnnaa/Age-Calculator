import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your year of birth");
        int year = sc.nextInt();
        System.out.println("The age according to current year is: " + (2025-year));
        sc.close();
    }
}

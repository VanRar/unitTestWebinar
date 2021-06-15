import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the year in the format \"YYYY\"!");
        int year = Integer.parseInt(scan.nextLine());

        while (year != 0) {
            System.out.println(result(year));
            System.out.println("Enter the year in the format \"YYYY\", enter 0 the exit!");
            year = Integer.parseInt(scan.nextLine());
        }

    }

    public static String result(int year) {
        if (year % 400 == 0 && year % 100 == 0) {
            return "This year 366 days";
        } else if (year % 100 > 0 && year % 4 == 0) {
            return "This year 366 days";
        } else if (year % 100 == 0) {
            return "This year 365 days";
        } else {
            return "This year 365 days";
        }
    }
}

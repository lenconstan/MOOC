
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lenName = 0;
        String longName = "";

        int sumYears = 0;
        int count = 0;

        while (true) {
            String input = scanner.nextLine();
            String[] splitted = input.split(",");

            if (!(input.equals(""))) {
                sumYears += Integer.valueOf(splitted[1]);
                count ++;
                if (splitted[0].length() > lenName) {
                    lenName = splitted[0].length();
                    longName = splitted[0];
                }

            } else {
                break;
            }

        }
        System.out.println("Longest name: " + longName);
        System.out.println("Average of the birth years: " + (((double)sumYears) / count));


    }
}

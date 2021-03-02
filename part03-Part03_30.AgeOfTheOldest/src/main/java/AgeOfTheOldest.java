
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int highestAge = 0;
        while (true) {
            String input = scanner.nextLine();
            String[] splitted = input.split(",");
             if (!(input.equals(""))) {
                 if (Integer.valueOf(splitted[1]) > highestAge) {
                     highestAge = Integer.valueOf(splitted[1]);
                 }
             } else {
                 break;
             }
        }
        System.out.println("Age of the oldest: " + highestAge);


    }
}

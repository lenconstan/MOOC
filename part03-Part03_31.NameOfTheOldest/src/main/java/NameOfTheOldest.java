
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int highestAge = 0;
        String nameOldest = "";
        while (true) {
            String input = scanner.nextLine();
            String[] splitted = input.split(",");
            if (!(input.equals(""))) {
                if (Integer.valueOf(splitted[1]) > highestAge) {
                    highestAge = Integer.valueOf(splitted[1]);
                    nameOldest = splitted[0];
                }
            } else {
                break;
            }
        }
        System.out.println("Name of the oldest: " + nameOldest);


    }
}

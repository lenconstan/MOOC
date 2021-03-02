
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            String[] splitted = input.split(" ");

            if (!(input.equals(""))) {
                for (int i = 0; i < splitted.length; i++) {
                    if (splitted[i].contains("av")) {
                        System.out.println(splitted[i]);
                    }
                }
            } else {
                break;
            }
        }


    }
}

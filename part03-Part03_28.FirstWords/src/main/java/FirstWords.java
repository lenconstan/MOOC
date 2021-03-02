
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            String[] splitted = input.split(" ");

            if (!(input.equals(""))) {
                System.out.println(splitted[0]);
            } else {
                break;
            }
        }


    }
}

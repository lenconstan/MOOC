
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            String[] splitted = input.split(" ");

            if (!(input.equals(""))) {
                System.out.println(splitted[splitted.length -1]);
            } else {
                break;
            }
        }


    }
}

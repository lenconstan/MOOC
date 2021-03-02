
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numA = Integer.valueOf(scanner.nextLine());
        int numB = Integer.valueOf(scanner.nextLine());

        int square = (int)(Math.sqrt(numA) + Math.sqrt(numB));

        System.out.println(square);

    }
}

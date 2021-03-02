
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numa = Integer.valueOf(scanner.nextLine());
        int numb = Integer.valueOf(scanner.nextLine());

        if (numa > numb) {
            System.out.println(numa + " is greater than " + numb + ".");
        } else if (numb > numa) {
            System.out.println(numa + " is smaller than " + numb + ".");
        } else {
            System.out.println(numa + " is equal to " + numb + ".");
        }

    }
}

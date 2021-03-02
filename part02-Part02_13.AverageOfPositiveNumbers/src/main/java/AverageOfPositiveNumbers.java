
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nums = 0;
        double pos = 0;

        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());

            if (num == 0) {
                break;
            }

            if (num > 0) {
                nums += 1;
                pos = pos + num;
            }
        }
        if (pos > 0) {
            System.out.println(pos/(double)nums);
        } else {
            System.out.println("Cannot calculate the average");
        }


    }
}

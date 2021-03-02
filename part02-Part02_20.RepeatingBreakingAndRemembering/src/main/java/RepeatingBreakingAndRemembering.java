
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Give numbers:");
        int sum = 0;
        int nums = 0;
        int evens = 0;
        int odds = 0;

        while (true) {
            int num = Integer.valueOf(scanner.nextLine());

            if (num == -1) {
                break;
            }

            if (num % 2 == 0){
                evens ++;
            } else {
                odds ++;
            }

            sum += num;
            nums ++;

        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + nums);
        System.out.println("Average: " + ((double)sum/nums));
        System.out.println("Even: " + evens);
        System.out.println("Odd: " + odds);

    }
}


import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Statistics statistics = new Statistics();
//        statistics.addNumber(3);
//        statistics.addNumber(5);
//        statistics.addNumber(1);
//        statistics.addNumber(2);
//        System.out.println("Count: " + statistics.getCount());
//        System.out.println("Sum: " + statistics.sum());
//        System.out.println("Average: " + statistics.average());
//
        Statistics sumStatistics = new Statistics();
        Statistics evenStatistics = new Statistics();
        Statistics oddStatistics = new Statistics();

        System.out.println("Enter numbers:");
        while (true) {
            int num = scanner.nextInt();
            if (num != -1) {
                sumStatistics.addNumber(num);
                if (num % 2 != 0) {
                    oddStatistics.addNumber(num);
                } else if (num % 2 == 0) {
                    evenStatistics.addNumber(num);
                }

            } else {
                break;
            }
        }
        System.out.println("Sum: " + sumStatistics.sum());
        System.out.println("Sum of even numbers: " + evenStatistics.sum());
        System.out.println("Sum of odd numbers: " + oddStatistics.sum());
    }
}

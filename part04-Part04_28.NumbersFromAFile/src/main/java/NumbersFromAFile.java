
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        int numCount = 0;
        try (Scanner fileScan = new Scanner(Paths.get(file))) {
            while (fileScan.hasNextLine()) {
                int num = Integer.valueOf(fileScan.nextLine());
                if (num >= lowerBound && num <= upperBound) {
                    numCount ++;
                }
            }
            System.out.println("Numbers: " + numCount);

        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }

    }


}

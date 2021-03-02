
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File: ");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();

        try (Scanner fileScan = new Scanner(Paths.get(file))) {
            int gameCount = 0;
            int wins = 0;
            int losses = 0;
            while (fileScan.hasNextLine()) {
                String line = fileScan.nextLine();
                String[] parts = line.split(",");
                if (parts[0].equals(team) || parts[1].equals(team)) {
                    gameCount ++;
                    if (parts[0].equals(team) && (Integer.valueOf(parts[2]) > Integer.valueOf(parts[3]))) {
                        wins ++;
                    } else if (parts[0].equals(team) && (Integer.valueOf(parts[2]) < Integer.valueOf(parts[3]))) {
                        losses ++;
                    }
                    if (parts[1].equals(team) && (Integer.valueOf(parts[3]) > Integer.valueOf(parts[2]))) {
                        wins ++;
                    } else if (parts[1].equals(team) && (Integer.valueOf(parts[3]) < Integer.valueOf(parts[2]))) {
                        losses ++;
                    }
                }

            }
            System.out.println("Games: " + gameCount);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
        } catch (Exception e) {
            System.out.println("File with name " + file + " failed to open.");
        }

    }

}

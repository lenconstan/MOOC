

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userOne = "alex";
        String passOne = "sunshine";

        String userTwo = "emma";
        String passTwo = "haskell";

        System.out.println("Enter username: ");
        String userInput = scanner.nextLine();
        System.out.println("Enter password: ");
        String userPass = scanner.nextLine();

        if (userInput.equals(userOne) && userPass.equals(passOne)) {
            System.out.println("You have successfully logged in!");
        } else if (userInput.equals(userTwo) && userPass.equals(passTwo)) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }

    }



}

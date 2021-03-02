import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();
        while (true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year: ");
            int pubYear = Integer.valueOf(scanner.nextLine());
            books.add(new Book(title, pages, pubYear));


        }

        System.out.println("What information to be printed? ");
        String input = scanner.nextLine();
        if (input.equals("everything")) {
            for (Book book: books) {
                System.out.println(book);
            }
        } else if (input.equals("name")) {
            for (Book book: books) {
                System.out.println(book.getName());
            }
        }

    }
}

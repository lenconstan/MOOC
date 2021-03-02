
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print('*');
        }
        System.out.println("");

    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print(' ');
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int spaces = size;
        int stars = 0;
        for (int i = 0; i <size; i++) {
            spaces--;
            stars++;
            printSpaces(spaces);
            printStars(stars);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        // stars 1 3 5 7
        // spaces 3 2 1 0
        int stars = 1;
        int spaces = height;

        for (int i = 0; i < height; i++) {
            spaces--;
            printSpaces(spaces);

            printStars(stars);
            stars++;
            stars++;


        }

        int baseStart = ((stars + 1)/2-3);
        int baseHeight = 2;

        for (int i = 0; i < baseHeight; i++) {
            printSpaces(baseStart);
            printStars(3);

        }

    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}

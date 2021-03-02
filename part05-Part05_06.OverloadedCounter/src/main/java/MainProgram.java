
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter test = new Counter();
        System.out.println(test.value());
        test.increase(30);
        System.out.println(test.value());
        test.decrease(10);
        System.out.println(test.value());

    }
}

import java.util.*;


public class greet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What's your name: ");
        String name = scanner.nextLine();

        System.out.println(concatenateName(name));

        scanner.close();
    }

    public static String concatenateName(String name) {
        return "Hello, " + name;
    }
}

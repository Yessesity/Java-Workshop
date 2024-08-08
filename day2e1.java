import java.util.*;


public class day2e1 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int integer;
        System.out.print("Integer: ");
        integer = console.nextInt();

        if (integer > 0) {
            System.out.print("Positive");
        }

        else if (integer < 0) {
            System.out.print("Negative");
        }

        else {
            System.out.print("Zero");
        }

        console.close();
    }
}

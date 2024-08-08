import java.util.*;


public class input {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String name;
        System.out.print("What is your name? ");
        name = console.nextLine();
        
        int age;
        System.out.print("What is your age? ");
        age = console.nextInt();

        System.out.println("Hello, "+name+"! You are "+age+" years old");

        console.close();
    }
}

import java.util.*;


public class conditionals {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int age;
        System.out.print("How old are you: ");
        age = console.nextInt();

        if (age < 18 && age > 0)
        {
            System.out.print("You are below the legal age");
        }

        else if (age >= 18 && age < 60)
        {
            System.out.print("You are an adult");
        }

        else if (age > 60)
        {
            System.out.print("You are of senior age");
        }

        else 
        {
            System.out.print("Invalid age");
        }
        console.close();
    }
}

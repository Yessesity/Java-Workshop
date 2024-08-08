import javax.swing.*;


public class dialogbox {
    public static void main(String[] args) {
        
        String name;
        name = JOptionPane.showInputDialog("What is your name?");

        String age;
        age = JOptionPane.showInputDialog("What is your age?");

        String greeting = "Hello, " + name + "! You are " + age + " years old";
        JOptionPane.showMessageDialog(null, greeting);

    }
}

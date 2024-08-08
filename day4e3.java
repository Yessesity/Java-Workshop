public class day4e3 {
    //write overloaded methods for finding the sum of two integers and two doubles
    public static void main(String[] args) {
        System.out.println(add(2, 2));
        System.out.println(add(2.4, 2.5));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }
}

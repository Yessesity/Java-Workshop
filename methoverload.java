// i am sorry for the name of this file

public class methoverload {
    public static void main(String[] args) {
       System.out.println("The area of the circle is " + calculateArea(1.2)); 
    }

    // Area of a square
    public static int calculateArea(int side) {
        return side * side;
    }

    // Area of rectangle
    public static int calculateArea(int length, int width) {
        return length * width;
    }

    //Area of circle
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
}



import java.util.Arrays;


public class arrayManipulation {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};

        manipulate(array);
        System.out.println(Arrays.toString(array));
    }

    public static void manipulate(int[] array) {
        array[0] = 10;
    }
}

public class printarray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};

        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int i: array) {
            System.out.print(i + " ");
        }
    }
}

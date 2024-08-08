public class day4e1 {
    //create a method to find the max element in an array
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        
        System.out.println(findMax(array));
    }

    public static int findMax(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}

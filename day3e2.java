public class day3e2 {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int highest = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > highest) {
                    highest = array[i][j];
                }
            }
        }

        System.out.println("The highest element in this array is: " + highest);
    }
}

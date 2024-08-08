public class arrays {
    public static void main(String[] args) {
        // make an array
        // Index no.      0  1  2  3  4
        // int[] array = {1, 2, 3, 4, 5};

        // modify the value of an element at the specific element
        // array[4] = 50;

        // make empty array with predetermined size [n] where n is an integer
        // int[] array = new int[5];

        // print all items in array
        // for (int i = 0; i < 5; i++) {
        //   System.out.println(array[i]);
        //}

        int[][] array = {
        //   0  1  2
            {1, 2, 3}, // 0
            {4, 5, 6} // 1
        };

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(array[i][j]);
            }
        }
        }
    }

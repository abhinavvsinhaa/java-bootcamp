public class Arrays {
    public static void main(String[] args) {
        // array can be initialised in two ways
        // 1. provide elements
        int array[] = { 3, 4, 5 };
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // 2. provide size: default initialised with 0
        int arrayWithSize[] = new int[3];
        for (int num : arrayWithSize) {
            System.out.println(num);
        }

        // Multi Dimensional array
        // int array2D[][] = new int[3][4];

        // Jagged arrays: Multi dimension array, where member arrays can be of different
        // lengths
        int jagged2DArray[][] = new int[3][];
        jagged2DArray[0] = new int[5];
        jagged2DArray[1] = new int[2];

        System.out.println("-----JAGGED ARRAY------");
        for (int i = 0; i < jagged2DArray.length; i++) {
            for (int j = 0; j < jagged2DArray[i].length; j++) {
                System.out.println(jagged2DArray[i][j]);
            }
        }
    }
}

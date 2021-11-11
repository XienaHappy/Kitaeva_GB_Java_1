import java.util.Arrays;

    /**
    *KitaevaJavaHomeWorkThree
    *
    *@author Ksenia
    *@version 10.11.2021
    */

    class KitaevaJavaHomeWorkThree {
        public static void main (String[] args) {

            System.out.println("Sub_task_1:");

        int[] array = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };

        System.out.println(Arrays.toString(array));
        zeroesChangeToOnes(array);
        System.out.println(Arrays.toString(array));

                System.out.println("Sub_task_2:");

        int[] arrayTwo = new int[100];

        System.out.println(Arrays.toString(arrayTwo));
        showArrayWithNumbers(arrayTwo);
        System.out.println(Arrays.toString(arrayTwo));

        System.out.println("Syb_task_3:");

        int[] arrayThree = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };

        System.out.println(Arrays.toString(arrayThree));
        doubleNumbersLessThanSixIn(arrayThree);
        System.out.println(Arrays.toString(arrayThree));

        System.out.println("Sub_task_4:");

        int[][] square = new int[10][10];
        System.out.println("With zeroes");

        fillDiagonalsWithOnes(square);
        System.out.println("With ones");

        System.out.println("Sub_task_5:");

        int initialValue = 10;
        int size = 5;

        int[] fourthArray = getNewArrayWith(initialValue, size);
        System.out.println(Arrays.toString(fourthArray));

        }

    public static void zeroesChangeToOnes(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = (inputArray[i] == 1) ? 0 : 1;
        }
    }

    public static void showArrayWithNumbers(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (i + 1);
        }
    }

    static void doubleNumbersLessThanSixIn(int[] inputArray)
    {
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = (inputArray[i] < 6) ? (inputArray[i] * 2) : inputArray[i];
        }
    }

    public static void fillDiagonalsWithOnes(int[][] square) {
        for (int i = 0; i < square.length; i++) {
            square[i][i] = 1;
            square[i][square[i].length - 1 - i] = 1;
        }
    }

    public static int[] getNewArrayWith(int initialValue, int length)
    {
        int[] result = new int[length];
        for (int i = 0; i < result.length; i++) {
            result[i] = initialValue;
        }
        return result;
    }
    }



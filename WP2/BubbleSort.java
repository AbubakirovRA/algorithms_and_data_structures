public class BubbleSort {
    /**
    * O(N^2)
    */
    public static void sort(int[] array) {
    boolean needSort;
    do {
            needSort = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    needSort = true;
                }
            }
        } while (needSort);
    }

    // public static int[] bubbleSort1(int[] array) {
    //     int[] answer = Arrays.copyOf(array, array.length);
    //     int temp;
    //     int j = array.length - 1;
    //     while (j > 0) {
    //         for (int i = 0; i < j; i++) {
    //             if (answer[i] > answer[i + 1]) {
    //                 temp = answer[i + 1];
    //                 answer[i + 1] = answer[i];
    //                 answer[i] = temp;
    //             }
    //         }
    //         j--;
    //     }
    //     return answer;
    // }
}

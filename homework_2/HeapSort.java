import java.util.Arrays;

/**
 * /*Реализовать алгоритм пирамидальной сортировки (сортировка кучей).
 */

public class HeapSort {    
    // public static void main(String args[]) {
    //     int[] myArray = new int[] { 1, 5, 8, 9, 6, 12, 54, 78, 3, 15, 66, 5 };
    //     heapSort(myArray, myArray.length);
    // }

    public static void sort(int[] myArray) {
        int length = myArray.length;
        int temp;
        int size = length - 1;
        for (int i = (length / 2); i >= 0; i--) {
            heapify(myArray, i, size);
        }
        ;
        for (int i = size; i >= 0; i--) {
            temp = myArray[0];
            myArray[0] = myArray[size];
            myArray[size] = temp;
            size--;
            heapify(myArray, 0, size);
        }
        System.out.println(Arrays.toString(myArray));
    }

    public static void heapify(int[] myArray, int i, int heapSize) {
        int a = 2 * i;
        int b = 2 * i + 1;
        int largestElement;
        if (a <= heapSize && myArray[a] > myArray[i]) {
            largestElement = a;
        } else {
            largestElement = i;
        }
        if (b <= heapSize && myArray[b] > myArray[largestElement]) {
            largestElement = b;
        }
        if (largestElement != i) {
            int temp = myArray[i];
            myArray[i] = myArray[largestElement];
            myArray[largestElement] = temp;
            heapify(myArray, largestElement, heapSize);
        }
    }
}

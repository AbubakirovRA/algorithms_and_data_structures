public class HeapSort {

    public static void sort(int[] array) {
    // Построение кучи (перегруппируем массив)
        for (int i = array.length / 2 - 1; i >= 0; i--)
            heapify(array, array.length, i);
            // Один за другим извлекаем элементы из кучи
            for (int i = array.length - 1; i >= 0; i--) {
            // Перемещаем текущий корень в конец
                int temp = array[0];
                array[0] = array[i];
                array[i] = temp;

                // Вызываем процедуру heapify на уменьшенной куче
                heapify(array, i, 0);
            }
        }

    private static void heapify(int[] array, int heapSize, int rootIndex) {
        int largest = rootIndex; // нициализируем наибольший элемент как корень
        int leftChild = 2 * rootIndex + 1; // левый = 2*rootIndex + 1
        int rightChild = 2 * rootIndex + 2; // правый = 2*rootIndex + 2

        // Если левый дочерний элемент больше корня
        if (leftChild < heapSize && array[leftChild] > array[largest])
            largest = leftChild;

        // Если правый дочерний элемент больше, чем самый большой элемент на данный момент
        if (rightChild < heapSize && array[rightChild] > array[largest])
            largest = rightChild;

        // Если самый большой элемент не корень
        if (largest != rootIndex) {
            int temp = array[rootIndex];
            array[rootIndex] = array[largest];
            array[largest] = temp;
            // Рекурсивно преобразуем в двоичную кучу затронутое поддерево
            heapify(array, heapSize, largest);
        }
    }
}


/**
 * Реализовать алгоритм пирамидальной сортировки (HeapSort)
 * Алгоритм был реализован на курсе JavaCore
 */

// public class HeapSort {    
//     // public static void main(String args[]) {
//     //     int[] myArray = new int[] { 1, 5, 8, 9, 6, 12, 54, 78, 3, 15, 66, 5 };
//     //     heapSort(myArray, myArray.length);
//     // }

//     public static void sort(int[] myArray) {
//         int length = myArray.length;
//         int temp;
//         int size = length - 1;
//         for (int i = (length / 2); i >= 0; i--) {
//             heapify(myArray, i, size);
//         }
//         ;
//         for (int i = size; i >= 0; i--) {
//             temp = myArray[0];
//             myArray[0] = myArray[size];
//             myArray[size] = temp;
//             size--;
//             heapify(myArray, 0, size);
//         }
//         // System.out.println(Arrays.toString(myArray));
//     }

//     public static void heapify(int[] myArray, int i, int heapSize) {
//         int a = 2 * i;
//         int b = 2 * i + 1;
//         int largestElement;
//         if (a <= heapSize && myArray[a] > myArray[i]) {
//             largestElement = a;
//         } else {
//             largestElement = i;
//         }
//         if (b <= heapSize && myArray[b] > myArray[largestElement]) {
//             largestElement = b;
//         }
//         if (largestElement != i) {
//             int temp = myArray[i];
//             myArray[i] = myArray[largestElement];
//             myArray[largestElement] = temp;
//             heapify(myArray, largestElement, heapSize);
//         }
//     }
// }

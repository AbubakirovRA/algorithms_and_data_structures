import java.util.Date;

public class AlgorithmDemoApplication {
    public static void main(String[] args) {
        for (int i = 10000; i <= 1000000; i = i + 10000) {
            int[] array = new int[i];

            for (int j = 0; j < array.length; j++) {
                array[j] = (int) (Math.random() * 10000);
            }

            Date startDate = new Date();
            HeapSort.sort(array);
            Date endDate = new Date();
            long heapSortDuration = endDate.getTime() - startDate.getTime();
                

            for (int j = 0; j < array.length; j++) {
                    array[j] = (int) (Math.random() * 10000);
            }
            
            startDate = new Date();
            MergeSort.sort(array, 0, array.length-1);
            endDate = new Date();
            long mergeSortDuration = endDate.getTime() - startDate.getTime();

            System.out.printf("i: %s, heap sort duration: %s, merge sort duration: %s%n", i, heapSortDuration, mergeSortDuration);
        }
    }
}
     


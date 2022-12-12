public class Search {
    public static int search(int value, int[] array, int min, int max) {
        int midpoint;
        if (max < min) {
            return -1;
        } else {
            midpoint = (max - min) / 2 + min;
        }

        if (array[midpoint] < value) {
            return search(value, array, midpoint + 1, max);
        } else {
            if (array[midpoint] > value) {
            return search(value, array, min, midpoint - 1);
        } else {
            return midpoint;
        }
        }
    }
}

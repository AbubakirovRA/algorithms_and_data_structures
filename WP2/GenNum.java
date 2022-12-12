public class GenNum {
    public static int[] fillArray() {
        int[] array = new int[100000];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        return array;
    }

}

package gb.seminars;

import static gb.seminars.sort.QuickSort.quickSort;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 8, 2, 6, 1, 0, 9, 7, 5};
        quickSort(array, 0, array.length - 1);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
    }
}
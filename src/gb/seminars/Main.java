package gb.seminars;

import static gb.seminars.find.BinaryFind.binaryFind;
import static gb.seminars.find.Find.find;
import static gb.seminars.sort.InsertSort.insertSort;
import static gb.seminars.sort.QuickSort.quickSort;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 8, 2, 6, 1, 0, 9, 7, 5};
        quickSort(array, 0, array.length - 1);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        array = new int[]{5, 3, 8, 2, 6, 1, 0, 9, 7, 5};
        System.out.println(find(array, 6));
        insertSort(array);
        System.out.println(binaryFind(array, 6));
    }
}
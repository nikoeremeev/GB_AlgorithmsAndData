package gb.seminars;

public class Find {
    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 8, 2, 6, 1, 0, 9, 7, 5};
        System.out.println(find(array, 6));
        Sort.insertSort(array);
        System.out.println(binaryFind(array, 6, 0, array.length) - 1);
    }

    // поиск перебором всего массива
    public static int find(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    //бинарный поиск
    public static int binaryFind(int[] array, int value, int min, int max) {
        int midpoint;
        if (min > max) {
            return -1;
        } else {
            midpoint = (max - min) / 2 + min;
        }
        if (array[midpoint] < value) {
            return binaryFind(array, value, midpoint + 1, max);
        } else {
            if (array[midpoint] > value) {
                return binaryFind(array, value, min, midpoint - 1);
            } else {
                return midpoint;
            }
        }

    }
}

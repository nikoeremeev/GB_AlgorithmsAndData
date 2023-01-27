package gb.seminars.find;

public class BinaryFind {
    public static int binaryFind(int[] array, int value) {
        return binaryFind(array, value, 0, array.length - 1);
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

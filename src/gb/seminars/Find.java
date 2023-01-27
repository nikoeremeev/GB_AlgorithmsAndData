package gb.seminars;

public class Find {
    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 8, 2, 6, 1, 0, 9, 7, 5};
        System.out.println(find(array, 6));
    }

    public static int find(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}

package seminar1;

public class Sort {

    public static void main(String[] args) {
        int[] array = new int[] {5,3,8,2,6,1,0,9,7,5};
        bubbleSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
    }

    public static void bubbleSort(int[] array){
        boolean finish;
        do {
            finish = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    finish = false;
                }
            }
        }while(!finish);
    }
}

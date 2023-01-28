package gb.seminars.seminar1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Sample01 {

    /**
     * Домашняя работа
     * Разработать рекурсивный алгоритм решения задачи "Ханойская Башня"
     *
     * @param args
     */
    public static void main(String[] args) {
        // O(f(n))
        AtomicInteger counter = new AtomicInteger();
        int lastNumber = 7;

        System.out.printf("Сумма всех чисел от 1 до %d равна %d; Кол-во итераций: %d\n",
                lastNumber, sum1(lastNumber, counter), counter.get());

        counter.set(1);
        System.out.printf("Сумма всех чисел от 1 до %d равна %d; Кол-во итераций: %d\n",
                lastNumber, sum2(lastNumber), counter.get());

        counter.set(0);

        List<Integer> simpleNumberList = findSimpleNumbers(lastNumber, counter);
        for (int number : simpleNumberList) {
            System.out.println(number);
        }
        System.out.println();
        System.out.printf("Counter: %d\n", counter.get());

      /*  int counter2 = 0;
        while(true){
            counter2++;
            if (counter2 == 5)
                break;
        }

        for(;;){

        }*/

        long startTime = System.currentTimeMillis();
        System.out.printf("(1) Число Фибоначчи для значения %d = %d (рекурсия)\n",
                10, fb1(10));
        long endTime = System.currentTimeMillis();
        long processingTime = endTime - startTime;
        System.out.printf("(1) Операция выполнена за %d мс.\n", processingTime);

        startTime = System.currentTimeMillis();
        System.out.printf("(1) Число Фибоначчи для значения %d = %d\n",
                10, fb2(10));
        endTime = System.currentTimeMillis();
        processingTime = endTime - startTime;
        System.out.printf("(1) Операция выполнена за %d мс.\n", processingTime);


        startTime = System.currentTimeMillis();
        System.out.printf("(2) Число Фибоначчи для значения %d = %d (рекурсия)\n",
                40, fb1(40));
        endTime = System.currentTimeMillis();
        processingTime = endTime - startTime;
        System.out.printf("(2) Операция выполнена за %d мс.\n", processingTime);

        startTime = System.currentTimeMillis();
        System.out.printf("(2) Число Фибоначчи для значения %d = %d\n",
                40, fb2(40));
        endTime = System.currentTimeMillis();
        processingTime = endTime - startTime;
        System.out.printf("(2) Операция выполнена за %d мс.\n", processingTime);


        startTime = System.currentTimeMillis();
        System.out.printf("(2) Число Фибоначчи для значения %d = %d (рекурсия)\n",
                50, fb1(50));
        endTime = System.currentTimeMillis();
        processingTime = endTime - startTime;
        System.out.printf("(2) Операция выполнена за %d мс.\n", processingTime);

        startTime = System.currentTimeMillis();
        System.out.printf("(2) Число Фибоначчи для значения %d = %d\n",
                50, fb2(50));
        endTime = System.currentTimeMillis();
        processingTime = endTime - startTime;
        System.out.printf("(2) Операция выполнена за %d мс.\n", processingTime);

    }

    /**
     * [1] Необходимо написать алгоритм, считающий сумму всех чисел от 1 до N.
     */
    public static int sum1(int lastNumber, AtomicInteger counter) {
        int sum = 0;
        for (int i = 1; i <= lastNumber; i++) {
            sum = sum + i;
            counter.getAndIncrement();
        }
        return sum;
    }


    public static int sum2(int lastNumber) {
        return ((1 + lastNumber) * lastNumber) / 2;
    }

    /**
     * [2] Написать алгоритм поиска простых чисел (делятся только на себя и на 1)
     * * в диапазоне от 1 до N.
     */
    public static List<Integer> findSimpleNumbers(int lastNumber, AtomicInteger counter) {
        List<Integer> result = new ArrayList<>();
        boolean simple;
        for (int i = 1; i <= lastNumber; i++) {
            simple = true;
            for (int j = 2; j < i; j++) {
                counter.getAndIncrement();
                if (i % j == 0) {
                    simple = false;
                    break;
                }
            }
            if (simple)
                result.add(i);
        }
        return result;
    }

    /**
     * f(4)
     *
     * @param n
     */
    static void f(int n) {
        System.out.println(n);
        if (n >= 3) {
            f(n - 1);
            f(n - 2);
            f(n - 2);
        }
    }

    /**
     * 0 1 2 3 4 5 6 7  8  9  10
     * 0 1 1 2 3 5 8 13 21 34 55 ....
     *
     * @param number
     * @return
     */
    static int fb1(int number) {
        if (number == 0 || number == 1) return number;
        return fb1(number - 1) + fb1(number - 2); // 2^(n - 1)
    }

    static int fb2(int number) { // 8
        if (number == 0 || number == 1) return number; // O(n)
        int[] numbers = new int[number + 1];
        numbers[0] = 0;
        numbers[1] = 1;
        for (int i = 2; i <= number; i++) {
            numbers[i] = numbers[i - 1] + numbers[i - 2];
        }
        return numbers[number];
    }


}

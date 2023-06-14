import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        task2();
    }

    public static void task1() {
        for (int i = 10000; i < 100000; i = i + 10000) {
            int[] array = new int[i];
            for (int j = 0; j < array.length; j++) {
                array[j] = (int) (Math.random() * 10000);
            }
            Date startDate = new Date();
            Bubble.sort(array);
            Date endDate = new Date();
            long bubleSortTime = endDate.getTime() - startDate.getTime();

            int[] array1 = new int[i];
            for (int j = 0; j < array1.length; j++) {
                array1[j] = (int) (Math.random() * 10000);
            }
            Date startDate1 = new Date();
            QuicSort.sort(array1, 0, array1.length - 1);
            Date endDate1 = new Date();
            long quicSortTime = endDate1.getTime() - startDate1.getTime();
            System.out.printf("i: %s, bubble sort: %s quick sort: %s \n", i, bubleSortTime, quicSortTime);
        }
    }

    public static void task2() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        System.out.println(search(17, array, 0, 99));
    }

    // БИНАРНЫЙ ПОИСК
    public static int search(int value, int[] array, int min, int max) {
        int midPoint;
        if (max < min) {
            return -1;
        } else {
            midPoint = (max - min) / 2 + min;
        }
        if (array[midPoint] < value) {
            return search(value, array, midPoint, max);
        } else {
            if (array[midPoint] > value) {
                return search(value, array, min, midPoint);
            } else {
                return midPoint;
            }
        }

    }
}
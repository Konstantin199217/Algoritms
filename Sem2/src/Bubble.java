import java.lang.reflect.Array;
import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 2, 1, 11, 54, 32};

        sort(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr1 = new int[]{1,23,4,2,1,4,56,7};
        sort_X(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

    }

    public static void sort_X(int[] array) {
        boolean needSort;
        do {
            needSort = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    needSort = true;
                }
            }
        }
        while (needSort) ;

    }


}

public class Lek2 {
    public static void main(String[] args) {

        int[] array = new int[]{
                4, 2, 5, 8, 9, 2, 3, 6, 8, 5
        };
//        bubleSort(array);
//        directSort(array);
//        insertSort(array);
//        qSort(array, 0, array.length - 1);
        heapifySort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

//        int[] array = new int[]{
//                1, 2, 3, 4, 5, 6, 7, 8, 9
//        };
//        //System.out.println(find(array, 5));
//        System.out.println(binarySearch(array, 9));
    }

    //Пузырьковая сортировка
    public static void bubleSort(int[] array) {
        boolean finish = true;
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
        } while (!finish);
    }

    //Сортировка выбором
    public static void directSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int minPosition = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minPosition]) {
                    minPosition = j;
                }
            }
            if (i != minPosition) {
                int temp = array[i];
                array[i] = array[minPosition];
                array[minPosition] = temp;
            }
        }

    }

    // Сортировка вставками
    public static void insertSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    // Поиск
    public static int find(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;

    }

    //Бинарный поиск
    public static int binarySearch(int[] array, int value, int min, int max) {
        int midpoint = (max - min) / 2 + min;
        if (max < min) {
            return -1;
        } else {
            midpoint = (max - min) / 2 + min;
        }

        if (array[midpoint] < value) {
            return binarySearch(array, value, midpoint + 1, max);
        } else {
            if (array[midpoint] > value) {
                return binarySearch(array, value, min, midpoint - 1);
            } else {
                return midpoint;
            }
        }
    }

    public static int binarySearch(int[] array, int value) {
        return binarySearch(array, value, 0, array.length - 1);
    }

    //Быстрая сортировка
    public static void qSort(int[] array, int startPosition, int endPosition) {
        int leftPosition = startPosition;
        int rightPosition = endPosition;
        int pivot = array[(startPosition + endPosition) / 2];
        do {
            while (array[leftPosition] < pivot) {
                leftPosition++;
            }
            while (array[rightPosition] > pivot) {
                rightPosition--;
            }
            if (leftPosition <= rightPosition) {
                if (leftPosition < rightPosition) {
                    int temp = array[leftPosition];
                    array[leftPosition] = array[rightPosition];
                    array[rightPosition] = temp;
                }
                leftPosition++;
                rightPosition--;
            }
        } while (leftPosition <= rightPosition);
        if (leftPosition < endPosition) {
            qSort(array, leftPosition, endPosition);
        }
        if (startPosition < rightPosition) {
            qSort(array, startPosition, rightPosition);
        }
    }

    // Сортировка кучей
    public static void heapify(int[] array, int heapSize, int rootIndex) {
        int largest = rootIndex; //интцтализируем наибольший элемент как корень
        int leftChid = 2 * rootIndex + 1;// левый = 2* rootIndex + 1
        int rightChild = 2 * rootIndex + 2;//правый = 2 * rootIndex + 2

        // Если левый дочерний элемент больше корня
        if (leftChid < heapSize && array[leftChid] > array[largest]) {
            largest = leftChid;
        }

        // Если правый дочерний элемент больше, чем самый большой элемент на данный момент
        if (rightChild < heapSize && array[rightChild] > array[largest]) {
            largest = rightChild;
        }

        //Если самый большой элемент не корень
        if (largest != rootIndex) {
            int temp = array[rootIndex];
            array[rootIndex] = array[largest];
            array[largest] = temp;

            //Рекурсивно преобразовываем в двоичную кучу затронутое дерево
            heapify(array, heapSize, largest);
        }

    }

    public static void heapifySort(int[] array) {
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            heapify(array, array.length, i);
        }
        for (int i = array.length - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0);
        }
    }
}



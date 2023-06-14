public class Sem2Hw {
    public static void main(String[] args) {
        // Сортировка кучей

        int[] array = new int[]{
                4, 2, 5, 8, 9, 2, 3, 6, 8, 5, 2, 3, 5, 3, 15, 35675, 8,
        };
        heapifySort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

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



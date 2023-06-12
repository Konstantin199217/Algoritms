import javax.xml.crypto.Data;
import java.util.Date;
import java.util.Scanner;

public class Se1 {
    public static void main(String[] args) {
        task4();

    }

    // Необходимо написать флгоритм, считающий сумму всех чисел от 1 до N
    // Линейная сложность O(n)
    public static void task1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число n: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.print(sum);
        sc.close();
    }

    //Написать флгоритм поиска простых чисел (делится только на себя и на 1)
    // диапазон от 1 до N O(n^2)

    public static void task2() {
        boolean flag;
        for (int i = 2; i < 1000; i++) {
            flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.print(i + " ");
            }
        }
    }

    //Необходимо написать флгоритм поиска всех доступных комбинаций
    //(посчитать колличество)
    //для колличества кубиков К с колличеством граней N
    public static void task3() {
        int count = 2;
        int faces = 6;
        System.out.println(recursiveCount(1, count, faces));
    }

    public static int recursiveCount(int countNow, int MaxCount, int faces) {
        int count = 0;
        for (int i = 0; i < faces; i++) {
            if (countNow == MaxCount) {
                count++;
            } else {
                count += recursiveCount(countNow + 1, MaxCount, faces);
            }
        }
        return count;
//        for (int i = 0; i < faces; i++) {
//            for (int j = 0; j < faces; j++) {
//                for (int k = 0; k < faces; k++) {
//                    for (int l = 0; l < faces; l++) {
//                        count++;
//                    }
//                }
//            }
//        }
//        return count;
    }

    // Пишем флгоритм поиска нужного числа последовательности Фибоначчи
    // Считаем, что 1 и 2 значения последовательности равны 1

    public static void task4() {
        int n = 40;
        Date startDate = new Date();
        System.out.println(fb(n));
        Date endDate = new Date();

        System.out.print("Решение через рекурсию ");
        System.out.println(endDate.getTime() - startDate.getTime());

        Date startDate2 = new Date();
        System.out.println(fb2(n));
        Date endDate2 = new Date();

        System.out.print("Решение через линейную ");
        System.out.println(endDate2.getTime() - startDate2.getTime());
    }

    public static int fb(int num) {
        if (num <= 2) {
            return 1;
        } else {
            return fb(num - 1) + fb(num - 2);
        }
    }

    public static int fb2(int num) {
        if (num <= 2) {
            return 1;
        }
        int[] numbers = new int[num];
        numbers[0] = 1;
        numbers[1] = 1;
        for (int i = 2; i < numbers.length; i++) {
            numbers[i] = numbers[i - 1] + numbers[i - 2];
        }
        return numbers[num - 1];
    }
}

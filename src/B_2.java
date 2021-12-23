// Ввести с консоли n целых чисел. На консоль вывести: Наибольшее и наименьшее число.

import java.util.Scanner;

public class B_2 {
    public static void main(String[] args) {
        System.out.print("Сколько целых чисел вы собираетесь ввести? ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] arr = new int[number];
        System.out.print("Введите целые числа через пробел и нажмите <Enter>:");
        for (int i = 0; i < number; i++) {
            arr[i] = scanner.nextInt();
        }
        int min = arr[0];
        for (int i = 0; i < number; i++) {
            if (min > arr[i]) min = arr[i];
        }
        System.out.println("Минимльное число:" + min);
        int max = arr[0];
        for (int i = 0; i < number; i++) {
            if (max < arr[i]) max = arr[i];
        }
        System.out.println("Максимальное число:" + max);
    }
}

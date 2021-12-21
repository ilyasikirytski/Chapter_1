// Ввести с консоли n целых чисел. На консоль вывести: четные и нечетные числа.

import java.util.Scanner;

public class B_1 {
    public static void main(String[] args) {
        System.out.println("Введите целые числа через пробел и нажмите <Enter>:");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int[] arr = new int[number];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        for (int i = 0; i < number; i++) {
            if (arr[i] % 2 != 0)
                System.out.println("Нечётное число:" + arr[i]);
            else if (arr[i] % 2 == 0) {
                System.out.println("Чётное число:" + arr[i]);
            }

        }
        scan.close();
    }
}

import java.util.Scanner;

//Ввести с консоли n целых чисел. На консоль вывести числа, которые делятся на 3 или на 9
public class B_3 {
    public static void main(String[] args) {
        System.out.print("Сколько целых чисел вы собираетесь ввести? ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] arr = new int[number];
        System.out.print("Введите целые числа через пробел и нажмите <Enter>:");
        for (int i = 0; i < number; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < number; i++)
            if ((arr[i] % 3 == 0) || (arr[i] % 9 == 0))
                System.out.println("Число, которое делится на 3 или 9: " + arr[i]);
    }
}

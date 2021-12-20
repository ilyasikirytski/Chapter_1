// Отобразить в окне консоли аргументы командной строки в обратном порядке

import java.util.Scanner;

public class A_2 {
    public static void main(String[] args) {
        System.out.println("Введите аргументы через пробел и нажмите <Enter>:");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String[] arr = scan.delimiter().split(name);
        for (int i = arr.length - 1; i >= 0; i--){
            System.out.printf("Аргумент %s -> %s%n", i, arr[i]);
        }
        scan.close();
    }
}

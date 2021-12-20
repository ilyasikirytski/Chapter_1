import java.util.Scanner;

// Приветствовать любого пользователя при вводе его имени через командную строку.
public class A_1 {
    public static void main(String[] args) {
        System.out.println("Введите Ваше имя и нажмите <Enter>:");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Привет, " + name);
        scan.close();
    }
}

//Вывести заданное количество случайных чисел с переходом и без перехода на новую строку

import java.util.Random;

public class A_3 {
    public static void main(String[] args) {
        Random random = new Random(System.currentTimeMillis());
        int numbersCount = 5;
        int bound = 20;
        for (int i = 0; i < numbersCount; i++) {
            int result = random.nextInt(bound);
            System.out.print(result + " ");
        }
        for (int i = 0; i < numbersCount; i++) {
            int result = random.nextInt(bound);
            System.out.println(result);
        }
    }
}

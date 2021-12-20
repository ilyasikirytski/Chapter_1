//Вывести заданное количество случайных чисел с переходом и без перехода на новую строку

public class A_3 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++){
            double rand = (Math.random() * 20);
            int result = (int)rand;
            System.out.print(result + " ");
        }
        for (int i = 0; i < 5; i++){
            double rand = (Math.random() * 20);
            int result = (int)rand;
            System.out.println(result);
        }
    }
}

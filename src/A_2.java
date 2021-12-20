// Отобразить в окне консоли аргументы командной строки в обратном порядке

/*
Запускал из консоли с помощью:
C:\Users\Admin\.jdks\openjdk-16.0.2\bin>java -Dfile.encoding=UTF-8 C:\Users\Admin\IdeaProjects\Chapter_1\src\A_2.java hello it's me!

В результате в консоль выводится:
Аргумент 0 -> hello
Аргумент 1 -> it's
Аргумент 2 -> me!

 */
public class A_2 {
    public static void main(String[] args) {
        for (int i = args.length - 1; i >=0; i--){
            System.out.printf("Аргумент %s -> %s%n", i, args[i]);
        }
    }
}

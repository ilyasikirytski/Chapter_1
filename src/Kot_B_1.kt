// Ввести с консоли n целых чисел. На консоль вывести: четные и нечетные числа.

fun main() {
    println("Введите целые числа через пробел и нажмите <Enter>:")
    readLine()?.split(" ")
            ?.forEach {
                val number = it.toInt()
                if (number % 2 != 0) {
                    println("Нечётное число:$number")
                } else {
                    println("Чётное число:$number")
                }
            }
}
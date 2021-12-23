// Ввести с консоли n целых чисел. На консоль вывести: четные и нечетные числа.

fun main() {
    println("Введите целые числа через пробел и нажмите <Enter>:")
    readLine()?.split(" ")
        ?.map(String::toInt)
        ?.forEach { number ->
            val name = when {
                number % 2 != 0 -> "Нечётное"
                else -> "Чётное"
            }
            println("$name число:$number")
        }
}
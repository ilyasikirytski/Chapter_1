// Ввести с консоли n целых чисел. На консоль вывести: четные и нечетные числа.

fun main() {
    println("Введите целые числа через пробел и нажмите <Enter>:")
    val scan = readLine()!!.split(" ").map { it.toInt() }
    val arr = scan
    for (i in arr.indices) {
        if (arr[i] % 2 != 0) {
            println("Нечётное число:" + arr[i])
        } else if (arr[i] % 2 == 0) {
            println("Чётное число:" + arr[i])
        }
    }
}
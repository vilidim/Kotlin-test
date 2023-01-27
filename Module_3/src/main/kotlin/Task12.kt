fun main(args: Array<String>) {

    print("Введите год: ");
    val year = readln().toIntOrNull();
    if (year == null) {
        println("Неверно указан год.");
    } else {
        println(if(isLeapYear(year)) "Год високосный" else "Год обычный");
    }
}

fun isLeapYear(year: Int): Boolean {
    return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
}
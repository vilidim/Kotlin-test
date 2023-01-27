import java.util.regex.Pattern

fun main(args: Array<String>) {
    print("Введите одно или несколько имён через пробел: ");
    val input = readln();
    var names = if (input.isBlank()) arrayOf() else input.split(" ").toTypedArray();
    println("Всего имён: ${countStrings(*names)}")
}

fun countStrings(vararg strings: String): Int {
    return strings.size;
}
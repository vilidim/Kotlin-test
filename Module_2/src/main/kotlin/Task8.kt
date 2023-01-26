import kotlin.math.roundToInt

fun main(args: Array<String>) {

    val startAmount = (requestDouble("Начальная сумма вклада: ") * 100.0).roundToInt() / 100.0;
    if (startAmount <= 0.0) {
        println("Если у вас нет денег - кредитный отдел на другом этаже.");
        return;
    }
    val percent = requestDouble("Процент по вкладу (ежемесячный): ");
    if (percent > 50.0) { println("(Кто же не любит фантастику!)"); }
    val term = requestDouble("Срок вклада (месяцев): ").roundToInt();
    if (term == 0) {
        println("Уже уходите? Всего хорошего!");
        return;
    }
    if (term < 0) {
        println("Увы, машину времени ещё не изобрели.");
        return;
    }

    val MONEY_FORMAT = "%.2f";
    var amount = startAmount;
    println("Месяц\tОстаток на начало месяца\tСумма процентов за месяц\tОстаток на конец месяца");
    for (i in 1..term) {
        val percentValue = (amount * percent).roundToInt() / 100.0;
        println("   $i\t\t  ${MONEY_FORMAT.format(amount)}\t\t\t   ${MONEY_FORMAT.format(percentValue)}\t\t\t\t\t   ${MONEY_FORMAT.format(amount+percentValue)}");
        amount += percentValue;
    }
}

fun requestDouble(message: String): Double {

    var result: Double? = null;
    do {
        print(message);
        result = readln().toDoubleOrNull();
        if (result == null) {
            println("Введено некорректное число.")
        }
    } while (result == null);

    return result;
}
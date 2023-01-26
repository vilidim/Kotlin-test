fun main(args: Array<String>) {

    val result =
        askQuestion("Сколько будет 2х2?", arrayOf ("3", "4", "5"), 1) +
        askQuestion("Сколько будет 5х5?", arrayOf("25", "52", "55", "10"), 0) +
        askQuestion("Сколько будет 6х6?", arrayOf("16", "18", "35", "36", "66"), 3) +
        askQuestion("Сколько будет 7х7?", arrayOf("47", "48", "49", "77"), 2) +
        askQuestion("В каком классе изучают таблицу умножения?",
            arrayOf("в 1-м", "во 2-м", "в 3-м", "в 8-м"),
            1
        );
    println();
    println("Правильных ответов: $result");
    when (result) {
        5 -> println("Да вы гений математики!")
        3, 4 -> println("Всё хорошо, но подумать иногда всё-таки надо...")
        1, 2 -> println("Кому она нужна, эта математика, правда?")
        else -> println("Может, снова в начальную школу?..")
    }
}

fun askQuestion(question: String, answers: Array<String>, correctAnswer: Int): Int {

    println(question);
    for (i in answers.indices) {
        println(" ${'a' + i}) ${answers[i]}")
    }
    var answer: Int? = null;

    while (answer == null) {
        print("Укажите вариант ответа: ");
        val userAnswer = readln();
        if (userAnswer.length == 1 && (userAnswer[0] - 'a') in answers.indices) {
            answer = userAnswer[0] - 'a';
        } else {
            println("Некорректный ответ, выберите один вариант.")
        }
    }
    return if (answer == correctAnswer)  1 else 0;
}
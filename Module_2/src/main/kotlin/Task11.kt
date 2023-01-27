fun main(args: Array<String>) {

    var workplaces = mutableMapOf(
        123 to "Иванов Ива Иванович",
        124 to "Петров Пётр Петрович",
        229 to "Сидоров Сидор Сидорович"
    )

    while (true) {
        println();
        print("Введите номер рабочего места (или пустую строку для выхода): ");
        val cmd = readln().trim();
        if (cmd.isBlank()) { return; }
        val number = cmd.toIntOrNull();
        if (number == null) {
            println("Введён некорректный номер рабочего места.");
        } else {
            val name = workplaces.get(number);
            if (name == null) {
                println("Рабочее место с номером $number не найдено.");
            } else {
                println("Рабочее место с номером $number занимает $name.")
            }
        }
    }

}
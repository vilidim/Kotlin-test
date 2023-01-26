
var cities: MutableList<String> = mutableListOf();

fun main(args: Array<String>) {

    println("""
        Команды:
            add <Название города>   - добавить город
            list                    - вывести список городов
            distinct                - вывести список городов без повторений
            exit                    - завершить работу
        """.trimIndent()
    );

    while (true) {
        println("Введите команду:");
        print("> ");
        val cmd = readln().trim();
        when(cmd.substringBefore(" ")) {
            "add" -> {
                val city = cmd.substringAfter("add").trim();
                if (city.isBlank()) {
                    println("Имя города не должно быть пустым.")
                } else {
                    add(city);
                }
            }
            "list" -> printAll();
            "distinct" -> printDistinct();
            "exit" -> return;
            else -> println("Неверная команда '$cmd'");
        }
        println();
    }
}

fun add(city:String) {
    cities.add(city);
    println("$city добавлен в список. Количество городов в списке: ${cities.size}");
}

fun printAll() {
    println("--- Список городов: ----");
    printCities(cities);
}

fun printDistinct() {
    println("--- Список городов без повторений: ----");
    printCities(cities.toSet());
}

fun printCities(entities:Collection<String>) {
    for (city in entities) { println(city); }
}
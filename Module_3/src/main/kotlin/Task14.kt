enum class MartialStatus(val description: String){

    MARRIED("женат/замужем"),
    SINGLE("холост/не замужем")
}

fun main(args: Array<String>) {

    printPerson("Иванов Иван Иванович", "дрессировщик");
    printPerson("Петров Пётр Петрович", 28, "фокусник");
    printPerson("Сидоров Сидор Сидорович", MartialStatus.MARRIED, "акробат");
    printPerson("Фомичёв Фома Фомин", 36, MartialStatus.SINGLE, "конферансье");
}

fun printPerson(name: String, position: String) {
    println("$name,  должность: $position");
}

fun printPerson(name: String, age: Int, position: String) {
    println("$name, $age лет, должность: $position");
}

fun printPerson(name: String, martialStatus: MartialStatus, position: String) {
    println("$name, ${martialStatus.description}, должность: $position");
}

fun printPerson(name: String, age: Int, martialStatus: MartialStatus, position: String) {
    println("$name, $age лет, ${martialStatus.description}, должность: $position");
}

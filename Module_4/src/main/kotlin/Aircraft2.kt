interface Cargo {
    // Грузоподъемность, т
    val loadCapacity: Double
}

abstract class Helicopter (
    number: Int,
    flightRange: Int,
    fuelCapacity: Int,
    // Максимальная высота, м
    protected val maxAltitude: Int
): Aircraft(number, flightRange, fuelCapacity) {
    override fun printInfo() {
        super.printInfo();
        println("Максимальная высота: $maxAltitude м");
    }
}

class Il76 (
    number: Int,
    flightRange: Int,
    fuelCapacity: Int,
    override val loadCapacity: Double
) : Cargo, Aircraft(number, flightRange, fuelCapacity) {
    override fun printInfo() {
        super.printInfo();
        println("Грузоподъёмность: $loadCapacity т");
    }
}

class Mi8 (
    number: Int,
    flightRange: Int,
    fuelCapacity: Int,
    maxAltitude: Int,
    override val passengersQuantity: Int
) : Passenger, Helicopter(number, flightRange, fuelCapacity, maxAltitude) {
    override fun printInfo() {
        super.printInfo();
        println("Количество пассажиров: $passengersQuantity");
    }
}

fun main(args: Array<String>) {

    val aircraftMap: MutableMap<Int, Aircraft> = mutableMapOf();

    fun MutableMap<Int, Aircraft>.add(aircraft: Aircraft) {
        this[aircraft.number] = aircraft;
    }

    aircraftMap.add(Il76(2345, 4200, 76000, 47.0));
    aircraftMap.add(Boeing747(123, 8500, 183380, 490));
    aircraftMap.add(Mi8(234, 365, 415 + 745 + 680, 4500, 28))

    while (true) {
        println("""
        Команды:
            1 <номер судна>   - показать информацию по воздушному судну
            2                 - вывести список номеров воздушных судов
            3                 - завершить работу
        """.trimIndent()
        );
        print("Введите команду: ");
        val cmd = readln().trim();
        when(cmd.substringBefore(" ")) {
            "1" -> {
                val number = cmd.substringAfter("1").trim().toIntOrNull();
                if (number == null) {
                    println("Неверно указан номер воздушного судна");
                } else {
                    val aircraft = aircraftMap[number];
                    if (aircraft != null) {
                        aircraft.printInfo();
                    } else {
                        println("Воздушное судно с номером $number не найдено.");
                    }
                }
            }
            "2" -> {
                println("Существующие номера воздушных судов:");
                for (num in aircraftMap.keys) {
                    println(num);
                }
            }
            "3" -> return;
            else -> println("Неверная команда '$cmd'");
        }
        println();
    }

}



abstract class Aircraft (
    // Номер воздушного судна
    val number: Int,
    // Дальность полёта, км
    protected val flightRange: Int,
    // Вместимость бака, л
    protected val fuelCapacity: Int
) {

    // Расход топлива, л / 100 км
    protected val fuelConsumption: Double
    get() = (fuelCapacity * 1000 / flightRange).toDouble() / 10.0;

    open fun printInfo() {
        println("""
                   Номер воздушного судна: $number
                   Дальность полёта: $flightRange км
                   Вместимость бака: $fuelCapacity л
                   Расход топлива: $fuelConsumption л / 100 км
                """.trimIndent());
    }
}

interface Passenger {
    // Кол-во пассажиров
    val passengersQuantity: Int
}

class Boeing747 (
    number: Int,
    flightRange: Int,
    fuelCapacity: Int,
    override val passengersQuantity: Int
) : Passenger, Aircraft(number, flightRange, fuelCapacity) {
    override fun printInfo() {
        super.printInfo();
        println("Количество пассажиров: $passengersQuantity");
    }
}

data class Car(val model: String, val color: String, val vin: String);

fun main(args: Array<String>) {
    val plane = Boeing747(123, 4000, 50000, 200);
    plane.printInfo();
    println();
    println(Car("Peugeot", "Green", "VFX187467JHGD7466"));
}


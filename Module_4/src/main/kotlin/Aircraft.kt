open class Aircraft (
    // Номер воздушного судна
    val number: Int,
    // Дальность полёта, км
    val flightRange: Int,
    // Вместимость бака, л
    val fuelCapacity: Int
) {

    // Расход топлива, л / 100 км
    val fuelConsumption: Double
    get() = fuelCapacity / flightRange * 100.0;
}

class Boeing747 (
    number: Int,
    flightRange: Int,
    fuelCapacity: Int,
    // Кол-во пассажиров:
    val passengersQuantity: Int
) : Aircraft(number, flightRange, fuelCapacity);


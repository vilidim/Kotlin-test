import kotlin.math.sqrt

fun main(args: Array<String>) {

    fun Double.sqrt(): Double {
        return sqrt(this);
    }

    val x: Double = 4.0;
    println(x.sqrt());

    println((7.34).sqrt());
}
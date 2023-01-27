fun main(args: Array<String>) {
    val printArrayLambda = { strings: Array<String> ->
        for (string in strings) println(string);
    }

    printArrayLambda(arrayOf("one", "two", "many"));
}
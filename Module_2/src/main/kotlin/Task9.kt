fun main(args: Array<String>) {

    val countriesWithCapitalAndCurrency = arrayOf(
        arrayOf("Китай", "Япония", "Австралия"),
        arrayOf("Пекин", "Токио", "Канберра"),
        arrayOf("юань", "иена", "австралийский доллар")
    );

    for (i in countriesWithCapitalAndCurrency[0].indices) {
        for (row in countriesWithCapitalAndCurrency) {
            print("${row[i]}\t");
        }
        println();
    }
}
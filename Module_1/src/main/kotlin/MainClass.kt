
    fun main(args: Array<String>) {
        println("Args: ${args.size}");

        println(" *** Модуль 1, задание 1 ***");

        var test1V1 : Any? = null;
        test1V1 = 7;
        // Неявное определение Double
        val test1V2 = test1V1 / 2.5;

        println("test1V2 = $test1V2");

        println(" *** Модуль 1, задание 2 ***");

        val test2V1 = "hello";
        val test2V2 = "aplana";

        println("$test2V1 $test2V2");


        println(" *** Модуль 1, задание 3 ***");

        var five: Char = '5';

        val fiveAsString = five.toString();
        // Методы депрекейтед. Для правильного преобразования необходимо знание используемой кодировки.
        val fiveAsByte = five.toByte();
        // Видимо, в обучающем курсе предполагается такое преобразование:
        val fiveAsShort = fiveAsString.toShort();
        val fiveAsInt = fiveAsString.toInt();
        val fiveAsDouble = fiveAsString.toDouble();
        val fiveAsFloat = fiveAsString.toFloat();
        val fiveAsLong = fiveAsString.toLong();

        println("fiveAsDouble = $fiveAsDouble");

        println(" *** Модуль 1, задание 4 ***");

        print("Введите ваше имя: ");
        val userName = readLine();

        println("Здравствуйте, $userName!")

        println(" *** Модуль 1, задание 5 ***");

        val alphabet = 'Z' downTo 'A';

        print("Алфавит наоборот: ");
        for (ch in alphabet) {
            print(ch);
        }
        println();

        println(" *** Модуль 1, задание 6 ***");

        var varA : Int? = null;
        while (varA == null) {
            print("Введите значение a: ");
            varA = (readLine()?:"").toIntOrNull();
            if (varA == null) println("Введено некорректное целое число");
        }
        var varB : Int? = null;
        while (varB == null) {
            print("Введите значение b: ");
            varB = (readLine()?:"").toIntOrNull();
            if (varB == null) println("Введено некорректное целое число");
        }

        val result = varA > varB;

        println("$varA > $varB: $result")
    }

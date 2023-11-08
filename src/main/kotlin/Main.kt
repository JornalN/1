fun main(args: Array<String>) {
    var taskQuestion: Boolean = true
    while (taskQuestion) {
        println("------------------------------------")
        println("Введите номер задачи (0 для завершения)")
        print("> ")
        var taskNumber: String = readln()
        println("------------------------------------")
        when (taskNumber.trim()) {
            "0" -> break
            "1" -> task1()
            "2" -> task2()
            "3" -> task3()
            else -> println("Неверный номер задачи")
        }
    }
}

fun task1() {
    println("Введите сумму перевода:")
    val amount = readln().toDouble()
    println("Коммисия составляет "+com(amount)+" рублей")
}

fun task2() {
    println("Введите количество лайков:")
    val likes = readln().toInt()
    if(likes % 10 == 1 && likes != 11)
        println("Понравилось " + likes + " человеку")
    else if(likes == 11)
        println("Понравилось " + likes + " людям")
    else
        println("Понравилось " + likes + " людям")
}

fun task3() {
    println("Постоянный покупатель? (Да/Нет)")
    val userStr: String = readln()
    var user: Boolean = false
    when (userStr.trim()) {
        "Да" -> user = true
        "Нет" -> user = false
        else -> "Ошибка"
    }
    println("Введите сумму покупки:")
    val skid = readln().toInt()
    if (skid <= 1000) {
        if (user) println("Сумма покупки составляет " + (skid - (skid * 0.01)) + " рублей. Скидка 1%")
        else println("Сумма покупки составляет " + skid + " рублей. Скидка не предоставляется")
    }
    else if(skid > 1001 && skid <= 10000) {
        if (user) println("Сумма покупки составляет " + (skid - 100 - (skid * 0.01)) + " рублей. Скидка 100 рублей и 1%")
        else println("Сумма покупки составляет " + (skid - 100) + " рублей. Скидка 100 рублей")
    }
    else {
        if (user) println("Сумма покупки составляет " + (skid - (skid * 0.05) - (skid - (skid * 0.05) *0.01)) + " рублей. Скидка 5% и 1%")
        else println("Сумма покупки составляет " + (skid - (skid * 0.05)) + " рублей. Скидка 5%")
    }
}

fun com(a:Double): Double{
    if (a>35) return a*0.0075 else return 0.0
}



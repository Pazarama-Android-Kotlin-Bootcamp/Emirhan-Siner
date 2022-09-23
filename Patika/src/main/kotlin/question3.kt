fun main(args: Array<String>) {

    val num = readLine()!!.toInt()

    var factorial: Long = 1

    for (i in 1..num) {

        factorial *= i.toLong()
    }
    println(factorial)
}
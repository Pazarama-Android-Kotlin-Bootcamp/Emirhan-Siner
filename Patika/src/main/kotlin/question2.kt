fun main() {
    println("enter array size")
    var num = readLine()!!.toInt()
    var array = Array<Long>(num) { 0 }
    var sum:Long = 0

    for (i in 0..num - 1) {
        println("please enter the numbers to be collected")

        array[i] = readLine()!!.toLong()

            sum= (array[i] + sum)

    }
    for (item in array){
        print(" $item  ")

    }
    println("")
    println(sum)

}



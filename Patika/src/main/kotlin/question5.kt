fun QuestionsMarks(str: String): String {
    val reg = """.*\?.*\?.*\?.*"""
    var value = 0
    val word = str.length
    var answer = "true"
    var pairs = false
    var now:Int
    var other:Int
    var therest:String
    while (value<word && answer == "true"){
        if (str[value].isDigit()){
            now = str[value].toString().toInt()
            other = 10-now
            therest = str.substring(value+1)
            if (therest.contains(other.toString())){
                pairs = true
                val regex = (reg+other.toString()).toRegex()
                if (!regex.containsMatchIn(therest)){
                    answer = "false"
                }
            }
        }
        value+=1
    }
    if (pairs==false){
        answer="false"
    }
    return answer;

}

fun main() {
    println(QuestionsMarks(readLine().toString()))
}
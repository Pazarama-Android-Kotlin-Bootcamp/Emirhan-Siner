fun validate(str: String): Boolean {
    val str= readLine()!!
    val length = str.length
    val underScoreChar = '_'
    val lastIndex = length - 1

    if (length !in 4..25 || !Character.isLetter(str[0]) || str[lastIndex] == underScoreChar) return false

    return true
}

/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

fun sumCalculator(s: Array<Int>, indexTemp: Int, m: Int): Int {
    var sum: Int = 0
    if(indexTemp + m > s.size) {
        return -1
    }
    for(index in indexTemp..indexTemp + m - 1) {
        sum += s[index]
    }
    return sum
}

fun birthday(s: Array<Int>, d: Int, m: Int): Int {
    // Write your code here
    var result: Int = 0
    
    for(index in 0..s.size) {
        if(d == sumCalculator(s, index, m)) {
            result++
        }
    }
    
    return result
}

fun main() {
    var apples = arrayOf<Int>(1, 2, 1, 3, 2)
    //var oranges = arrayOf<Int>(16, 32, 96)

    println(birthday(apples, 3, 2))
}

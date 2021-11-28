/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {
    // Write your code here
    var position1 = x1
    var position2 = x2
    for(i in 1..10000) {
        if((position1 + v1) == (position2 + v2)) {
            return "YES"
        } else {
            position1 += v1
            position2 += v2
        }
    }
    return "NO"
}

fun main() {
    // var apples = arrayOf<Int>(-2, 2, 1)
    // var oranges = arrayOf<Int>(5, -6)

    println(kangaroo(4523, 8092, 9419, 8076))
}

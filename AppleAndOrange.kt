// https://www.hackerrank.com/challenges/apple-and-orange/problem?isFullScreen=true

fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>): Unit {
    var applesCount : Int = 0
    var orangesCount : Int = 0
    // apples
    for(apple in apples) {
        if((a + apple) >= s && (a + apple) <= t) {
            applesCount++
        }
    }
    // oranges
    for(orange in oranges) {
        if((b + orange) >= s && (b + orange) <= t) {
            orangesCount++
        }
    }
    
    println("$applesCount")
    println("$orangesCount")
}

fun main() {
    var apples = arrayOf<Int>(-2, 2, 1)
    var oranges = arrayOf<Int>(5, -6)

    countApplesAndOranges(7, 11, 5,15, apples, oranges)
}
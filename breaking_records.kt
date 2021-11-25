/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

fun breakingRecords(scores: Array<Int>): Array<Int> {
    // Write your code here
    var min: Int = scores[0]
    var max: Int = scores[0]
    var minCnt: Int = 0
    var maxCnt: Int = 0
    
    for(item in scores) {
        if(item > max) {
            maxCnt++
            max = item
        }
        if(item < min) {
            minCnt++
            min = item
        }
    }
    
    var results = arrayOf<Int>(maxCnt,minCnt)
	return results
}

fun main() {
    var apples = arrayOf<Int>(10, 5, 20, 20, 4, 5, 2, 25, 1)
    //var oranges = arrayOf<Int>(16, 32, 96)

    //println(getTotalX(apples, oranges).toString())
    for(i in breakingRecords(apples)) {
        println(i)
    }
}

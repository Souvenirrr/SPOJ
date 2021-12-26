/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

fun getData(a: Array<Int>): Int {
    var count: Int = 1
   	var max: Int = -1
    a.sort()
    var first = a[0]
    for((index, item) in a.withIndex()) {
        if(index > 0) {
            if(item - first <= 1) {
                count++
            } else {
                count = 1
                first = item
            }
        }
        if(count > max) {
            max = count
        }
    }
    return max
}

fun main() {
    val numbers = arrayOf(4, 6, 5, 3, 3, 1)
    
    println(getData(numbers))
}


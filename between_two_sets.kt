/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

fun getTotalX(a: Array<Int>, b: Array<Int>): Int {
    // Write your code here
    var cnt: Int = 0
    for(i in 1..100) {
        var ok: Boolean = true
        for((index, j) in a.withIndex()) {
            if(!ok) { 
                break 
            }
            if (i % a[index] != 0){ 
                ok = false
            }
        } 
        for((index, j) in b.withIndex()) {
            if(!ok){ break }
            if (b[index] % i != 0){ ok = false }
        } 
        if (ok){ cnt++ }
    }
    
    return cnt
}

fun main() {
    var apples = arrayOf<Int>(2,4)
    var oranges = arrayOf<Int>(16, 32, 96)

    println(getTotalX(apples, oranges).toString())
}

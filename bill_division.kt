Solutions
Docs
Community
Teach
Play
Play
Hands-on
Examples
Koans




/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */
​
fun bonAppetit(bill: Array<Int>, k: Int, b: Int): Unit {
    // Write your code here
    var sumA: Int = 0
    var sumB: Int = 0
    for((index, item) in bill.withIndex()) {
        if(index != k) {
            sumA += item
        }
        sumB += item
    }
    
    sumA = sumA / 2
    sumB = sumB / 2
    if(b - sumA > 0) {
        println("${b-sumA}")
        return
    }
    println("Bon Appetit")
}
​
​
​
fun main() {
    var list = arrayOf(3, 10, 2, 9)
//     println(migratoryBirds(list))
    println(bonAppetit(list, 1,12))
//     println(dayOfProgrammer(1917))
//     println(dayOfProgrammer(1915))
}

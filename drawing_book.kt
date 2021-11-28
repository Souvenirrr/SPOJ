/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

fun pageCount(n: Int, p: Int): Int {
    // Write your code here
    var min: Int = (n/2)-(p/2)
    
    if(min>p/2) {
        min=p/2
    }
    
    return min;
}



fun main() {
    var list = arrayOf(3, 10, 2, 9)
//     println(migratoryBirds(list))
    println(pageCount(5,4))
//     println(dayOfProgrammer(1917))
//     println(dayOfProgrammer(1915))
}

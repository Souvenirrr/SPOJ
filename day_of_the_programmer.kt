/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

fun dayOfProgrammer(year: Int): String {
    // Write your code here
    if(year >= 1700 && year <= 1917) {
        if(year % 4 == 0) {
            return "12.09.$year"
        } else {
            return "13.09.$year"
        }
    }
    
    if(year >= 1919) {
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return "12.09.$year"
        } else {
            return "13.09.$year"
        }
    }
    return "26.09.1918"
}


fun main() {
//     var list = arrayOf(1, 4, 4, 4, 5, 3)
//     println(migratoryBirds(list))
    println(dayOfProgrammer(1916))
    println(dayOfProgrammer(1917))
    println(dayOfProgrammer(1915))
}

/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

import kotlin.math.abs

fun catAndMouse(x: Int, y: Int, z: Int): String {
    if(abs(x-z) == abs(y-z)) {
        return "Mouse C"
    }
    if(abs(x-z) < abs(y-z)) {
        return "Cat A"
    }
    return "Cat B"
}




fun main() {
    var list = arrayOf(3, 10, 2, 9)
//     println(migratoryBirds(list))
    println(catAndMouse(1,2,3))
//     println(dayOfProgrammer(1917))
//     println(dayOfProgrammer(1915))
}

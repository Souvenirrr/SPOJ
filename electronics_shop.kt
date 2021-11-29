/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

fun getMoneySpent(keyboards: Array<Int>, drives: Array<Int>, b: Int): Int {
    /*
     * Write your code here.
     */
    var max: Int = -1
    
    for(keyboard in keyboards.reversed()) {
        for(drive in drives.reversed()) {
            if((keyboard + drive) <= b && (keyboard + drive) > max) {
                max = keyboard + drive 
            }
        }
    }
    return max
}

fun main() {
    var apples = arrayOf<Int>(5,3,1) 
    var test1 = arrayOf<Int>(3,1) 
    var test2 = arrayOf<Int>(5,2,8) 
    
    //var oranges = arrayOf<Int>(16, 32, 96)

    println(getMoneySpent(test1, test2, 10))
}

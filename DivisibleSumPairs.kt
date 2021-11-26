fun divisibleSumPairs(n: Int, k: Int, ar: Array<Int>): Int {
    // Write your code here
    var result : Int = 0
    for(index in 0..ar.size - 2) {
        for(i in index + 1..ar.size - 1) {
            if((ar[index] + ar[i]) % k == 0) {
                result++
            }
        }
    }
    return result
}
fun main() {
    var list = arrayOf(1, 4, 4, 4, 5, 3)
    println(divisibleSumPairs(6, 3, list))
}

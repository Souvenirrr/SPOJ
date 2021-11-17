fun number(number: Int) : Int {
    for(i in 1..4) {
        var num = number + i
        if(num % 5 == 0) {
            return num
        }
    }
    return 0
}

fun gradingStudents(grades: Array<Int>): Array<Int> {
    // Write your code here
    for((index, grade) in grades.withIndex()) {
        if(grade >= 38 && grade % 5 != 0) {
            if((number(grade) - grade) < 3) {
                grades.set(index, number(grade))
            }
        }
    }
    return grades
}

fun main(args: Array<String>) {
    val gradesCount = readLine()!!.trim().toInt()

    val grades = Array<Int>(gradesCount, { 0 })
    for (i in 0 until gradesCount) {
        val gradesItem = readLine()!!.trim().toInt()
        grades[i] = gradesItem
    }

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))
}
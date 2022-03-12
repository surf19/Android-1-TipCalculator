data class ExamResult(val name: String, val score: Int)

fun main() {
    runTests()
}

// Return "A" if the score is b/w 90 and 100
//        "B" if the score is b/w 80 and 89
//        "C" if the score is b/w 70 and 79
//        "F" for anything else
fun getExamGrade(result: ExamResult): String {
    // TODO: fill this in
    return when (result.score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "F"
    }
}

// Return the number of exam results which had a score higher than the threshold parameter
fun countScoresHigherThan(threshold: Int, results: List<ExamResult>): Int {
    // TODO: fill this in
    // lambda function used below
    return results.count { it.score > threshold }
}

fun runTests() {
    val examResults = listOf(
        ExamResult("Mary", 91),
        ExamResult("John", 85),
        ExamResult("Rahul", 70),
        ExamResult("Noob", 42),
        ExamResult("Nala", 99),
        ExamResult("George", 81)
    )
    check("A" == getExamGrade(examResults[0])) {
        "91 should translate to an A"
    }
    check("B" == getExamGrade(examResults[1])) {
        "85 should translate to a B"
    }
    check("C" == getExamGrade(examResults[2])) {
        "70 should translate to a C"
    }
    check("F" == getExamGrade(examResults[3])) {
        "42 should translate to an F"
    }

    check(2 == countScoresHigherThan(85, examResults)) {
        "Two students scored higher than 85"
    }
}

// ------------------
//fun main() {
//    println("Hello Android Devs !!")
//
//    val myList: List<Int> = listOf(41, 19, 91)
//    myList[myList.size-1]
//    myList[myList.lastIndex]
//    val last = myList.last()
//
//    // type inference
//    val lastS: String = "Stanford"
//
//    // Immutability
//    var age = 35
//    age += 1
//
//    val otherFriends: MutableList<String> = mutableListOf("May", "mark")
//    otherFriends[0] = "June"


    //-----------------
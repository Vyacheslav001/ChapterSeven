data class Student(
    val firstName: String,
    val lastName: String,
    val house: String,
    val year: Int = 1
)

fun main() {

    //Task 1

    val s1 = Student("Ron", "Weasley", "Gryffindor")
    val s2 = Student("Draco", "Malfoy", house = "Slytherin")
    val s3 = s1.copy(firstName = "Fred", year = 3)
    val s4 = s3.copy(firstName = "George")

    val array = arrayOf(s1, s2, s3, s4)
    for ((firstName, lastName, house, year) in array) {
        println("$firstName $lastName is in $house year $year")
    }

    println()

    for (item in array){
        println("${item.firstName} ${item.lastName} is in ${item.house} year ${item.year}")
    }

    println()

    //Task 2

    val s5 = Student("Ron", "Weasley", "Gryffindor")
    val s6 = Student(lastName = "Malfoy", firstName = "Draco", year = 1, house = "Slytherin")
    val s7 = s1.copy(firstName = "Fred")
//    s7.year = 3
    val s8 = s7.copy(firstName = "George")

    val array2 = arrayOf(s5, s6, s7, s8)
    for (s in array2) {
        println("${s.firstName} ${s.lastName} is in ${s.house} year ${s.year}")
    }
}
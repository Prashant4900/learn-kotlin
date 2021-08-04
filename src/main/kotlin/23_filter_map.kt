fun main() {

    val myNumbers: List<Int> = listOf(2, 3, 4, 6, 23, 90)

    val mySmallNums = myNumbers.filter { it < 10 }    // OR { num -> num < 10 }
    for (num in mySmallNums) {
        print("$num ")
    }

    println()

    val mySquaredNums = myNumbers.map { it * it }     // OR { num -> num * num }
    for (num in mySquaredNums) {
        print("$num ")
    }

    println()

    val people = listOf(Pperson("Steve"), Pperson("Annie"), Pperson("Sam"))
    val names = people.filter { person -> person.name.startsWith("S") }.map { it.name }

    for (name in names) {
        print("$name ")
    }
}

class Pperson(var name: String) {
    // Some other code..
}

/*

*************************************************OUTPUT****************************************************

                                            2 3 4 6
                                            4 9 16 36 529 8100
                                            Steve Sam

*************************************************OUTPUT****************************************************

*/
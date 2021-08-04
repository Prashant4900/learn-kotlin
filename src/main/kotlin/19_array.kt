fun main() {

    val myArray = Array<Int>(5) {0}

    // Empty Array Called
    for (element in myArray) {
        print("$element ")
    }
    println()
    myArray[2] = 50
    myArray[4] = 5

    for (element in myArray) {
        print("$element ")
    }

}

/*

*************************************************OUTPUT****************************************************

                                                0 0 0 0 0
                                                0 0 50 0 5

*************************************************OUTPUT****************************************************

*/
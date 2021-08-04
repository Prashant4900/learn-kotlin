fun main() {
    println("For Loop")
    for(i in 1..5){
        print("$i ")
    }

    println()
    for(i in 5 downTo 1){
        print("$i ")
    }

    println()
    for(i in 10 downTo 1 step 2 ){
        print("$i ")
    }

    println("\nWhile Loop")
    var x:Int = 0
    while (x < 5){
        print("$x ")
        x++
    }

    println("\nDo While")
    var y:Int = 0
    do {
        print("$y ")
        y++
    } while (y < 5)
}

/*

*************************************************OUTPUT****************************************************

                                    For Loop
                                    1 2 3 4 5
                                    5 4 3 2 1
                                    10 8 6 4 2
                                    While Loop
                                    0 1 2 3 4
                                    Do While
                                    0 1 2 3 4

*************************************************OUTPUT****************************************************

*/
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
fun main(args: Array<String>) {
    val ran1 = 'a'..'z'
    println(ran1)

    val ran2 = 5 downTo 1 step 2
    println(ran2)

    val ran3 = 5 downTo 1 // 5..1 replace with this
    println(ran3)

    val isPresent: Boolean = 'c' in ran1
    println(isPresent)

    val ran4 = 1
    println(ran4)
}

/*

*************************************************OUTPUT****************************************************

                                    a..z
                                    5 downTo 1 step 2
                                    5 downTo 1 step 1
                                    true
                                    1

*************************************************OUTPUT****************************************************

*/
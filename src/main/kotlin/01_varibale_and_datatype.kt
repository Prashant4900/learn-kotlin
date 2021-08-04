fun main(args: Array<String>) {
    var myNumber = 5 // its change in future
    val mySecondNum = 10 // its can't we change

    println(myNumber)
    myNumber = 45
    println(myNumber)

    println(mySecondNum)
//    mySecondNum = 80
//    println(mySecondNum)

    var str: String = "Change is future"
    val str1: String = "Can not Change is future"

//    println(str + " " + str1) //not recomma
//    println("$str $str1")

    str = "fffff"
    println(str)
    print(str1)

}

/*

*************************************************OUTPUT****************************************************

                                    5
                                    45
                                    10
                                    fffff
                                    Can not Change is future

*************************************************OUTPUT****************************************************

*/
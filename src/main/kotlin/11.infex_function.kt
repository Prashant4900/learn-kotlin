fun main() {

    val x: Int = 6
    val y: Int = 10

    val greaterVal = x findGreaterValue y   // x.findGreaterValue(y)

    println(greaterVal)
    

}

infix fun Int.findGreaterValue(other: Int): Int {       // INFIX and Extension Func

    return if (this > other)
        this
    else
        other
}

/*
*       1. All INFIX Functions are Extension functions
*            But all Extension functions are not INFIX
*       2. INFIX Functions just have ONE PARAMETER
* */


/*

*************************************************OUTPUT****************************************************

                                                   10

*************************************************OUTPUT****************************************************

*/
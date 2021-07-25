package functions.com.kotlin

import functions.com.java.JavaFile

fun main(args: Array<String>) {

    val javaObj = JavaFile.getArea(5,2)
    println(javaObj)
}

fun getCircleArea(radius: Double): Double {
    return 3.14 * radius * radius
}
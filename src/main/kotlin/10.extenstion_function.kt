fun main(args: Array<String>) {
    val stdObj = Student()
    val name = stdObj.displayStudentName(name = "Rahul")
    val age = stdObj.displayAge(25)
    val obj: Double = 0.0
    println("Student Name is $name and it's age $age extra ${obj.area(l = 20.0,b = 10.5)}")
}

fun Student.displayAge(age:Int):Int = age

class Student {
    fun displayStudentName(name: String) = name
}

fun Double.area(l:Double,b:Double) = l*b
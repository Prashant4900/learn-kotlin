fun main() {
    val person = Man()
    println("only c and d visible")
    println("C: ${person.c} D: ${person.d}")
}

open class Person {
    private var a: Int = 0 // only visible in the own class
    protected var b:Int = 1 // oly visible in child and own class
    internal var c:Int = 2 // only visible in the same module
    var d:Int = 3 // visible every where


    init {
        println("All Element Visible in Own Class")
        println("A: $a B: $b C: $c D: $d")
    }
}

class Man: Person() {
    init {
        println("A Not Visible in Child Class Because it's private")
        println("B: $b C: $c D: $d")
    }
}


/*

*************************************************OUTPUT****************************************************

                                        All Element Visible in Own Class
                                        A: 0 B: 1 C: 2 D: 3
                                        A Not Visible in Child Class Because it's private
                                        B: 1 C: 2 D: 3
                                        only c and d visible
                                        C: 2 D: 3

*************************************************OUTPUT****************************************************

*/
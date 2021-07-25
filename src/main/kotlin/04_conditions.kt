fun main() {
    val demo = IfElseDemo()
    demo.findMax()

    val obj = WhenDemo()
    obj.desPlay()
}

class IfElseDemo {

    fun findMax(){
        val a = 45
        val b = 80

        val max: Int = if (a>b){
            a
        } else {
            b
        }
        println(max)
    }
}

class  WhenDemo {

    fun desPlay(){
        val x = 1

        when (x) {
            1 -> println("x is 1")
            in 1..5 -> println("x in bwt 1 to 5")
            !in 10..15 -> println("x is not bwt 10 to 15")
            else -> print(x)
        }
    }
}
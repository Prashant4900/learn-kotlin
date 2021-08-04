fun main() {
    val math = LocalClass()

    // First Way
//    val lambdaFunction: (Int, Int) -> Int = { x: Int, y: Int -> x + y }
//    math.add(5, 5, function = lambdaFunction)

    // Second Way
//     val sum =  math.add(5,5,function= { x, y -> x + y})

    // Tried Way
    math.add(5, 10) { x , y -> x * y }  // lambda expression [function]

    // clouser -> its allow to change the value of outer object veriable
    var result = 0
    math.calculate(x = 5, y = 15) { x: Int, y: Int -> result = x * y }
    println(result)

    // it -> only take single parameter
    //    math.reversed("Rahul"){s -> s.reversed()}
    math.reversed("Rahul"){it.reversed()}

    // with and apply
    /* Normal Way */
    math.str1 = "value1"
    math.str2 = "value2"
    math.show()

    /* with lambda */
    with(math) {
        str1 = "aaaaa"
        str2 = "bbbbb"
    }

    math.show()

    /* apply lambda */
    math.apply {
        str1 = "vsdvds"
        str2 = "aefef"
    }.show()
}


class LocalClass {

    var str1: String = ""
    var str2: String = ""

    fun show() {
        println("str1: $str1 and str2: $str2")
    }

    fun add(x: Int, y: Int, function: (Int, Int) -> Int) { // high level function with lambda as parameter
        val result = function(x, y) // body {x+y}
        println(result)
    }

    fun calculate(x: Int, y: Int, function: (Int, Int) -> Unit) { // high level function with lambda as parameter
        function(x, y) // body {x+y}
    }

    fun reversed(s: String, function: (String) -> String) {
        val result =  function(s)
        println(result)
    }
}

/*

*************************************************OUTPUT****************************************************

                                    50
                                    75
                                    luhaR
                                    str1: value1 and str2: value2
                                    str1: aaaaa and str2: bbbbb
                                    str1: vsdvds and str2: aefef

*************************************************OUTPUT****************************************************

*/
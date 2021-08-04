fun main() {

    //    var list = mutableListOf<String>()  // Mutable, No Fixed Size, Can Add or Remove Elements
    //    var list = arrayListOf<String>()    // Mutable, No Fixed Size, Can Add or Remove Elements
    val list = ArrayList<Int>()      // Mutable, No Fixed Size, Can Add or Remove Elements
    list.add(5)
    list.add(9)
    list.add(2)

    for (element in list) {             // Using individual elements (Objects)
        print("element $element ")
    }
    println()

    list.remove(9)
    list.add(8)
    list[1] = 6

    for (element in list) {             // Using individual elements (Objects)
        print("element $element ")
    }
}

/*

*************************************************OUTPUT****************************************************

                                            element 5 element 9 element 2
                                            element 5 element 6 element 8

*************************************************OUTPUT****************************************************

*/
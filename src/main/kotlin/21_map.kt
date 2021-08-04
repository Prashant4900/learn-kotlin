fun main() {

    // Map Tutorial: Key-Value pair
    //    var myMap = HashMap<Int, String>()      // Mutable, READ and WRITE both, No Fixed Size
    //    var myMap = mutableMapOf<Int, String>() // Mutable, READ and WRITE both, No Fixed Size
    val myMap = hashMapOf<Int, String>()      // Mutable, READ and WRITE both, No Fixed Size

    myMap[4] = "Rahul"
    myMap.put(43, "Abhishek")
    myMap.put(7, "Sahil")

    myMap.put(43, "Prashant")

    for (key in myMap.keys) {
        println("Element at $key = ${myMap[key]}")  // myMap.get(key)
    }
}

/*

*************************************************OUTPUT****************************************************

                                            Element at 4 = Rahul
                                            Element at 7 = Sahil
                                            Element at 43 = Prashant

*************************************************OUTPUT****************************************************

*/
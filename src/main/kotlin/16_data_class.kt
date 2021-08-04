fun main() {
    // Constants
    val obj1 = Constants("Ram")
    val obj2 = Constants(name = "Ram")

    // Dummy
    val obj3 = Dummy("Ram")
    val obj4 = Dummy(name = "Ram")

    println("Constants obj1: $obj1")
    println("Constants obj2: $obj2")
    println("Dummy obj3: $obj3")
    println("Dummy obj4: $obj4")





    if (obj1 == obj2) {
        println("Constants data class objects are same")
    } else {
        println("Constants data class objects are not same")
    }

    if (obj1.name == obj2.name) {
        println("Constants data class values are same")
    } else {
        println("Constants data class values are not same")
    }

    if (obj3 == obj4) {
        println("Dummy class objects are same")
    } else {
        println("Dummy class objects are not same")
    }

    if (obj3.toString() == obj4.toString()) {
        println("Dummy class toString are same")
    } else {
        println("Dummy class toString are not same")
    }

}

class Dummy(name: String) {
    init {
        println("Called Dummy Class Constructor Name: $name")
    }
}


data class Constants(var name: String) {
    init {
        println("Called Constants data Class Constructor Name: $name")
    }
}

/*

*************************************************OUTPUT****************************************************

                                    Called Constants data Class Constructor Name: Ram
                                    Called Constants data Class Constructor Name: Ram
                                    Called Dummy Class Constructor Name: Ram
                                    Called Dummy Class Constructor Name: Ram
                                    Constants obj1: Constants(name=Ram)
                                    Constants obj2: Constants(name=Ram)
                                    Dummy obj3: Dummy@610455d6
                                    Dummy obj4: Dummy@511d50c0
                                    Constants data class objects are same
                                    Constants data class values are same
                                    Dummy class objects are not same
                                    Dummy class toString are not same

*************************************************OUTPUT****************************************************

*/
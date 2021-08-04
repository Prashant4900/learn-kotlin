fun main(args: Array<String>) {
    Car("Red","Honda")
    println("***********************************************")
    Book("Sanjay",book = "One day life")
}

open class Vehicle(color: String) {

    init {
        println("Vehicle Color is: $color")
    }

}

class Car(color: String, company: String): Vehicle(color) {
    init {
        println("Car Color: $color and Company is: $company")
    }
}
open class Auther {
     private var name:String = ""

    constructor(name: String) {
        this.name = name
        println("Auther Name: $name")
    }

}

class  Book: Auther{
    private var book: String = ""

    constructor(name: String, book:String): super(name) {
        this.book = book
        println("Auther Name: $name and Book is: $book")
    }
}


/*

*************************************************OUTPUT****************************************************

                                    Vehicle Color is: Red
                                    Car Color: Red and Company is: Honda
                                    ***********************************************
                                    Auther Name: Sanjay
                                    Auther Name: Sanjay and Book is: One day life

*************************************************OUTPUT****************************************************

*/
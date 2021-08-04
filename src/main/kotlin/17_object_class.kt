fun main(){
    val obj = MyClass
    println(MyConfig.urlPath)
    println(MyConfig.name)
    println(MyConfig.value)
    println(MyClass.props2)
    println(obj.props2)
}

object MyConfig: MyDummy() {
    var urlPath: String = "https://www.google.com/"
}

open class MyDummy : MyInterface {
    var name:String = "MyDummy class properties"
    override var value: String = "Interface value properties"
}

interface MyInterface {
    var value: String
}

class MyClass {
    // Never Called
    object ObjectInsideClass1 {
        var props1 :String = "ObjectInsideClass1"
    }

    companion object ObjectInsideClass2 {
        var props2 :String = "ObjectInsideClass2"
    }
}

/*

*************************************************OUTPUT****************************************************

                                    https://www.google.com/
                                    MyDummy class properties
                                    Interface value properties
                                    ObjectInsideClass2
                                    ObjectInsideClass2

*************************************************OUTPUT****************************************************

*/
fun main(aa: Array<String>) {
    var name = "parent"

    var obj = Display("contracture")

    obj.name = "child"
    obj.displayName()
    obj.displayParentName(name)
    obj.displayContractureName()

    println(obj.childName)
    obj.childName = "changed"
    println(obj.childName)
}

class Display(var contractureName: String = "") {
    var name: String = ""
    var childName = "child Name"

    fun displayName(){
        println(name)
    }

    fun displayParentName(superName: String){
        println(superName)
    }
    fun displayContractureName(){
        println("contractureName: $contractureName")
    }
}

/*

*************************************************OUTPUT****************************************************

                                    child
                                    parent
                                    contractureName: contracture
                                    child Name
                                    changed

*************************************************OUTPUT****************************************************

*/
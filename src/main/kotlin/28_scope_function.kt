class DemoClass {
    var name: String = "Sriyank Siddhartha"
    var age: Int = 26
}

fun main() {

    println("************************************[With]**********************************************")

    /** Scope Function: 'with'
    Property 1: Refer to context object by using 'this'
    Property 2: The return value is the 'lambda result'  */

    val demo = DemoClass()

    val bio: String = with(demo) {
        println(name)
        println(age)
        age + 5
        "He is a freak who loves to teach in his own way" // will be returned and stored in 'bio' String variable
    }

    //    println("Age after five years is $ageAfterFiveYears")
    println(bio)

    println("************************************[Apply]**********************************************")

    /** Scope Function: 'apply'
    Property 1: Refer to context object by using 'this'
    Property 2: The return value is the 'context object'  */

    val demo1 = DemoClass().apply {
        name = "Sriyank Siddhartha"
        age = 26
    }

    with(demo1) {
        println(name)       // prints   Sriyank Siddhartha
        println(age)        // prints   26
    }

    // Perform some other operations on 'person' object
    demo1.also {
        it.name = "Shreks from Smartherd"
        println("New name: ${it.name}")     // prints   New name: Shreks from Smartherd
    }

    println("************************************[Run]**********************************************")

    /** Scope Function: 'run'
    Property 1: Refer to context object by using 'this'
    Property 2: The return value is the 'lambda result'  */

    // 'run' is combination of 'with' and 'let'
    // If you want to operate on a Nullable object and avoid NullPointerException then use 'run'

    val person: DemoClass? = DemoClass()

    val bio1 = person?.run {
        println(name)
        println(age)
        age + 5
        "He is a freak who loves to teach in his own way"   // will be returned and stored in 'bio' variable
    }

    println(bio1)

    println("************************************[Also]**********************************************")


    /** Scope Function: 'also'              'ALSO PERFORM THE FOLLOWING EXTRA OPERATION'
    Property 1: Refer to context object by using 'it'
    Property 2: The return value is the 'context object'  */

    // Initialise numbersList
    val numbersList: MutableList<Int> = mutableListOf(1, 2, 3)

    // Some other code... may be a function call or program to swap numbers (doesn't matter what code)

    // Operations on the 'numbersList'
    val duplicateNumbers = numbersList.also {
        println("The list elements are: $it")
        it.add(4)
        println("The list elements after adding an element: $it")
        it.remove(2)
        println("The list elements after removing an element: $it")
    }

    // duplicateNumbers will be same as numbersList
    println("Original numbers: $numbersList")
    println("Duplicate numbers: $duplicateNumbers")

    println("************************************[Let]**********************************************")


    /** Scope Function: 'let'
    Property 1: Refer to context object by using 'it'
    Property 2: The return value is the 'lambda result'  */

    // Use 'let' function to avoid NullPointerException

    val name: String? = "Hello"

    // Execute the lambda expression only if the 'name' variable is NOT NULL
    val stringLength = name?.let {
        println(it.reversed())
        println(it.capitalize())
        it.length       // Will be returned and stored within stringLength variable
    }

    println(stringLength)


}

/*

*************************************************OUTPUT****************************************************

                                        **********[With]**********
                                        Sriyank Siddhartha
                                        26
                                        He is a freak who loves to teach in his own way
                                        **********[Apply]**************
                                        Sriyank Siddhartha
                                        26
                                        New name: Shreks from Smartherd
                                  ***************[Run]************
                                        Sriyank Siddhartha
                                        26
                                        He is a freak who loves to teach in his own way
                       ****************[Also]**********************
                                        The list elements are: [1, 2, 3]
                                        The list elements after adding an element: [1, 2, 3, 4]
                                        The list elements after removing an element: [1, 3, 4]
                                        Original numbers: [1, 3, 4]
                                        Duplicate numbers: [1, 3, 4]
                     ****************[Let]****************
                                        olleH
                                        Hello
                                        5


*************************************************OUTPUT****************************************************

*/
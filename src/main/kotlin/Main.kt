fun main() {
    println(sum(45, 34))
    greet("Mary")
    println( isAdult(17))
}

//Create a function sum that takes two parameters and returns their sum.


fun sum(x: Int, y: Int): Int {
    return (x + y)
}
//Define a function greet that takes a name as a parameter and prints a personalized greeting.


fun greet(name: String) {
    var greeting = "Hello $name"
    println(greeting)
}

//Create a function isAdult that takes age as a parameter and returns a boolean indicating if the person is an adult (age >= 18).
fun isAdult(age: Int): Boolean {
    if (age >= 18) {
        return (true)
    } else {
        return (false)
    }


}

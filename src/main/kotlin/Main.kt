fun main() {
    println(sum(45, 34))
    greet("Mary")
    println( isAdult(17))


    /*Did this on March 22*/
    text("123")
    reverseString("akirachix")
    words(arrayOf(12,23,24,35,36))
    /*println(text("123"))
    println(reverseString("akirachix"))*/
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

/*Questions on returning done in March 20*/
/* Convert a string "123" to an integer and store it in a variable.*/
fun text(word:String):Int{
    return word.toInt()
}

/*Write a function reverseString that takes a string as input and returns its reverse.*/
fun reverseString(name:String):String{
    val reversedString =( name.reversed())
    return reversedString

}
/*Write a function that takes an array of integers as a parameter and print the sum of all the elements.*/

fun words(numbers:Array<Int>){
    println(numbers.sum())
}

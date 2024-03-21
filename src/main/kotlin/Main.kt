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

    /*did this on march 23*/
    myFriends("jane","mercy","nancy","lucy")
    statistics()
    words("nanny","mary","nancy")


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


//create a function that takes in 4 strings and creates an array out of them then prints out the array.
fun myFriends(name1:String,name2:String,name3:String,name4:String){
    var friends = arrayOf(name1,name2,name3,name4)
    println(friends.contentToString())
}



//create one function that is given array
    fun statistics () {
        var numbers = arrayOf(32, 17, 4, 213, 78, 43, 90, 31, 3, 73, 11, 158, 62)
        print(numbers[1] + numbers[4])
        var index =numbers.indexOf(158)
    println(index)
        var sortedNumbers = numbers.sortedArray()
    println(sortedNumbers.contentToString())




    }
//create a function that takes in 3 names and returns a string array containing all 3 names.
fun words(namea:String,nameb:String,namec:String):String{
    var names = arrayOf(namea,nameb, namec)
    return names.contentToString()
}



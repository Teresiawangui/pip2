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
    words("nanny","mary","nancy").contentToString()

    //25 march
    var human = Human("mercy",56,34.56)
    human.eat(2)
    println(human.speak("hello mary"))
    human.birthday()
    println(human.age)
    sentence("Barbie bakes brown bagels and buns")


//April 1
    wordSentence("Barbie bakes brown bagels and buns")
    numbers(arrayOf())
    sphere(20,3.14159)
    isPalindrome("madam,wow,kayak")

//April 2
var product = Product("rice",140,5.0)
    product.totalCost()

    var animal =Animal("cat","meew")
    animal.makeSound()

    var customer = Customer("mkandoe","mkandoeo@mercy","345cd")
    customer.sendMessage()



    //April 4
        printOddNumbers()
        println(students(arrayOf("meg","Jane","Audrey","Britney")))
        numbers()
        serveDrinksByAge(15)





}
// march 19
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

/*Questions on returning done in March 22*/
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

// 23 March
//create a function that takes in 4 strings and creates an array out of them then prints out the array.
fun myFriends(name1:String,name2:String,name3:String,name4:String){
    var friends = arrayOf(name1,name2,name3,name4)
    println(friends.contentToString())
}



//create one function that is given array
    fun statistics () {
        var numbers = arrayOf(32, 17, 4, 213, 78, 43, 90, 31, 3, 73, 11, 158, 62)
        println(numbers[1] + numbers[4])
        var index =numbers.indexOf(158)
    println(index)
        var sortedNumbers = numbers.sortedArray()
    println(sortedNumbers.contentToString())




    }
//create a function that takes in 3 names and returns a string array containing all 3 names.
fun words(namea:String,nameb:String,namec:String):Array<String> {
    var names = arrayOf(namea, nameb, namec)
    return names
}
//1. Write and invoke a function that given the string “Barnie bakes brown bagels
//and buns” prints out a list of all the other words and characters making up the
//string excluding all possible occurrences of the letter b.
fun sentence(text:String){

    println(text.lowercase().replace("b",""))
}
//25 March
//create a class called Human with these attributes:name,age,weight.it has the following:
class Human(var name:String,var age:Int,var weight:Double){
    fun eat(foodWeight:Int){
        weight += foodWeight
        println("I am eating $foodWeight kgs of food")
        println(weight)
    }
    fun speak(speech:String){
        println(speech)
    }
    fun birthday(){
        age +=1
    }}

//April 1
//1. Write and invoke a function that given the string “Barnie bakes brown bagels
//and buns” prints out a list of all the other words and characters making up the
//string excluding all possible occurrences of the letter b.
fun wordSentence(text:String){

    println(text.lowercase().replace("b",""))


}
//2. Write and invoke one function that takes in an array of integers and returns
//these 3 values: sum, count and average of all the elements.
fun numbers(num:Array<Int>):Array<Int>{
    var statistic = arrayOf(21, 14, 56, 18, 9, 32, 5, 6, 32, 67, 88, 43)
    (statistic.count())
    (statistic.sum())
    (statistic.average())
    (statistic.sum() / statistic.size)
    (statistic.sum().toDouble() / statistic.size)
    return statistic
}
//3. The volume of a sphere is calculated using the formula below

//V = 4/3 π r
//3

//Write and invoke a function that is capable of accurately calculating the
//volume of any sphere given its radius. Use 3.14159 as π
fun sphere(radius:Int,pi:Double){
    var volume=4/3 * pi * radius
    println(volume)
}
//4. A palindrome is a string that reads the same forwards and backwards e.g
//madam, wow, kayak. Write and invoke a function:
//isPalindrome(word: String): Boolean
//that takes in a single word and returns true or false depending on whether the
//word is a palindrome.
fun isPalindrome(word:String):Boolean {
    var text = "madam,wow,kayak"
    if (word == text)
        return true

    else{
        return false
    }
}
//April 2
//write a Kotlin program that creates a class "product" with properties for name,price,and quantity.Calculate
//the total cost of the product with a function.
class Product(var name:String, var price:Int, var quantity:Double) {

    fun totalCost() {
        var cost = quantity * price
        println(cost)
    }
}
// Write a Kotlin program that creates a class 'Animal' with properties for name and sound. Include a function
// to make the animal's sound.
class Animal(var name :String,var sound:String){
    fun makeSound(){
        println("moo moo")
    }
}
//Write a Kotlin program that creates a class 'Customer' with properties for name, email, and address. Include
// a function to send a welcome email to the customer.
class Customer(var name:String,var email:String,var address:String){
    fun sendMessage(){
        println("welcome $name follow $email at $address to find us")
    }


}
//April 4
fun printOddNumbers() {
    for (i in 1..100) {
        if (i % 2 != 0) {
            println(i)
        }
    }
}
fun students(name:Array<String>) : Int {
    return name.count() {it.length > 5}
}
fun serveDrinksByAge(guestAge:Int){
    if(guestAge <= 6){
        println("serve a glass of milk")
    }
    else if(guestAge <= 15 && guestAge > 6){
        println("serve a bottle of Fanta Orange")
    }
    else{
        println("serve a bottle of coca cola")
    }
}
fun numbers(){
    for(num in 1..100){
        if (num % 3 == 0){
            println("fizz")
        }
        else if(num % 5 == 0){
            println("Buzz")
        }
        else{(num % 3 == 0 && num % 5 == 0)
            println("FizzBuzz")
        }
    }}



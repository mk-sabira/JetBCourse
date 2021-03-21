package loops

//fun main() {
//    For loop

//    var sum = 0
//    for (i in 1..10){
//        sum += i
//
//    }
//    println(sum )
//
//    val star = arrayListOf("Kotlin", "C++", "Python")
//    for (i in star){
//        println(i)
//    }
//    for ((index, value ) in star.withIndex())
//        println("$index - $value")

//    while loop

//    var s = 10
//
//    while (s >= 0){
//
//        println(s)
//        --s
//    }


//    break/ continue

//    for (i in "python"){
//        if (i == 'o'){
//            break
//        }
//        println(i)
//    }
//
//    val list = listOf("Speaker", "flash card", "Circle time")
//    for (str in list){
//        if (!str.contains('a')){
//            continue
//        }
//
//        println(str)
//    }

//    outer@for (i in 1..10){
//        for (j in 1..10){
//            if (i - j == 5){
//                break@outer
//            }
//            println("$i - $j")
//        }
//    }
//    println("o x \n")
//    println("o x o \n")
//    println("x o x")
//}

import java.util.Scanner
import kotlin.math.max


fun main() {
//    val scanner = Scanner(System.`in`)
//
//    println("Hello! My name is Aid.")
//    println("I was created in 2020.")
//    println("Please, remind me your name.")
//
//    // reading a name
//    val name = scanner.next()
//
//    println("What a great name you have, $name!")
//
//    val age = scanner.nextInt()
//    println("$age is great age to start to learn programming!")

//boolean


//    var a = 1 + '2' + "3"
//
//   var b = "1" + 2 + '3'
//
//    var c = '1' + "2" + 3
//
//    var d = "1" + '2' + 3
//
//    var e = '1' + 2 + "3"
//
////    var f = 1 + "2" + '3'
//
//    println(b)
//    println(c)
//    println(d)
//    println(e)


//    println("99" + "" + "99")  // 1
////    println("9"*4)             // 2
//    println("" + 9999)         // 3
//    println("9".repeat(4))

//    val spell = "abra"
//    println((spell + "cad").repeat(spell.length) + spell)

//    val a = 12
//    val b = 34
//    println("$a plus $b equal ${a + b}")


//    val a = readLine()
//    val b = readLine()
//    println("$a  $b")

//    val month = "August"
//    val day = 22
//    val year = 2018
//    println("{month} {day}, {year}")

//    val s = "string"
//    print("${s.first()}")

//    val scanner = Scanner(System.`in`)
//    val name = scanner.next()
//    val lastName = scanner.next()
//    val age = scanner.next()
//
////    val name = readLine()!!
////    val lastName = readLine()
////    val age = readLine()!!.toInt()
//    println("${name.first()}. $lastName, $age years old")

//    You need to write a program that prints date and time
//    in a special format. Hours, minutes and seconds are split
//    by a colon, and day, month and year are split by a slash.
//    Take a look at the examples below.

//    val scanner = Scanner(System. `in`)
//    val (a, b, c) = readLine()!!.split(" ")
//    val (d, e, f) = readLine()!!.split(" ")
//    println("$a:$b:$c $d/$e/$f")

//    Write a program that helps people that are going on vacation.
//    The program is to calculate the total sum (e.g. $) of money required for a particular time.
//
//There are four parameters to consider:
//
//duration in days
//total food cost per day
//one-way flight cost
//cost of one night in a hotel (the number of nights equal duration minus one)
//Read the values of these parameters from the standard input and then print the result.
//
//Do not forget to consider the flight bac

//    val duration = readLine()!!.toInt()
//    val FoodCostPerD = readLine()!!.toInt()
//    val ticket = readLine()!!.toInt()
//    val hotelPrice = readLine()!!.toInt()
//    println("${FoodCostPerD * duration + ticket * 2 + hotelPrice * (duration - 1)}")

//    Write a program that reads a three-digit number, reverses the order
//    of its digits, and outputs a new number.

//    val scanner = Scanner(System. `in`)
//    val number = scanner.next()
//    println(number.reversed())
//

//    What values will be defined as Long if we insert them into this code?
//    val magic = 2_000_000_000
//    val giant = 3_000_000_00
//
//    val x = magic + magic + 1
//    val x2 = 100L - magic
//    val x3 = (magic + giant) % 10
//    val x4 = giant - magic
//    println(x)
//    println(x2)
//    println(x3)
//    println(x4)

//    There is a non-negative integer N (0 ≤ N ≤ 1000000).
//    Find the number of tens in it (i.e. next to last digit of the number).
//    If there is no next to last digit, you can consider that the number of
//    tens equals to zero.
//    val number = readLine()!!.toInt()
//    val count = (number % 100) / 10
//    println(count)

//    Some school has decided to create three new math groups and equip classrooms
//    for them with new desks. There is a place for exactly two people behind every desk.
//    So, no more than two students may sit behind the desk. The number of students in each
//    of those three groups is known. Output the smallest amount of desks, that the school
//    needs to buy. Each new group sits in its own classroom.

//    val first: Char = readLine()!!.first()
//    val second: Char = readLine()!!.first()
//    val third: Char = readLine()!!.first()
//    val fourth: Char = readLine()!!.first()
//    println(first - 1)
//    println(second - 1)
//    println(third - 1)
//    println(fourth- 1)


//    Write a program that reads a character and checks if it is a
//    capital letter or a digit from 1 to 9.
//    The program must print either true or false.

//    val number: Char = readLine()!!.first()
//    val isDigit = number in '\u0031'..'\u0039'
//    val isUpCase = number.isUpperCase()
//
//    println(isDigit || isUpCase)

//    Write a program that reads four characters and checks for each character
//            whether it is a digit.

//    val a : Char = readLine()!!.first()
//    val b : Char = readLine()!!.first()
//    val c : Char = readLine()!!.first()
//    val d : Char = readLine()!!.first()
//
//    println(a.isDigit())
//    println(b.isDigit())
//    println(c.isDigit())
//    println(d.isDigit())


//    val a : Char = readLine()!!.first()
//    val b : Char = readLine()!!.first()
//    val c : Char = readLine()!!.first()
//
//    val a2 = a.toInt()
//    val b2 = b.toInt()
//    val c2 = c.toInt()
//
//    val check1 = (a2 == b2 -1)
//    val check2 = (c2 == b2 + 1)
//    println(check1 && check2)

//    working with Strings


//    val longString = """{
//    "firstName": "John",
//    "lastName": "Smith",
//    "age": 35,
//    "phoneNumbers": [
//        {
//            "type": "mobile",
//            "number": "123 567-7890"
//        }
//    ]
//}""".trimIndent()
//    println(longString)


//    val scanner = Scanner(System. `in`)
//
//    val text1 = scanner.nextLine()
//    val text2 = scanner.nextLine()
//    println(text1 == text2)
//    println(text1 * 5)

//    val text = readLine()
//    val number = readLine()!!.toInt()
//    val matching = text?.get(number - 1)
//
//    println("Symbol #$number of the string \"$text\" is \'$matching\' ")

//    val name = readLine()
//    val lastName = readLine()
//
//    println("${name?.get(0)}. $lastName")

//    Ranges task 1

//    val num1 = readLine()!!.toInt()
//    val num2 = readLine()!!.toInt()
//    val num3 = readLine()!!.toInt()
//    val num4 = readLine()!!.toInt()
//    val num5 = readLine()!!.toInt()
//
//    println(num5 in num1..num2 && num5 in num3..num4)

//    task 3
//    val num1 = readLine()!!.toInt()
//    val num2 = readLine()!!.toInt()
//    val num3 = readLine()!!.toInt()
//
//    println(num1 in num2..num3)
// task 4
//    val range = 18..59
//    val age = readLine()!!.toInt()
//    println(age in range)

//    if expression
//    val a = readLine()!!.toInt()
//    val b = readLine()!!.toInt()
//    val c = readLine()!!.toInt()
//
//    println(if (a > c) {
//        if (a > b) a else b
//    } else {
//        if (b > c) b else c
//    })

//    Task 2
//    val a = readLine()!!.toInt()
//    if (a % 2 == 0) {
//        println("Divided by 2")}
//    if (a % 3 == 0){
//        println("Divided by 3") }
//    if (a % 5 == 0){
//        println("Divided by 5") }
//    if (a % 6 == 0){
//        println("Divided by 6") }

//    task 3
//    val a = readLine()!!.toInt()
//
//
////    val check =  (-15 < a && a < 12)|| (a in 15..16)|| (19<= a )
//    println(
//        if ((-15 < a && a < 12) || (a in 15..16) || (19<= a )) {
//            "True"
//        } else {
//            "False"
//        }
//    )

//    Task 4
//    val a = readLine()!!.toInt()
//    val b = readLine()!!.toInt()
//    if (a >= b) {
//        println(a ) }
//    if (b >= a){
//        println(b )}

//    task 5
//    val a = readLine()!!.toInt()
//    val b = readLine()!!.toInt()
//    val c = readLine()!!.toInt()
//    println(
//        if ( a + b > c && b + c > a && a + c > b){
//           "YES"
//        }else "NO"
//    )

//    task 7
//    val a = readLine()!!.toInt()
//    val range = 1900..3000
//    println(
//        if ((a in range && a % 4 == 0 && a % 100 != 0) || a % 400 == 0 ){
//            "Leap"
//        } else {
//            "Regular"
//        }
//    )
//
// Task exam
//    val num = readLine()
//    if (num != null) {
//        println(num.first())
//    }
//
//    task exam
//    var num = readLine()!!.toInt()
////
//    println("${num / 100 +(num % 100) / 10 + num % 10} ")

//    Loop repeat ()

//    val n = readLine()!!.toInt()
//    var posNum = 0
//    repeat(n) {
//        val num = readLine()!!.toInt()
//        if (num > 0) {
//            posNum++
//        }
//    }
//    println(posNum)
//    task 2

//    val n = readLine()!!.toInt()
//    var posNum = 0
//    var nonPNum = 0
//    var zero = 0
//    repeat(n) {
//        val num = readLine()!!.toInt()
//        if (num > 0) posNum++
//        if (num < 0) nonPNum++
//        if (num == 0) zero++
//    }
//    println("$zero $posNum $nonPNum ")
//    task 3
//    val line = readLine()
//    repeat(10){
//        println(line)
//    }
// task 4
//    var number = 5
//
//    repeat(2) {
//        number--
//    }
//
//    repeat(0) {
//        number--
//    }
//
//    repeat(1) {
//        number--
//    }
//
//    println(number)
//}

// task 5
//    val n = readLine()!!.toInt()
//    var numD = 0
//    var numC = 0
//    var numB = 0
//    var numA = 0
//    repeat(n) {
//        val num = readLine()!!.toInt()
//        if (num == 2) numD++
//        if (num == 3) numC++
//        if (num == 4) numB++
//        if (num == 5) numA++
//    }
//    println("$numD $numC $numB $numA")

//    test
//    val normalHour = readLine()!!.toInt()
//    val notNormal = readLine()!!.toInt()
//    val howMany = readLine()!!.toInt()
//    if (normalHour <= notNormal){
//        if (howMany >= normalHour && howMany < notNormal) println("Normal")
//        if (howMany < normalHour) println("Deficiency")
//        if (howMany >= notNormal) println("Excess")
//    }


//    for loop
//    val a = readLine()!!.toInt()
//    val b = readLine()!!.toInt()
//    val n = readLine()!!.toInt()
//
//    if ( a < b){
//        a % n == 0 && b % n == 0
//    }
//   task 2
//    val n = readLine()!!.toInt()
//    var sum = 0
//
//    for (i in 1..n ) {
//        var num = readLine()!!.toInt()
//            sum += num
//        }
//    println(sum)

//    task 4

//    val n = readLine()!!.toInt()
//    var result = 0 // starting value of the factorial
////
////    for (i in 2..n) { // the product from 2 to n
////        result *= i
////    }
////
////    println(result)
//    for (i in 1..n){
//        result +=i
//    }
//    println("sum of numbers intil $n is $result")

//    val n = readLine()!!.toInt()
//    var sum = 0
//    for (i in 1..n){
//        val num = readLine()!!.toInt()
//        sum += num
//
//    }
//    println(sum)
    var n = readLine()!!.toInt()

    var maxValue = 0
    for (i in 1..n){
        var num = readLine()!!.toInt()
        if ( i > num)
            maxValue = i
    }
    println(maxValue)

}















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

fun main() {
    val scanner = Scanner(System.`in`)

    println("Hello! My name is Aid.")
    println("I was created in 2020.")
    println("Please, remind me your name.")

    // reading a name
    val name = scanner.next()

    println("What a great name you have, $name!")
}

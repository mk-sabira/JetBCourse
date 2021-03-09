//fun main(){
//    val age: Int = 18
//
//    if (age < 18){
//        println("You are not an adult")
//    }else if (age == 18){
//        println("I would like to know your month of birth" )
//    }
//    else{
//        println("Please  following the instruction")
//    }
//    println(" The end of code")
//}

//
fun main(){
    val a = 112
    when(a){
        10 -> println(" a is 10")
        3*3 -> println(" a is 3*3")
        "Kotlin".length -> println("a is the length of the string 'Kotlin'")
        in 10..100 -> println(" a is between 10-100")
        !in 10..100 -> println("a is not between 10-100")
    }
}
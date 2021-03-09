package ArrayAndList

//fun main(){
//    val array = arrayOf("Abu Dhabi", "Dubai", "Al Ain")
//
//    val list = listOf("Abu Dhabi", "Dubai", "Al Ain")
//
//    val arrayList = arrayListOf("Abu Dhabi", "Dubai", "Al Ain")
//    arrayList.add("Sharjah")
//    println(arrayList.size)
//}

//working with Array
fun main() {
//    val array = arrayOf("Abu Dhabi", "Dubai", "Al Ain")
//    val mixed = arrayOf("Kotlin", 1, true)
//    val numbers = intArrayOf(1,2,3)
//    val star = "Star"
//
//    val emirates = arrayOf("Shahamah", "Ras Al Khaima")
//    val allEmirates = emirates + array
////    println(allEmirates.size)
////    println(emirates)
//
//    if(array.contains("Dubai")){
//        println("array has")
//    }else{
//        println("it does not")
//    }
//
//    println(array + emirates)

//    arrayList

    val arrayList = arrayListOf("Kotlin", "Java", "C++")
    arrayList.add("Python")

    arrayList.remove("C++")
    println(arrayList)
    val list = arrayListOf("C#", "JS")
    println(arrayList + list)

    println(arrayList.isEmpty())
    println(list.contains("Kotlin"))
    println(list.containsAll(arrayList))
}
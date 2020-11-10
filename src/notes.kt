fun main(){
    var s1 = "Thing"
    var s2 = "THING"

    var result = s1.compareTo(s2, ignoreCase = true)
    if (result == 0)
        println("They are the same")
    else
        println("They are NOT the same")

    println(s2.toLowerCase().capitalize())

    println("The length of this string is ${s1.length}")
    println("The first character is: ${s1[s1.length -1]}")

    var result1 = s1.indexOf('h')
    println(result1)
    println(s1.substring(result1,3))

    println(s1.contains("hi", true))
    val w = s1.replace("Thing", "other thing")
    println(w)
}
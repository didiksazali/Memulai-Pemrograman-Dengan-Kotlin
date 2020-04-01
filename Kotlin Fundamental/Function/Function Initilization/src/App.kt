// main function
fun main() {
    val user = setUser("Didik", 23)
    println(user)

    printUser("Didik")
}

fun setUser(name: String, age: Int) = "Your name is $name, and you are $age years old"

fun printUser(name: String) {
    println("Your name is $name")
}
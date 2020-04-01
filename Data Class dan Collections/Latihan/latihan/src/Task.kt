fun main() {

    // TODO 1
    val user = mapOf(
            "nama" to "John",
            "umur" to 23,
            "alamat" to "St. Petersburg")

    // TODO 2
    val name = user.getValue("nama")
    val age = user.getValue("umur")
    val address = user.getValue("alamat")

    // TODO 3
    println("User")
    println("Name: "+name)
    println("Age: "+age)
    println("Address: "+address)

}
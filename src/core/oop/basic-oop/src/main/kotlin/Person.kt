
@Deprecated("Use the Animal class instead", ReplaceWith("Animal"))
class Person internal constructor(firstName: String, lastName: String) {

    init {
        println("Create a person name $firstName $lastName")
    }

    constructor(firstName: String, lastName: String, middleName: String) : this(firstName, lastName) {}

}

fun main(args: Array<String>) {
    val me = Person("Troy", "Miles")
    return
}

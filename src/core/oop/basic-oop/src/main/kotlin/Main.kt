
object MySingleton {
    var temperatures = arrayOf(80, 76, 90)
    fun getLastTemperature() = temperatures.last()
}

fun main(args: Array<String>) {
//    other1()
//    other2()
    other3()
}

fun other1() {
    val location = object {
        var xPosition = 200
        var yPosition = 400

        fun printIt() {
            println("Position = (${xPosition}, ${yPosition})")
        }
    }

    location.printIt()
    location.xPosition = 2000
    location.yPosition = 2000
    location.printIt()

    var temperature = MySingleton.getLastTemperature()
    println("Last reading = $temperature degrees")
}

fun other2() {
    val person = NewStudent(32, "Nate", "Ebel")
    person.age

    person.printName()
}

fun other3() {
    val controller = SearchController.create("Kotlin")
}
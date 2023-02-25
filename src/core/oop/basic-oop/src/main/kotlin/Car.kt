
class Car : Vehicle {

    override val MakeName = "Ford"

    override fun getDoors(): Int {
        return 5
    }

}

fun main(args: Array<String>) {
    val myCar = Car()
    myCar.go()

    println("My car's make = ${myCar.MakeName}")
}
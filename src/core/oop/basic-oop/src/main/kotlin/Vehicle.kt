
interface Vehicle {
    val MakeName: String

    fun go() {
        println("Vroom, vroom")
    }

    fun stop() {
        println("Screening")
    }

    fun getMpg(): Int {
        return 50
    }

    fun getDoors(): Int

}
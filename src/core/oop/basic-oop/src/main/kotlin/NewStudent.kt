
class NewStudent(
    age: Int,
    firstName: String,
    lastName: String
): NewPerson(age, firstName, lastName) {

    override fun printName() {
        println("Student: $firstName $lastName")
    }

}
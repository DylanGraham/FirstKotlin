data class Person(var name: String,
                  var age: Int,
                  var height: Float)

fun main(args: Array<String>) {
    //val person: Person? = null
    val person: Person? = Person("Bob", 32, 1.7F)
    person?.name = "John"

    println(person)
}

data class Person(var name: String,
                  var age: Int,
                  var height: Float)

val person: Person? = null

person?.name = "John"

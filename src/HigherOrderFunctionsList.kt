import java.text.CollationKey

class Cookie(
    val name: String,
    val softBaked: Boolean,
    val hasFilling: Boolean,
    val price: Double,
)

val cookie = listOf(
    Cookie(
        name = "печенье с шоколадом",
        softBaked = false,
        hasFilling = false,
        price = 1.69
    ),Cookie(
        name = "нуга ореховая",
        softBaked = true,
        hasFilling = false,
        price = 1.49
    ),Cookie(
        name = "ванильный крем",
        softBaked = false,
        hasFilling = true,
        price = 1.59
    ),Cookie(
        name = "шоколадно-арахисовое масло",
        softBaked = false,
        hasFilling = true,
        price = 1.49
    ),Cookie(
        name = "Сникерс",
        softBaked = true,
        hasFilling = false,
        price = 1.39
    ),Cookie(
        name = "черничный пирог",
        softBaked = true,
        hasFilling = true,
        price = 1.79
    ),Cookie(
        name = "сахар и посыпка",
        softBaked = false,
        hasFilling = false,
        price = 1.39
    ),
)

fun main(){
    val groupedMenu = cookie.groupBy { it.softBaked }
    val softBakedMenu = groupedMenu[true] ?: emptyList()
    val crunchyMenu = groupedMenu[false] ?: emptyList()
    println("soft cookies:")
    softBakedMenu.forEach {
        println("${it.name} - $${it.price}")
    }
    println("crunchy cookies:")
    crunchyMenu.forEach {
        println("${it.name} - $${it.price}")
    }
}
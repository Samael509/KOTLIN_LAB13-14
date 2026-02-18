Лабораторная работа №13-14
Коллекции, обобщения и функциональный стиль в Kotlin
## Описание
Данная лабораторная работа посвящена изучению продвинутых возможностей языка Kotlin,
которые активно используются при разработке Android-приложений.
В рамках работы рассматриваются:- обобщённые типы (Generics);- коллекции Kotlin;- функции высшего порядка;- extension-функции;
Все примеры ориентированы на практическое применение и подготовку к разработке
мобильных приложений.
## Как запустить проект
1. Клонируйте репозиторий:
```bash
git clone <URL_репозитория>
```
# Примеры:
### forEach()
```kotlin
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
    cookie.forEach(){
        println("пункт меню: ${it.name}")
    }
}
```
### map()
```kotlin
fun main(){
    val fullMenu = cookie.map {
        "${it.name} - $${it.price}"
    }
    println("полное меню:")
    fullMenu.forEach{
        println(it)
    }
}
```
### filter()
```kotlin
fun main(){
    val softBakedMenu = cookie.filter {
        it.softBaked
    }
    println("мягкое печенье:")
    softBakedMenu.forEach{
        println("${it.name} - $${it.price}")
    }
}
```
### groupBy()
```kotlin
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
```
### fold()
```kotlin
fun main(){
    val totalPrice = cookie.fold(0.0) {total, cookie ->
        total + cookie.price
    }
    println("total price: $${totalPrice}")
}
```
### sortedBy()
```kotlin
fun main(){
    val alphabeticalMenu = cookie.sortedBy { it.name }
    println("меню в алфавитном порядке:")
    alphabeticalMenu.forEach {
        println(it.name)
    }
}
```
## Автор
[Ваше ФИО]
## Лицензия
Проект создан в учебных целях.
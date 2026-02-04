import java.lang.ClassValue

class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)

enum class Difficulty {
    EASY,
    MEDIUM,
    HARD
}

fun main(){
    val question1 = Question<String>(
        "речка",
        "водопровод",
        Difficulty.MEDIUM
    )
    val question2 = Question<Boolean>(
        "небо зелёное. Правда или ложь",
        false,
        Difficulty.EASY
    )
    val question3 = Question<Int>(
        "сколькьо дней между полнолуниями?",
        28,
        Difficulty.HARD
    )
    println(question1.answer)
    println(question2.answer)
    println(question3.answer)
    println(question1.toString())
}
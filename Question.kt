import java.lang.ClassValue

class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: String,
)

fun main(){
    val question1 = Question<String>(
        "речка",
        "водопровод",
        "medium"
    )
    val question2 = Question<Boolean>(
        "небо зелёное. Правда или ложь",
        false,
        "easy"
    )
    val question3 = Question<Int>(
        "сколькьо дней между полнолуниями?",
        28,
        "hard"
    )
    println(question1.answer)
    println(question2.answer)
    println(question3.answer)
}
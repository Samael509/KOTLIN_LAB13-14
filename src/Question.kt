import java.lang.ClassValue

data class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)

class Quiz {
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
    companion object StudentProgress {
        val total: Int = 10
        var answered: Int = 3
    }
}

enum class Difficulty {
    EASY,
    MEDIUM,
    HARD
}

fun main(){
    println("${Quiz.answered} of ${Quiz.total} answered")
}
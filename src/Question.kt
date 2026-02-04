import java.lang.ClassValue

data class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)

interface ProgressPrintable {
    val progressText: String

    fun printProgressBar()
}

class Quiz : ProgressPrintable {
    override val progressText: String
        get() = "${answered} of ${total} answered"

    override fun printProgressBar() {
        repeat(Quiz.answered) {print("▓")}
        repeat(Quiz.total - Quiz.answered) { print("▒") }
        println()
        println(progressText)
    }
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

    fun printQuiz(){
        question1.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()

        question2.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()

        question3.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
    }
}

enum class Difficulty {
    EASY,
    MEDIUM,
    HARD
}

fun main(){
    Quiz().apply { printQuiz() }
}
class Library<T> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun remove(item: T) {
        items.remove(item)
    }

    fun getAll(): List<T> {
        return items.toList()
    }
}

data class Book(
    val title: String,
    val author: String,
    val year: Int,
    val isbn: String
)

data class Magazine(
    val title: String,
    val issue: Int,
    val month: String
)

data class DVD(
    val title: String,
    val director: String,
    val duration: Int
)

sealed class LibraryItem {
    class BookItem(val book: Book) : LibraryItem()
    class MagazineItem(val magazine: Magazine) : LibraryItem()
    class DVDItem(val dvd: DVD) : LibraryItem()
}

fun filterByYear(books: List<Book>, year: Int): List<Book> {
    return books.filter { it.year == year }
}

fun <T> sortByTitle(items: List<T>, getTitle: (T) -> String): List<T> {
    return items.sortedBy { getTitle(it) }
}

fun groupByAuthor(books: List<Book>): Map<String, List<Book>> {
    return books.groupBy { it.author }
}

fun calculateTotalDuration(dvds: List<DVD>): Int {
    return dvds.sumOf { it.duration }
}
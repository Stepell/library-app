package nl.stefan.library

import nl.stefan.library.model.Book
import nl.stefan.library.model.LibraryItem

fun main() {
    println("Hello Library!")

    try {
        Book("Bad book", "1278", "Empty Dan", 0)
    } catch (e: IllegalArgumentException) {
        println("Not enough pages: ${e.message}")
    }

    val book = Book("Inferno", "12345678", "Dan Brown", 387)
    println(book)
    println(book.title)
    println(book.isAvailable())
}

package nl.stefan.library.model

abstract class LibraryItem(val title: String, val id: String) {
    private var available = true

    fun isAvailable(): Boolean = available
}
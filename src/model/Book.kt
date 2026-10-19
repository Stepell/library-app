package nl.stefan.library.model

class Book(title: String, id: String, val author: String, val pages: Int) : LibraryItem(title, id) {
    init {
        require(pages > 0) { "Pages must be greater than 0" }
    }
}

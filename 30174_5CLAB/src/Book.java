public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isBorrowed;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed = false;
    }

    public boolean borrow() {
        if (!isBorrowed) {
            isBorrowed = true;
            return true;
        }
        return false;
    }

    public boolean returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
            return true;
        }
        return false;
    }

    public String getIsbn() {
        return isbn;
    }

    // Getters for title, author, etc.
}

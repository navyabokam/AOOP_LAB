public interface LibraryRepositoryInterface {
    void addBook(Book book);
    void removeBook(String isbn);
    Book findBookByIsbn(String isbn);
}

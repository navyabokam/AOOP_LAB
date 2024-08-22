import java.util.HashMap;
import java.util.Map;

public class InMemoryLibraryRepository implements LibraryRepositoryInterface {
    private Map<String, Book> books = new HashMap<>();

    @Override
    public void addBook(Book book) {
        books.put(book.getIsbn(), book);
    }

    @Override
    public void removeBook(String isbn) {
        books.remove(isbn);
    }

    @Override
    public Book findBookByIsbn(String isbn) {
        return books.get(isbn);
    }
}

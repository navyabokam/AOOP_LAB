public class Library {
    private LibraryRepositoryInterface repository;

    public Library(LibraryRepositoryInterface repository) {
        this.repository = repository;
    }

    public void addBook(Book book) {
        repository.addBook(book);
    }

    public void removeBook(String isbn) {
        repository.removeBook(isbn);
    }

    public Book findBook(String isbn) {
        return repository.findBookByIsbn(isbn);
    }

    public boolean borrowBook(String isbn, Member member) {
        Book book = findBook(isbn);
        if (book != null && member.borrowBook(book)) {
            return true;
        }
        return false;
    }

    public boolean returnBook(String isbn, Member member) {
        Book book = findBook(isbn);
        if (book != null && member.returnBook(book)) {
            return true;
        }
        return false;
    }
}

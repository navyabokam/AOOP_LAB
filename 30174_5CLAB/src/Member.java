import java.util.ArrayList;
import java.util.List;

public class Member {
    private int memberId;
    private String name;
    protected List<Book> borrowedBooks;

    public Member(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public boolean borrowBook(Book book) {
        if (book.borrow()) {
            borrowedBooks.add(book);
            return true;
        }
        return false;
    }

    public boolean returnBook(Book book) {
        if (borrowedBooks.contains(book) && book.returnBook()) {
            borrowedBooks.remove(book);
            return true;
        }
        return false;
    }

    // Getters for memberId, name, etc.
}

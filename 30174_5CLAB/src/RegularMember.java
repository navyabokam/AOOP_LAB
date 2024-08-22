public class RegularMember extends Member {
    private final int maxBooksAllowed = 5;

    public RegularMember(int memberId, String name) {
        super(memberId, name);
    }

    @Override
    public boolean borrowBook(Book book) {
        if (borrowedBooks.size() < maxBooksAllowed) {
            return super.borrowBook(book);
        }
        return false;
    }
}


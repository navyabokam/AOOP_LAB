public class PremiumMember extends Member {
    private final int maxBooksAllowed = 10;

    public PremiumMember(int memberId, String name) {
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

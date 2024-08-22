public class Main {
    public static void main(String[] args) {
        // Instantiate repository and library
        LibraryRepositoryInterface repository = new InMemoryLibraryRepository();
        Library library = new Library(repository);

        // Create books
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "1234567890");
        Book book2 = new Book("1984", "George Orwell", "0987654321");

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);

        // Create members
        Member member1 = new RegularMember(1, "Alice");
        Member member2 = new PremiumMember(2, "Bob");

        // Borrow books
        library.borrowBook("1234567890", member1);
        library.borrowBook("0987654321", member2);

        // Return books
        library.returnBook("1234567890", member1);
        library.returnBook("0987654321", member2);
    }
}

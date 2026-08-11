import java.util.*;
public class BookManager {
    private ArrayList<Book> books;
    private HashMap<String, Book> bookMap;
    public BookManager() {
        books = new ArrayList<>();
        bookMap = new HashMap<>();
    }
    // Add book
    public void addBook(Book book) {
        books.add(book);
        bookMap.put(book.getTitle().toLowerCase(), book);
    }
    // Display all books
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }
        for (Book book : books) {
            System.out.println(book);
        }
    }
    // HashMap searching
    public void searchByTitle(String title) {
        Book book = bookMap.get(title.toLowerCase());
        if (book != null) {
            System.out.println("Book Found:");
            System.out.println(book);
        } else {
            System.out.println("Book not found.");
        }
    }    // Sort by rating
    public void sortByRating() {
        books.sort(Comparator.comparingDouble(Book::getRating).reversed());
        System.out.println("\nBooks sorted by rating:");
        displayBooks();
    }    // Sort by pages
    public void sortByPages() {
        books.sort(Comparator.comparingInt(Book::getPages));
        System.out.println("\nBooks sorted by pages:");
        displayBooks();
    }    // Binary Search
    public void binarySearch(String title) {
        ArrayList<Book> sortedBooks = new ArrayList<>(books);
        sortedBooks.sort(
            Comparator.comparing(Book::getTitle,
            String.CASE_INSENSITIVE_ORDER)
        );
        int left = 0;
        int right = sortedBooks.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int result = sortedBooks.get(mid)
                    .getTitle()
                    .compareToIgnoreCase(title);
            if (result == 0) {
                System.out.println("Book Found:");
                System.out.println(sortedBooks.get(mid));
                return;
            }
            if (result < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Book not found.");
    }
    public ArrayList<Book> getBooks() {
        return books;
    }
}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Inventory {
    private Map<String,Book> books;
    public Inventory() {
        books = new HashMap<>();
    }
    public void addBook(Book book) {
        books.put(book.getISBN(), book);
        System.out.println("Added Book: " + book.getTitle());
    }
    public void removeBook(String ISBN) {
        books.remove(ISBN);
    }
    public ArrayList<Book> removeOutdatedBooks(int maxDuration,int currentYear) {
        ArrayList<Book> outdatedBooks = new ArrayList<>();
        Iterator<Map.Entry<String, Book>> iterator = books.entrySet().iterator();
        System.out.println("Removing outdated books from Inventory");
        while (iterator.hasNext()) {
            Map.Entry<String, Book> entry = iterator.next();
            Book book = entry.getValue();
            if(currentYear-book.getPublishingYear()>=maxDuration) {
                outdatedBooks.add(book);
                System.out.println("Removed Book: " + book.getTitle());
                iterator.remove();
            }
        }
        return outdatedBooks;
    }
    public void buyBook(String ISBN,int quantity, String email, String address) {
        Book book = books.get(ISBN);
        if(book==null) {
            throw new RuntimeException("Book not found");
        }
        book.buy(quantity,email,address);
    }
}

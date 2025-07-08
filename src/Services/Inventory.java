package Services;

import Books.Book;
import Exceptions.BookNotFoundExcepiton;

import java.util.*;

public class Inventory {
    private Map<String, Book> booksInventory;


    public Inventory() {
        this.booksInventory = new HashMap<>();
    }
    public void add(Book book){
        booksInventory.put(book.getIsbn(),book);
        System.out.println(book.getTitle()+": added successfully!");
    }
    public List<Book> removeOutdated(int years){
        List<Book> outdated = new ArrayList<>();
        List<String> keys = new ArrayList<>();
        for(Map.Entry<String, Book> entry: booksInventory.entrySet()){
            Book book = entry.getValue();
            if(book.isOutdated(years)){
                outdated.add(book);
                keys.add(entry.getKey());
                System.out.println("removed: "+book.getIsbn());
            }

        }
        for (String key : keys) {
            booksInventory.remove(key);
        }
        return outdated;
    }
    public double buy(String isbn, int qty, String email, String address){
        Book book = booksInventory.get(isbn);
        if(book == null){
            throw new BookNotFoundExcepiton("Book not found");
        }
        return book.buy(qty,email,address);
    }
}

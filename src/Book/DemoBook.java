package Book;

import Exceptions.BuyingDemoExcption;

public class DemoBook extends Book{
    public DemoBook(String isbn, String title, int yearOfPublish, double price){
        super(isbn,title,yearOfPublish, price);
    }

    @Override
    public double buy(int qty, String email, String address) {
        throw new BuyingDemoExcption("DemoBook is not for sale");
    }
}

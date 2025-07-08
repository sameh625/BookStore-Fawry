package Books;

import Exceptions.OutOfStockException;
import Services.ShippingService;

public class PaperBook extends Book {
    private int stock;

    public PaperBook(String isbn, String title, int yearOfPublish, double price, int stock){
        super(isbn,title,yearOfPublish, price);
        this.stock = stock;
    }
    @Override
    public double buy(int qty, String email, String address){
        if(stock < qty){
            throw new OutOfStockException("Too much quantity. There is just: "+stock);
        }
        stock -= qty;
        ShippingService.send(address);
        double total = (qty*price);
        return total;
    }
}

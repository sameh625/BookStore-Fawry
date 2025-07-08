package Book;

import Service.MailService;

public class EBook extends Book {
    private String fileType;

    public EBook(String isbn, String title, int yearOfPublish, double price, String fileType){
        super(isbn,title,yearOfPublish, price);
        this.fileType = fileType;
    }

    @Override
    public double buy(int qty, String email, String address){
        MailService.send(email);
        return (price*qty);
    }
}

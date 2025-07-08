package Book;

public abstract class Book {
    protected String isbn;
    protected String title;
    protected int yearOfPublish;
    protected double price;

    public boolean isOutdated(int years) {
        int currentYear = java.time.Year.now().getValue();
        return (currentYear - yearOfPublish) > years;
    }

    public Book(String isbn, String title, int yearOfPublish, double price){
        this.isbn = isbn;
        this.title = title;
        this.price = price;
        this.yearOfPublish = yearOfPublish;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public abstract double buy(int qty, String email, String address);
}


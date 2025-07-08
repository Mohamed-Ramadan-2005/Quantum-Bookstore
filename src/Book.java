public abstract class Book {
    final protected String ISBN;
    final protected String title;
    final protected int publishingYear;
    final protected double price;
    public Book(String ISBN, String title, int publishingYear, double price) {
        this.ISBN = ISBN;
        this.title = title;
        this.publishingYear = publishingYear;
        this.price = price;
    }
    public String getISBN() {
        return ISBN;
    }
    public String getTitle() {
        return title;
    }
    public int getPublishingYear() {
        return publishingYear;
    }
    public double getPrice() {
        return price;
    }
    public abstract void buy(int quantity,String email,String address);
 }

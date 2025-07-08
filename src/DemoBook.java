public class DemoBook extends Book {
    public DemoBook(String ISBN,String title, int publishingYear, double price) {
        super(ISBN,title,publishingYear,price);
    }


    @Override
    public void buy(int quantity, String email, String address) {
        throw new RuntimeException("DemoBook is not for sale.");
    }
}

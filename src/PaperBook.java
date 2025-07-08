public class PaperBook extends Book {
    private int stock;
    public PaperBook(String ISBN,String title,int publishingYear,double price,int stock) {
        super(ISBN,title,publishingYear,price);
        this.stock = stock;
    }


    @Override
    public void buy(int quantity, String email, String address) {
        if(stock<quantity){
            throw new RuntimeException("Book is out of stock");
        }
        stock-=quantity;
        ShippingService.Shipping(title,address);
        System.out.printf("%d Book(s) of %s with cost: %.2f\n",quantity,title,price*quantity);
    }
}

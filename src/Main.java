public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        inventory.addBook(new PaperBook("1","paper book",2018,20,5));
        inventory.addBook(new EBook("2","ebook",2020,10,"PDF"));
        inventory.addBook(new DemoBook("3","demo book",1990,20));

        inventory.buyBook("1", 2, "customer@example.com", "Cairo");
        inventory.buyBook("2", 1, "ecustomer@example.com", "Alex");
        //inventory.buyBook("3", 1, "demo@example.com", "Cairo"); //throws an error because demo books is not for sale
        //inventory.buyBook("1", 100, "customer@example.com", "Cairo"); //throws an error because this quantity not available
        //inventory.buyBook("4", 1, "someone@example.com", "Cairo"); //throws an error because this book  is not in inventory
        inventory.removeOutdatedBooks(5, 2025);
    }
}
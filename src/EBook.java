public class EBook extends Book {
    final private String fileType;
    public EBook(String ISBN,String title, int publishingYear, double price, String fileType) {
        super(ISBN,title,publishingYear,price);
        this.fileType = fileType;
    }
    public String getFileType() {
        return fileType;
    }

    @Override
    public void buy(int quantity, String email, String address) {
        // quantity does not matter
        MailService.sendMail(title,email);
        System.out.printf("%d Book(s) of %s with cost: %.2f\n", quantity, title, price * quantity);
    }
}

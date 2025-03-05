public class Book {
    int id;
    String name;
    String author;
    boolean isIssued;

    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.isIssued = false;
    }

    public void displayBook() {
        System.out.println(id + ". " + name + " by " + author + " | Issued: " + (isIssued ? "Yes" : "No"));
    }
}

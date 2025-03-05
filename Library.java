import java.util.*;

public class Library {
    static ArrayList<Book> books = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("===== Library Management System =====");
        while (true) {
            System.out.println("\n1. View Books");
            System.out.println("2. Add Book");
            System.out.println("3. Remove Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    viewBooks();
                    break;
                case 2:
                    addBook();
                    break;
                case 3:
                    removeBook();
                    break;
                case 4:
                    issueBook();
                    break;
                case 5:
                    System.out.println("Thank You!");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }

    public static void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No Books Available!");
        } else {
            for (Book b : books) {
                b.displayBook();
            }
        }
    }

    public static void addBook() {
        System.out.print("Enter Book Name: ");
        String name = sc.next();
        System.out.print("Enter Author Name: ");
        String author = sc.next();
        books.add(new Book(books.size() + 1, name, author));
        System.out.println("Book Added Successfully!");
    }

    public static void removeBook() {
        System.out.print("Enter Book ID to Remove: ");
        int id = sc.nextInt();
        books.removeIf(b -> b.id == id);
        System.out.println("Book Removed Successfully!");
    }

    public static void issueBook() {
        System.out.print("Enter Book ID to Issue: ");
        int id = sc.nextInt();
        for (Book b : books) {
            if (b.id == id) {
                if (!b.isIssued) {
                    b.isIssued = true;
                    System.out.println("Book Issued Successfully!");
                } else {
                    System.out.println("Book Already Issued!");
                }
                return;
            }
        }
        System.out.println("Invalid Book ID!");
    }
}

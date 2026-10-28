import java.util.Scanner;

public class Book {
    int bookId;
    String bookName;
    double price;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] books = new Book[5];

        for (int i = 0; i < books.length; i++) {
            books[i] = new Book();
            System.out.println("Enter details of book " + (i + 1) + ":");

            System.out.print("Book ID: ");
            books[i].bookId = sc.nextInt();
            sc.nextLine();

            System.out.print("Book name: ");
            books[i].bookName = sc.nextLine();

            System.out.print("Price: ");
            books[i].price = sc.nextDouble();
        }

        System.out.println("\nBook Details:");
        for (Book book : books) {
            System.out.println("Book ID: " + book.bookId);
            System.out.println("Book name: " + book.bookName);
            System.out.println("Price: " + book.price);
            System.out.println();
        }
        sc.close();
    }
}

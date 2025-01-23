import java.util.*;
public class book {
    Scanner scan = new Scanner(System.in);
    String title;
    String author;
    int price;
    
    public book() {
        title = "empty";
        author = "empty";
        price = 90;
    }
    
    public book(String t, String a, int p) {
        this.title = t;
        this.author = a;
        this.price = p;
    }
    
    void displayDetails() {
        System.out.println("Info of Books : ");
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price   : " + price);
    }
    
    public static void main(String[] args) {
        book obj = new book("Harry Potter ", "casandra desouza", 25000);
        obj.displayDetails();
        book obj1 = new book();
        obj1.displayDetails();
        System.out.println(" Array Store ");
        Scanner scanner = new Scanner(System.in);
        
        book[] books = new book[50];
        
        System.out.println("Information for 3 book :- ");
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for book " + (i + 1));
            
            System.out.print("Enter the name of Title : ");
            String t = scanner.nextLine();
            
            System.out.print("Enter the name of author : ");
            String a = scanner.nextLine();
            
            System.out.print("Enter the price : ");
            int p = scanner.nextInt();
            scanner.nextLine();
            
            books[i] = new book(t, a, p);
        }
        
        System.out.println("\nDisplaying information of all books :");
        for (int i = 0; i < 3; i++) {
            books[i].displayDetails();
        }
        
        scanner.close();
    }
}

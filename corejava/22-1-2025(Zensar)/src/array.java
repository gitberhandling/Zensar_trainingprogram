//accept marks of 10 subjects and print only marks greater than 60 
import java.util.*;

public class array {
    
    Scanner scan = new Scanner(System.in);
    int[] arr = new int[10];

    void result() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the marks of subject " + (i + 1) + " ");
            arr[i] = scan.nextInt(); 
        }
        
        System.out.println("\nMarks greater than 60 are:");
        for (int i = 0; i < 10; i++) {
            if (arr[i] > 60) {
                System.out.println("Subject " + (i + 1) + "  " + arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        array obj = new array();
        obj.result(); 
    }
}

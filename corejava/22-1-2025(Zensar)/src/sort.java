//insert 15 number and print the maximum one 
import java.util.Scanner;

public class sort {
    Scanner scan = new Scanner(System.in);
    int[] arr = new int[15];

    void sorts() {
       
        for (int i = 0; i < 15; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = scan.nextInt(); 
        }

       
        int max = arr[0]; 
        for (int i = 1; i < 15; i++) {  
            if (arr[i] > max) {
                max = arr[i];  
        }
        }
   
        System.out.println("The maximum number is: " + max);
    }

    public static void main(String[] args) {
        sort sort = new sort();  
        sort.sorts(); 
    }
}

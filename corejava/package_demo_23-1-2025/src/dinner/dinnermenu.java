package dinner;
import java.util.Scanner;
public class dinnermenu {

		String dish;
		int cost;
		Scanner scan = new Scanner(System.in);
		public void accept() {
			
			System.out.println("Enter the dish name : ");
			dish =scan.nextLine();
			System.out.println("Enter the cost : ");
			cost = scan.nextInt();
		}
		public void display(){
			System.out.println("  For Dish "+dish+ " Cost is " +cost);
		}


	}

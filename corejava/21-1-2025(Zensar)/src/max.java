import java.util.*;
public class max {
	Scanner scan = new Scanner(System.in);
	void maximum() {
		System.out.println("Enter the first number A : ");
		int a = scan.nextInt();
		System.out.println("Enter the first number B : ");
		int b = scan.nextInt();
		
		if (a>b) {
			System.out.println("A is greater than B");
		}
		else if(b>a) {
			System.out.println("B is greater than A");
		}
		else {
			System.out.println("A is equal to B");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		max obj1 = new max();
		obj1.maximum();
	}

}

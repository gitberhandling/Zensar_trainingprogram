package meal;

import java.util.Scanner;

import dinner.dinnermenu;
import lunch.lunchmenu;

public class mealoption {
	
	
	public static void main(String[] args) {
		int ch = 2;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Press 1 for lunch and 2 for dinner : ");
		ch = scan.nextInt();
		switch(ch) {
		
		case 1:
		lunchmenu obj1 = new lunchmenu();
		obj1.accept();
		obj1.display();
		break;

		case 2:{
		dinnermenu obj = new dinnermenu();
		obj.accept();
		obj.display();
		}
		scan.close();
		}
	}

}

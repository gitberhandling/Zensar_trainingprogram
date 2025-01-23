//Basic arithmetic operation
public class addition {
	int no1,no2;
	
	
void add() {
	no1=10;
	no2=15;
	System.out.println("The addition of the  is : "+(no1+no2));
}
void subtract() {
	no1=10;
	no2=15;
	System.out.println("The subtraction of the nos is : "+(no1-no2));
}
void division() {
	no1=10;
	no2=15;
	System.out.println("The division of the nos is : "+(no1/no2));
}
void multiply() {
	no1=10;
	no2=15;
	System.out.println("The multiplication of the nos is : "+(no1*no2));
}

public static void main(String[] args) {
	addition obj1=new addition();
	obj1.add();
	obj1.subtract();
	obj1.division();
	obj1.multiply();
	
}

		
	
};






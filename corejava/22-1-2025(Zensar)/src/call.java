import java.util.Scanner;

public class call {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vehicle obj = new vehicle(123, 25000, "Ford");//Parameterized constructor
		obj.display();
		vehicle obj1 = new vehicle();//Default Constructor
		obj1.display();
		System.out.println("Array ");
        Scanner scanner = new Scanner(System.in);
        
        vehicle[] vehicles = new vehicle[5];

        System.out.println("Enter information for 5 vehicles:");

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Vehicle " + (i + 1));

            System.out.print("Enter model number: ");
            int modelNo = scanner.nextInt();

            System.out.print("Enter price: ");
            int price = scanner.nextInt();

            scanner.nextLine();

            System.out.print("Enter brand: ");
            String brand = scanner.nextLine();

            vehicles[i] = new vehicle(modelNo, price, brand);
        }

        System.out.println("\nDisplaying information of all vehicles:");
        for (int i = 0; i < 5; i++) {
            vehicles[i].display();
        }

        scanner.close();
    }
}

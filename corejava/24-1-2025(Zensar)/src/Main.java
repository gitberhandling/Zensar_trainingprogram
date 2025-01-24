
public class Main {

	public static void main(String[] args) {
		Employee emp = new Employee("Alice",101,50000);
		System.out.println("Employee ID : "+emp.id);
		
		System.out.println("Employee name : "+emp.getName());
		
		
		emp.displaySalary();
		Manager mgr = new Manager("Bob",102,60000);
		mgr.showDetails();
		
	}

}

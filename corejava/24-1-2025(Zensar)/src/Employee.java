
public class Employee {
	String name;
	int id;
	protected double salary;
	
	public Employee(String name,int id,double salary) 
	{
		this.name = name;
		this.id=id;
		this.salary=salary;
		
	}
	public String getName() {
		return name;
		
	}
	private void printDetails()
	{
		System.out.println("Name : "+name+"ID : "+id+"salary : "+salary);
		
	}
	public void displaySalary() {
		System.out.println("Salary is : "+salary);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

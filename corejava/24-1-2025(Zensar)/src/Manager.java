
class Manager extends Employee{ 
	
	public Manager(String name,int id,double salary) {
		
		super(name,id,salary);
	}
	public void showDetails() {
		System.out.println("Manager ID : "+id);
		displaySalary();
	}
}



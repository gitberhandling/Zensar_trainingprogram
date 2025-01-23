package company_structure;
class employee {
	static int totalpersons;
    String name;
    int id;
    double salary;
    int count;
    static {
  	  totalpersons=0;
  	  System.out.println("static block executed: totalperson initialized to 0 ");
    }
    {
  	  count=totalpersons+1;
  	  totalpersons++;
  	  System.out.println("instance block executed: Number of members are : "+count);
    }

    public employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Name  " + name + ", ID  " + id + ", Salary  " + salary);
    }
    public static void displaytotalpersons(){
    	System.out.println("total number of persons : "+totalpersons);
    	}
    public double calculateBonus() {
        return salary * 0.10;
    }
}

package Student_Management;
class Person {
  static int totalpersons;
  String name;
  String id;
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
  

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
    public static void displaytotalpersons(){
    	System.out.println("total number of persons : "+totalpersons);
    	}
}

// create a class vehicle and write a default as well as parameterized constructor
import java.util.*;
public class vehicle {
	Scanner scanner = new Scanner(System.in);
	int model_no ;
	int price;
	String Brand;
	
	public vehicle() {
		model_no = 000;
		price = 40000;
		Brand = "Ferrari";
	}
	
	public vehicle(int m_name,int p,String b_name){
		model_no = m_name;
		price = p;
		Brand = b_name;
		
	}
	
	void display() {
		System.out.println("Vehicles \n Info of vehicles \n"+model_no+"\n"+price+"\n"+Brand);
	}
	

	
	
}

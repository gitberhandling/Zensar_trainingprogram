
public class maximum {
		int a,b,c;
		void max() {
			a=10;
			b=5;
			c=15;
			if ((a>b)&&(a>c)) {
				System.out.println("A is greater");
			}
			else if((b>a)&&(b>c)) {
				System.out.println("B is greater ");
			}
			else {
				System.out.println("C is greater");
			}
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			maximum obj1 = new maximum();
			obj1.max();
		}

	}

	


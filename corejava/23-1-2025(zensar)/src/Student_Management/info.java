package Student_Management;

public class info {
    public static void main(String[] args) {
    student student = new student("Ankush Jaykar", "123", new String[]{"DM", "M3"}, 8.34);
    student student1 = new student("Ankit Sharma", "183", new String[]{"DM", "M3"}, 7.24);
    student student2 = new student("Aniket Joshi r", "163", new String[]{"DM", "M3"}, 6.34);
   Teacher teacher = new Teacher("Aniruda", "896", "Math", new String[]{"Algebra", "Geometry"});
     Staff staff = new Staff("Masun", "5889", "Administrator", "HR");

  System.out.println("Student Information:");
     student.displayInfo();
     student1.displayInfo();
     student2.displayInfo();
  System.out.println("\nTeacher Information:");
teacher.displayInfo();
   System.out.println("\nStaff Information:");
   staff.displayInfo();
   Person.displaytotalpersons();
    }
}
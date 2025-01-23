package Student_Management;

class Teacher extends Person {
    String department;
    String[] subjects;

    public Teacher(String name, String id, String department, String[] subjects) {
        super(name, id);
        this.department = department;
        this.subjects = subjects;
    }


    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department + ", Subjects: " +  subjects);
    }
}
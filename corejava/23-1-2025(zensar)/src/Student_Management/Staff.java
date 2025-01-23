package Student_Management;
class Staff extends Person {
    String jobTitle;
    String department;

    public Staff(String name, String id, String jobTitle, String department) {
        super(name, id);
        this.jobTitle = jobTitle;
        this.department = department;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Job Title: " + jobTitle + ", Department: " + department);
    }
}

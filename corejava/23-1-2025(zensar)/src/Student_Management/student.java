package Student_Management;

class student extends Person {
     String[] courseList;
     double GPA;

    public student(String name, String id, String[] courseList, double GPA) {
        super(name, id);
        this.courseList = courseList;
        this.GPA = GPA;
    }

  
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Courses: " + courseList + "  GPA: " + GPA);
    }
    }

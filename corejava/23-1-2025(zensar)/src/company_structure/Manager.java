package company_structure;


class Manager extends employee {
    String department;

    public Manager(String name, int id, double salary, String department) {
        super(name, id, salary);
        this.department = department;
    }

    public void manageTeam() {
        System.out.println(name + " is managing the " + department + " department ");
    }

    @Override
    public  double calculateBonus() {
        return salary * 0.20;
    }
}

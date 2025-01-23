package company_structure;

public class structure {
    public static void main(String[] args) {
        employee e1 = new Manager("Anjer", 101, 800, "IT");
        employee e2 = new Developer("Hiraj", 102, 6000, "Java","asff");
        employee e3 = new Salesperson("Ankit", 103, 80085, "West Region",100,25);

        e1.displayInfo();
        System.out.println("Bonus: " + e1.calculateBonus());

        e2.displayInfo();
        System.out.println("Bonus: " + e2.calculateBonus());

        e3.displayInfo();
        System.out.println("Bonus: " + e3.calculateBonus());

        if (e1 instanceof Manager) {
            ((Manager) e1).manageTeam();
        }
        if (e2 instanceof Developer) {
            ((Developer) e2).programmingLanguage();
            ((Developer) e2).code();
        }
        if (e3 instanceof Salesperson) {
            ((Salesperson) e3).meetClients();
            ((Salesperson) e3).targetSales();
            ((Salesperson) e3).achieveTarget();
        }
        employee.displaytotalpersons();
    }
}


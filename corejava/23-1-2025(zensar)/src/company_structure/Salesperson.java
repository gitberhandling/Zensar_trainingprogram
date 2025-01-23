package company_structure;

class Salesperson extends employee {
    int targetsales;
    int targetach;
    String region;

    public Salesperson(String name, int id, double salary, String region, int targetsales, int targetach) {
        super(name, id, salary);
        this.region = region;
        this.targetsales=targetsales;
        this.targetach=targetach;
    }

    public void meetClients() {
        System.out.println(name + " is meeting clients in " + region);
    }
    public void targetSales() 
    {
    	System.out.println("The total target are "+targetsales);
    }
    public void achieveTarget() {
    	System.out.println("The total target achieve are : "+targetach);
    }

    @Override
    public double calculateBonus() {
        return salary * 0.25;
    }
}
package company_structure;
class Developer extends employee {
    String language;
    String code;

    public Developer(String name, int id, double salary, String language, String code) {
        super(name, id, salary);
        this.language = language;
        this.code = code;
    }

    public void programmingLanguage() {
        System.out.println(name + " is coding in " + language);
    }

    public void code() {
        System.out.println(name + " is coding " + code + " in " + language);
    }

    @Override
    public double calculateBonus() {
        return salary * 0.15; // Developer gets 15% bonus
    }
}
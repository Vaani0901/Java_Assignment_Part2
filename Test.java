public class Test {
    public static void main(String[] args) {
        NormalEmployee emp1 = new NormalEmployee("John Smith", "123 Main St", 50000);
        BonusEmployee emp2 = new BonusEmployee("Jane Doe", "456 Elm St", 60000, 1000);

        System.out.println("Monthly salary for " + emp1.name + ": " + emp1.calculateMonthlySalary());
        System.out.println("Monthly salary for " + emp2.name + ": " + emp2.calculateMonthlySalary());
    }
}
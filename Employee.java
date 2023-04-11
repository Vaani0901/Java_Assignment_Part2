public abstract class Employee {
    String name;
    String address;
    protected int basicSalary;

    public Employee(String name, String address, int basicSalary) {
        this.name = name;
        this.address = address;
        this.basicSalary = basicSalary;
    }

    public abstract int calculateMonthlySalary();
}





package Class30;

abstract class Employee {
    protected String name;
    protected int id;
    protected double salary;

    public Employee(String name, int id, double salary) throws InvalidSalaryException {
        if (salary <= 0) {
            throw new InvalidSalaryException("Invalid salary: " + salary);
        }
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public abstract double calculateTax();

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
    }
}
class ContractEmployee extends Employee {
    public ContractEmployee(String name, int id, double salary) throws InvalidSalaryException {
        super(name, id, salary);
    }

    @Override
    public double calculateTax() {
        return salary * 0.15; // 15% tax
    }
}
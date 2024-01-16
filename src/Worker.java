public class Worker extends Person{
    private double salary;

    public Worker(String firstName, String lastName, String phoneNumber, double salary) {
        super(firstName, lastName, phoneNumber);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + " Salary: " + salary;
    }
}

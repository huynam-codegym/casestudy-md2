public class EmployeeFulltime extends Employee{
    public EmployeeFulltime() {
    }

    public EmployeeFulltime(String name, String status, int age, String gender, double salary) {
        super(name, status, age, gender, salary);
    }

    @Override
    public String toString() {
        return "EmployeeFulltime{}" + super.toString();
    }
}

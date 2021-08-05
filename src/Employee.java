public class Employee {
    private String Name;
    private String Status;
    private int Age;
    private String Gender;
    private double Salary;

    public Employee() {
    }

    public Employee(String name, String status, int age, String gender, double salary) {
        Name = name;
        Status = status;
        Age = age;
        Gender = gender;
        Salary = salary;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Name='" + Name + '\'' +
                ", Status='" + Status + '\'' +
                ", Age=" + Age +
                ", Gender='" + Gender + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}

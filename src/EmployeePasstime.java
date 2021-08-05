public class EmployeePasstime extends Employee {
    private Double workTime;
    private double totalSalary;

    public EmployeePasstime() {
    }

    public EmployeePasstime(String name, String status, int age, String gender,
                            double salary, Double workTime, double totalSalary) {
        super(name, status, age, gender, salary);
        this.workTime = workTime;
        this.totalSalary = totalSalary;
    }

    public Double getWorktime() {
        return workTime;
    }

    public void setWorkTime(Double workTime) {
        this.workTime = workTime;
    }
    public void setTotalSalary(double totalSalary) {
        this.totalSalary = totalSalary;
    }
    public double getTotalSalary() {
        return getSalary()*workTime;
    }

    @Override
    public String toString() {
        return "EmployeePasstime{" +
                "worktime=" + workTime +
                ", totalSalary=" + totalSalary +
                '}';
    }
}

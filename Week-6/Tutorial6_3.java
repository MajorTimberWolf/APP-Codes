class Employee {
    private double salary;

    Employee(double salary) {
        this.salary = salary;
    }

    void work() {
        System.out.println("Employee is working");
    }

    double getSalary() {
        return salary;
    }
}

class HRManager extends Employee {
    public HRManager(double salary) {
        super(salary);
    }

    @Override
    void work() {
        System.out.println("HR Manager is managing human resources");
    }

    void addEmployee() {
        System.out.println("HR Manager is adding a new employee");
    }
}
public class Tutorial6_3 {
    public static void main(String[] args) {
        Employee emp = new Employee(50000);
        System.out.println("Employee Salary: $"+emp.getSalary());
        emp.work();

        HRManager hr = new HRManager(70000);
        System.out.println("HR Manager Salary: $"+hr.getSalary());
        hr.work();
        hr.addEmployee();
    }
}

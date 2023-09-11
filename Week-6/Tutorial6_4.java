class Employee {

    public String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println(this.name + " is working hard.");
    }
}

class HRManager extends Employee {

    public HRManager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println(this.name + " is managing employees.");
    }

    public void addEmployee(Employee employee) {
        System.out.println("Adding new employee: " + employee.getName());
    }
}

public class Tutorial6_4 {

    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 100000);
        HRManager hrManager = new HRManager("Susan Smith", 300000);

        System.out.println(employee.getName() + "'s salary is: " + employee.getSalary());
        System.out.println(hrManager.getName() + "'s salary is: " + hrManager.getSalary());

        hrManager.addEmployee(employee);
    }
}

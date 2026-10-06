class Employee {
    void work() {
        System.out.println("Employee is working");
    }

    double getSalary() {
        return 30000;
    }
}

class HRManager extends Employee {
    @Override
    void work() {
        System.out.println("HR Manager is managing employees");
    }

    void addEmployee() {
        System.out.println("New employee added");
    }
}

public class Q4_EmployeeMain {
    public static void main(String[] args) {
        HRManager manager = new HRManager();

        manager.work();
        System.out.println("Salary: " + manager.getSalary());
        manager.addEmployee();
    }
}
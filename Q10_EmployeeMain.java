abstract class Employee {
    abstract double calculateSalary();
    abstract void displayInfo();
}

class Manager extends Employee {
    private String name;
    private double basicSalary;
    private double bonus;

    Manager(String name, double basicSalary, double bonus) {
        this.name = name;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return basicSalary + bonus;
    }

    @Override
    void displayInfo() {
        System.out.println("Manager Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
}

class Programmer extends Employee {
    private String name;
    private double basicSalary;
    private double bonus;

    Programmer(String name, double basicSalary, double bonus) {
        this.name = name;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return basicSalary + bonus;
    }

    @Override
    void displayInfo() {
        System.out.println("Programmer Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
}

public class Q10_EmployeeMain {
    public static void main(String[] args) {
        Manager manager = new Manager("Rahul", 60000, 10000);
        Programmer programmer = new Programmer("Neha", 50000, 8000);

        manager.displayInfo();
        System.out.println();

        programmer.displayInfo();
    }
}
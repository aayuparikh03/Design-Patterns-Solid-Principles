package org.example;
class Employee {
    private String name;
    private double hourlyRate;
    private int hoursWorked;
    public Employee(String name, double hourlyRate, int hoursWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    public String getName() {
        return name;
    }
    public double getHourlyRate() {
        return hourlyRate;
    }
    public int getHoursWorked() {
        return hoursWorked;
    }
}
class Payroll {
    public double calculateSalary(Employee employee) {
        return employee.getHourlyRate() * employee.getHoursWorked();
    }
}
class EmployeeRepository {
    public void save(Employee employee) {
        System.out.println("Saving employee to the database...");
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Hourly Rate: " + employee.getHourlyRate());
        System.out.println("Hours Worked: " + employee.getHoursWorked());
        System.out.println("Employee saved successfully!");
    }
}
public class Main {
    public static void main(String[] args) {
        // Create an employee
        Employee employee = new Employee("John Doe", 25.0, 40);
        // Calculate the salary
        Payroll payroll = new Payroll();
        double salary = payroll.calculateSalary(employee);
        System.out.println("Calculated Salary: $" + salary);

        // Save the employee details
        EmployeeRepository repository = new EmployeeRepository();
        repository.save(employee);
    }
}

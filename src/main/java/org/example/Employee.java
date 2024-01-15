package org.example;

/**
 * The Employee class represents an employee in a company.
 * It stores information such as name, employee ID, worked hours, and pay rate.
 */
public class Employee {
    private String name;
    private String employeeId;
    private double workedHour;
    private double payRate;

    /**
     * Creates a new Employee object with the specified name, employee ID, and pay rate.
     *
     * @param name       The name of the employee.
     * @param employeeId The unique employee ID.
     * @param payRate    The hourly pay rate for the employee.
     */
    public Employee(String name, String employeeId, double payRate) {
        this.name = name;
        this.employeeId = employeeId;
        this.payRate = payRate;
        this.workedHour = 0;
    }

    /**
     * Adds hours worked to the employee's total worked hours.
     *
     * @param hour The number of hours worked to be added.
     */
    public void addHoursWorked(double hour) {
        if (hour > 0) {
            this.workedHour += hour;
        }
    }

    /**
     * Gets the name of the employee.
     *
     * @return The name of the employee.
     */
    public String getName() { return this.name; }

    /**
     * Gets the employee's ID.
     *
     * @return The employee's ID.
     */
    public String getEmployeeId() { return this.employeeId; }

    /**
     * Gets the hourly pay rate of the employee.
     *
     * @return The hourly pay rate of the employee.
     */
    public double getPayRate() { return this.payRate; }

    /**
     * Resets the total worked hours of the employee to zero.
     *
     * @param workedHour The new total worked hours to set to zero.
     */
    public void resetWorkedHour(double workedHour) {
        this.workedHour = 0;
    }

    /**
     * Gets the total hours worked by the employee.
     *
     * @return The total hours worked by the employee.
     */
    public double getHoursWorked() { return this.workedHour; }

    /**
     * Calculates and returns a Paycheck object representing the employee's weekly paycheck.
     *
     * @return A Paycheck object representing the employee's weekly paycheck.
     */
    public Paycheck getWeeklyCheck() {
        return new Paycheck(payRate, workedHour);
    }

    /**
     * Returns a formatted string representation of the employee's information, including name, ID, and weekly paycheck details.
     *
     * @return A formatted string containing employee information and paycheck details.
     */
    public String employeeToString() {
        return "Name: " + name + "\nID: " + employeeId + "\n" + getWeeklyCheck().payToString();
    }
}

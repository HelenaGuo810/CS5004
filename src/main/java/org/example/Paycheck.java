package org.example;

import java.text.DecimalFormat;

/**
 * The Paycheck class represents a paycheck for an employee, including pay rate, worked hours, and total pay.
 */
public class Paycheck {
  private double payRate;
  private double workedHour;
  private double totalPaid;

  /**
   * Creates a Paycheck object with the specified pay rate and worked hours. It calculates the total pay upon creation.
   *
   * @param payRate    The hourly pay rate for the employee.
   * @param workedHour The number of hours worked by the employee.
   */
  public Paycheck(double payRate, double workedHour) {
    this.payRate = payRate;
    this.workedHour = workedHour;
    calculateTotalPay();
  }

  /**
   * Calculates the total pay based on the pay rate and worked hours.
   * If the worked hours are less than or equal to 40, the total pay is payRate * workedHour.
   * If the worked hours are more than 40, overtime pay is applied at 1.5 times the pay rate for hours exceeding 40.
   */
  public void calculateTotalPay() {
    if (workedHour <= 40) {
      this.totalPaid = payRate * workedHour;
    } else {
      this.totalPaid = payRate * 40 + (1.5 * payRate) * (workedHour - 40);
    }
  }

  /**
   * Gets the total pay for the paycheck.
   *
   * @return The total pay for the paycheck.
   */
  public double getTotalPay() {
    return this.totalPaid;
  }

  /**
   * Gets the hourly pay rate for the employee.
   *
   * @return The hourly pay rate for the employee.
   */
  public double getPayRate() { return this.payRate; }

  /**
   * Gets the number of hours worked by the employee.
   *
   * @return The number of hours worked by the employee.
   */
  public double getHoursWorked() { return this.workedHour; }

  /**
   * Calculates and returns the total pay after taxes.
   * If the total pay is less than $400, a 10% tax is applied. Otherwise, a 15% tax is applied.
   *
   * @return The total pay after taxes.
   */
  public double getPayAfterTaxes() {
    if (this.totalPaid < 400) {
      return this.totalPaid * 0.90;
    } else {
      return this.totalPaid * 0.85;
    }
  }

  /**
   * Converts the total pay after taxes to a formatted string.
   *
   * @return A formatted string representing the payment after taxes.
   */
  public String payToString() {
    double totalPay = getPayAfterTaxes();
    DecimalFormat df = new DecimalFormat("0.00");
    return String.format("Payment after taxes: $ " + df.format(totalPay));
  }
}
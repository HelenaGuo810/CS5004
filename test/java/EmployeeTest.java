import org.example.Employee;
import org.example.Paycheck;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * The EmployeeTest class contains JUnit test cases to test the functionality of the Employee class.
 */
public class EmployeeTest {

  private Employee Steve;

  /**
   * Sets up the test environment by creating an Employee object named Steve with initial data.
   */
  @Before
  public void setUp() {
    Steve = new Employee("Steve Jobs", "FX101", 12.00);
    Steve.addHoursWorked(45.00);
  }

  /**
   * Test case to verify the correctness of the getName() method.
   */
  @Test
  public void testName() {
    assertEquals("Steve Jobs", Steve.getName());
  }

  /**
   * Test case to verify the correctness of the getEmployeeId() method.
   */
  @Test
  public void testEmployeeID() {
    assertEquals("FX101", Steve.getEmployeeId());
  }

  /**
   * Test case to verify the correctness of the getPayRate() method.
   */
  @Test
  public void testPayRate() {
    assertEquals(Double.doubleToLongBits(12.00), Double.doubleToLongBits(Steve.getPayRate()));
  }

  /**
   * Test case to verify the correctness of the getHoursWorked() method.
   */
  @Test
  public void testWorkedHour() {
    assertEquals(Double.doubleToLongBits(45.00), Double.doubleToLongBits(Steve.getHoursWorked()));
  }

  /**
   * Test case to verify the correctness of the getWeeklyCheck() method and its calculations.
   */
  @Test
  public void testGetWeeklyCheck() {
    Paycheck SteveCheck = Steve.getWeeklyCheck();
    assertEquals(Double.doubleToLongBits(Steve.getPayRate()), Double.doubleToLongBits(SteveCheck.getPayRate()));
    assertEquals(Double.doubleToLongBits(Steve.getHoursWorked()), Double.doubleToLongBits(SteveCheck.getHoursWorked()));
    assertEquals(Double.doubleToLongBits(570.00), Double.doubleToLongBits(SteveCheck.getTotalPay()));
  }
}

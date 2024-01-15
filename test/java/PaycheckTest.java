import org.example.Paycheck;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * The PaycheckTest class contains JUnit test cases to test the functionality of the Paycheck class.
 */
public class PaycheckTest {
  private Paycheck Helena;

  /**
   * Sets up the test environment by creating a Paycheck object named Helena with initial data.
   */
  @Before
  public void setUp() {
    Helena = new Paycheck(12.00, 45.00);
  }

  /**
   * Test case to verify the correctness of the getPayRate() method.
   */
  @Test
  public void testPayRate() {
    assertEquals(Double.doubleToLongBits(12.00), Double.doubleToLongBits(Helena.getPayRate()));
  }

  /**
   * Test case to verify the correctness of the getHoursWorked() method.
   */
  @Test
  public void testWorkedHour() {
    assertEquals(Double.doubleToLongBits(45.00), Double.doubleToLongBits(Helena.getHoursWorked()));
  }

  /**
   * Test case to verify the correctness of the getPayAfterTaxes() method.
   */
  @Test
  public void testPayAfterTaxes() {
    assertEquals(Double.doubleToLongBits(484.50), Double.doubleToLongBits(Helena.getPayAfterTaxes()));
  }

  /**
   * Test case to verify the correctness of the calculateTotalPay() method.
   */
  @Test
  public void testCalculateTotalPay() {
    assertEquals(Double.doubleToLongBits(570.00), Double.doubleToLongBits(Helena.getTotalPay()));
  }

  /**
   * Test case to verify the correctness of the payToString() method.
   */
  @Test
  public void testToString() {
    assertEquals("Payment after taxes: $ 484.50", Helena.payToString());
  }
}

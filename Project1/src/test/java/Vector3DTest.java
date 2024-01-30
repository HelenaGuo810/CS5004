import org.example.Vector3D;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class Vector3DTest {

  private Vector3D Vector;

  @Before
  public void setUp() {
    Vector = new Vector3D(2.0, 2.0, 2.0);
  }

  @Test
  public void testX() {
    assertEquals(Double.doubleToLongBits(2.0),
            Double.doubleToLongBits(Vector.getX()));
  }

  @Test
  public void testY() {
    assertEquals(Double.doubleToLongBits(2.0),
            Double.doubleToLongBits(Vector.getY()));
  }

  @Test
  public void testZ() {
    assertEquals(Double.doubleToLongBits(2.0),
            Double.doubleToLongBits(Vector.getZ()));
  }

  @Test
  public void testToString() {
    assertEquals("(2.00, 2.00, 2.00)", Vector.vectorToString());
  }

  @Test
  public void testGetMaginitude() {
    assertEquals(Double.doubleToLongBits(3.4641016151377544), Double.doubleToLongBits(Vector.getMagnitude()));
  }

  @Test
  void testNormalize() {
    Vector3D vector = new Vector3D(3, 0, 4);
    Vector3D normalized = vector.normalize();
    assertEquals(1.0, normalized.getMagnitude());
  }

  @Test
  void testNormalizeZeroVector() {
    Vector3D zeroVector = new Vector3D(0, 0, 0);
    assertThrows(IllegalStateException.class, zeroVector::normalize);
  }

  @Test
  void testAdd() {
    Vector3D v1 = new Vector3D(1, 2, 3);
    Vector3D v2 = new Vector3D(-1, 0, 5);
    Vector3D result = v1.add(v2);
    assertEquals(new Vector3D(0, 2, 8), result);
  }

  @Test
  void testMultiply() {
    Vector3D vector = new Vector3D(1, -2, 3);
    Vector3D result = vector.multiply(2);
    assertEquals(new Vector3D(2, -4, 6), result);
  }

  @Test
  void testDotProduct() {
    Vector3D v1 = new Vector3D(1, 2, 3);
    Vector3D v2 = new Vector3D(-1, 0, 5);
    assertEquals(14, v1.dotProduct(v2));
  }

  @Test
  void testAngleBetween() {
    Vector3D v1 = new Vector3D(1, 0, 0);
    Vector3D v2 = new Vector3D(0, 1, 0);
    assertEquals(90.0, v1.angleBetween(v2));
  }

  @Test
  void testCrossProduct() {
    Vector3D v1 = new Vector3D(1, 2, 3);
    Vector3D v2 = new Vector3D(-1, 0, 5);
    Vector3D result = v1.crossProduct(v2);
    assertEquals(new Vector3D(10, -8, 2), result);
  }
}

import org.junit.Test;

import artists.Poet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PoetTest {
  @Test
  public void testPoetConstructorValidInput() {
    Poet poet = new Poet("Maya Angelou", 86, new String[]{"Autobiographical Fiction"}, new String[]{"Pulitzer Prize"}, "Random House");
    assertNotNull("Poet object should not be null", poet);
  }

  // Tests for invalid constructor inputs

  @Test
  public void testToString() {
    Poet poet = new Poet("Maya Angelou", 86, new String[]{"Autobiographical Fiction"}, new String[]{"Pulitzer Prize"}, "Random House");
    String expected = "My name is Maya Angelou\nMy age is 86\nI am a POET\nI make these types of poems: [Autobiographical Fiction]\nMy publishing company is: Random House";
    assertEquals("toString method does not match expected string", expected, poet.toString());
  }
}

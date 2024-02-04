import org.junit.Test;

import artists.Musician;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MusicianTest {
  @Test
  public void testMusicianConstructorValidInput() {
    Musician musician = new Musician("The Weeknd", 32, new String[]{"R&B", "Pop"}, new String[]{"Grammy"}, "Dawn FM", "XO");
    assertNotNull("Musician object should not be null", musician);
  }

  // Tests for invalid constructor inputs

  @Test
  public void testToString() {
    Musician musician = new Musician("The Weeknd", 32, new String[]{"R&B", "Pop"}, new String[]{"Grammy"}, "Dawn FM", "XO");
    String expected = "My name is The Weeknd\nMy age is 32\nI am a MUSICIAN\nI make these types of music: [R&B, Pop]\nMy current album is: Dawn FM\nMy recording company is: XO";
    assertEquals("toString method does not match expected string", expected, musician.toString());
  }
}

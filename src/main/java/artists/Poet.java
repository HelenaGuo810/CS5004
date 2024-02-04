package artists;

import java.util.Arrays;

/**
 * The {@code Poet} class represents a poet with specific attributes.
 * It extends the {@code AbstractArtist} class, inheriting common artist attributes.
 * In addition to common attributes, it includes information specific to poets,
 * such as the publisher of their works.
 */
public class Poet extends AbstractArtist{
  private String publisher;

  /**
   * Constructs a new {@code Poet} with the specified details.
   *
   * @param name    The name of the poet. Should not be null or empty.
   * @param age     The age of the poet. Should be in the range [0, 128].
   * @param genres  An array of strings representing the genres of poems the poet is associated with.
   * @param awards  An array of strings representing the awards the poet has received.
   * @param publisher The name of the publishing company associated with the poet.
   * @throws IllegalArgumentException If the name is null or empty, or if the age is out of the valid range.
   */
  public Poet(String name, int age, String[] genres, String[] awards, String publisher){
    super(name, age, genres, awards);
    this.publisher = publisher;
  }

  /**
   * Returns a string representation of the {@code Poet} instance.
   * This includes the poet's name, age, role (as "POET"), genres, and the publishing company.
   *
   * @return A formatted string containing the poet's details.
   */
  @Override
  public String toString(){
    return "My name is " + this.getName() + "\n" +
            "My age is " + this.getAge() + "\n" +
            "I am a POET\n" +
            "I make these types of poems: " + Arrays.toString(this.getGenres()) + "\n"+
            "My publishing company is: " + this.publisher;
  }
}

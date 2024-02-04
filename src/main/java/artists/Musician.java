package artists;

import java.util.Arrays;

/**
 * The {@code Musician} class represents a musician with specific attributes.
 * It extends the {@code AbstractArtist} class, inheriting common artist attributes.
 * In addition to common attributes, it includes information specific to musicians
 * such as their current album and recording company.
 */
public class Musician extends AbstractArtist{
  private String currentAlbum;
  private String recordingCompany;

  /**
   * Constructs a new {@code Musician} with the specified details.
   *
   * @param name            The name of the musician. Should not be null or empty.
   * @param age             The age of the musician. Should be in the range [0, 128].
   * @param genres          An array of strings representing the genres of music the musician is associated with.
   * @param awards          An array of strings representing the awards the musician has received.
   * @param currentAlbum    The title of the musician's current album.
   * @param recordingCompany The name of the recording company associated with the musician.
   * @throws IllegalArgumentException If the name is null or empty, or if the age is out of the valid range.
   */
  public Musician(String name, int age, String[] genres, String[] awards, String currentAlbum, String recordingCompany){
    super(name, age, genres, awards);
    this.currentAlbum = currentAlbum;
    this.recordingCompany = recordingCompany;
  }

  /**
   * Returns a string representation of the {@code Musician} instance.
   * This includes the musician's name, age, role (as "MUSICIAN"), genres, current album, and recording company.
   *
   * @return A formatted string containing the musician's details.
   */
  @Override
  public String toString(){
    return "My name is " + this.getName() +"\n" +
            "My age is " + this.getAge() + "\n" +
            "I am a MUSICIAN\n" +
            "I make these types of music: " + Arrays.toString(this.getGenres()) + "\n" +
            "My current album is: " + currentAlbum + "\n" +
            "My recording company is: " + recordingCompany;
  }
}

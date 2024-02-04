package artists;

import java.util.Arrays;

/**
 * The {@code Actor} class represents an actor with specific attributes.
 * It extends the {@code AbstractArtist} class, inheriting common artist attributes.
 * In addition to the common attributes, it holds information about the movies
 * in which the actor has performed.
 */
public class Actor extends AbstractArtist{
  private String[] movies;

  /**
   * Constructs a new {@code Actor} with the specified details.
   *
   * @param name   The name of the actor. Should not be null or empty.
   * @param age    The age of the actor. Should be in the range [0, 128].
   * @param genres An array of strings representing the genres of movies the actor is associated with.
   * @param awards An array of strings representing the awards the actor has received.
   * @param movies An array of strings representing the movies the actor has acted in.
   * @throws IllegalArgumentException If the name is null or empty, or if the age is out of the valid range.
   */
  public Actor(String name, int age, String[] genres, String[] awards, String[] movies){
    super(name, age, genres, awards);
    this.movies = movies;
  }

  /**
   * Returns a string representation of the {@code Actor} instance.
   * This includes the actor's name, age, role (as "ACTOR"), genres, and the list of movies.
   *
   * @return A formatted string containing the actor's details.
   */
  @Override
  public String toString(){
    return "My name is " + this.getName() + "\n" +
            "My age is " + this.getAge() + "\n" +
            "I am an ACTOR\n" +
            "I make these types of movies: " + Arrays.toString(getGenres()) + "\n" +
            "I have acted in these movies: " + Arrays.toString(movies);
  }
}

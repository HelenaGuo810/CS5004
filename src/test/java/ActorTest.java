import org.junit.Test;

import artists.Actor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ActorTest {
  @Test
  public void testActorConstructorValid(){
    Actor actor = new Actor("Samuel L. Jackson", 73, new String[]{"Action", "SciFi", "Drama"}, new String[]{"Oscar"}, new String[]{"Star Wars", "Captain America: Winter Soldier", "Pulp Fiction"});
    assertNotNull("Actor object should not be null", actor);
  }

  @Test
  public void testToString() {
    Actor actor = new Actor("Samuel L. Jackson", 73, new String[]{"Action", "SciFi", "Drama"}, new String[]{"Oscar"}, new String[]{"Star Wars", "Captain America: Winter Soldier", "Pulp Fiction"});
    String expected = "My name is Samuel L. Jackson\nMy age is 73\nI am an ACTOR\nI make these types of movies: [Action, SciFi, Drama]\nI have acted in these movies: [Star Wars, Captain America: Winter Soldier, Pulp Fiction]";
    assertEquals("toString method does not match expected string", expected, actor.toString());
  }
}

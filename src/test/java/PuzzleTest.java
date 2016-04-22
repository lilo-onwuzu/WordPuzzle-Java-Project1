import org.junit.*;
import static org.junit.Assert.*;

public class PuzzleTest {

  @Test
  public void runPuzzle_replacesA(){
    Puzzle testPuzzle = new Puzzle();
    String expected = "-";
    assertEquals(expected, testPuzzle.runPuzzle("a"));
  }

  @Test
  public void runPuzzle_replacesAandE(){
    Puzzle testPuzzle = new Puzzle();
    String expected = "--";
    assertEquals(expected, testPuzzle.runPuzzle("ae"));
  }
}

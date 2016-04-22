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

  @Test
  public void runPuzzle_replacesAandEandI(){
    Puzzle testPuzzle = new Puzzle();
    String expected = "---";
    assertEquals(expected, testPuzzle.runPuzzle("aei"));
  }

  @Test
  public void runPuzzle_replacesAandEandIandO(){
    Puzzle testPuzzle = new Puzzle();
    String expected = "----";
    assertEquals(expected, testPuzzle.runPuzzle("aeio"));
  }
}

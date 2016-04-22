import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
    goTo("http://localhost:4567");
    assertThat(pageSource()).contains("Let's Play");
  }

  @Test
  public void showPuzzleTest() {
    goTo("http://localhost:4567");
    submit(".btn");
    assertThat(pageSource()).contains("Guess");
  }

  // @Test
  // public void showPuzzleTest(){
  //   goTo("http://localhost:4567");
  //   fillSelect("#playerOne").withValue("rock");
  //   fillSelect("#playerTwo").withValue("rock");
  //
  //   assertThat(pageSource()).contains("Nobody WINS");
  // }
  //
  // @Test
  // public void outputTestPlayerOneWins(){
  //   goTo("http://localhost:4567");
  //   fillSelect("#playerOne").withValue("paper");
  //   fillSelect("#playerTwo").withValue("rock");
  //   submit(".btn");
  //   assertThat(pageSource()).contains("Player One WINS");
  // }
  //
  // @Test
  // public void outputTestPlayerTwoWins(){
  //   goTo("http://localhost:4567");
  //   fillSelect("#playerOne").withValue("scissors");
  //   fillSelect("#playerTwo").withValue("rock");
  //   submit(".btn");
  //   assertThat(pageSource()).contains("Player Two WINS");
  // }

}

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
    assertThat(pageSource()).contains("Indicate if you want to play against Computer or another user");
  }

  @Test
  public void outputTestTie(){
    goTo("http://localhost:4567");
    fillSelect("#playerOne").withValue("rock");
    fillSelect("#playerTwo").withValue("rock");
    submit(".btn");
    assertThat(pageSource()).contains("Nobody WINS");
  }

  @Test
  public void outputTestPlayerOneWins(){
    goTo("http://localhost:4567");
    fillSelect("#playerOne").withValue("paper");
    fillSelect("#playerTwo").withValue("rock");
    submit(".btn");
    assertThat(pageSource()).contains("Player One WINS");
  }

  @Test
  public void outputTestPlayerTwoWins(){
    goTo("http://localhost:4567");
    fillSelect("#playerOne").withValue("scissors");
    fillSelect("#playerTwo").withValue("rock");
    submit(".btn");
    assertThat(pageSource()).contains("Player Two WINS");
  }

}

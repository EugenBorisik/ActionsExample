import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class SampleTest {

  private WebDriver driver;

  @BeforeEach
  public void setup() {
    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setBrowserName("chrome");
    try {
      driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
    } catch (MalformedURLException e) {
      e.printStackTrace();
    }
  }

  @AfterEach
  public void teardown() {
    driver.close();
  }

  @Test
  public void t1() {
    driver.get("https://mail.ru/");

    Assertions.assertEquals("Mail.ru: почта, поиск в интернете, новости, игры", driver.getTitle());
  }

  @Test
  public void t2() {
    driver.get("https://tut.by/");

    Assertions.assertEquals("Белорусский портал TUT.BY. Новости Беларуси и мира", driver.getTitle());
  }

  @Test
  public void t3() {
    driver.get("https://championat.com/");

    Assertions.assertEquals("Чемпионат.com: новости спорта - Чемпионат", driver.getTitle());
  }
}

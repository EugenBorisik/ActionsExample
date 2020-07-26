import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest {

  private WebDriver driver;

  @BeforeEach
  public void setup() {
    driver = new ChromeDriver();
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

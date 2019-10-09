import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class PracEx1Get {
    WebDriver driver;

    @Test(priority =1)
    public void aunch_browser() {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\crome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);

    }
    @Test(priority = 2)
    public void get() {
        String url = "https://www.amazon.com";
        driver.get(url);
        String titleOfThePage = driver.getTitle();
        System.out.println("Page title"+titleOfThePage);
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current url"+currentUrl);
        String pageSource = driver.getPageSource();
        System.out.println("Page Source"+pageSource);
        driver.navigate().to("https://www.toolsqa.com/selenium-tutorial/");
        // driver.quit();
        // driver.close();

    }
}

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class KeyboardMouseInput {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rathe\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\\");


        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/keypress");

        WebElement name = driver.findElement(By.id("name"));
        name.click();
        name.sendKeys("Himanshu Rathee");
        //Checking visually if correct name is entered
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement button = driver.findElement(By.id("button"));
        button.click();

        driver.quit();
    }

}

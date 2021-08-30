import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondSelenium {
    public static void main(String[] args) throws InterruptedException {
        WebDriver wd = new ChromeDriver();
        wd.get("https://foodstore-1.web.app/");
        Thread.sleep(2500);
        WebElement cart =wd.findElement(By.cssSelector(".headerBtns .cart"));
        cart.click();
        Thread.sleep(2500);
        wd.findElement(By.className("closeCartBtn")).click();
        Thread.sleep(2500);
        wd.findElement(By.linkText("Sign In")).click();
        Thread.sleep(2500);
        wd.navigate().back();
        Thread.sleep(2500);
        wd.findElement(By.className("City Input")).sendKeys("Amravati");
        wd.findElement(By.id("citySearch")).click();




    }
}




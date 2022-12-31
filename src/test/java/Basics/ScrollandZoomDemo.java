package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollandZoomDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.autoitscript.com/site/autoit/downloads/");
        Thread.sleep(2000);

        WebElement downloadButton = driver.findElement(By.cssSelector("img[title='Download AutoIt']"));

        System.out.println("Scroll to bottom");
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(3000);

        System.out.println("Scroll to Top");
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
        Thread.sleep(3000);

        System.out.println("Scroll to Element");
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", downloadButton);
        Thread.sleep(5000);

        System.out.println("Zoom to 80%");
        ((JavascriptExecutor) driver).executeScript("document.body.style.zoom = 0.8");
        Thread.sleep(2000);

        driver.close();
    }
}

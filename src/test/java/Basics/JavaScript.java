package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {
    public static void main(String[] args) throws InterruptedException {
        String baseDir = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",baseDir + "\\src\\main\\resources\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.calculator.net/percent-calculator.html");

        WebElement textbox1= driver.findElement(By.id("cpar1"));
        WebElement textbox2= driver.findElement(By.id("cpar2"));
        WebElement calculateButton=driver.findElement(By.xpath("//input[@id='cpar1']/following::input[@value='Calculate'][1]"));

        JavascriptExecutor js=(JavascriptExecutor)driver;

        js.executeScript("arguments[0].value='10';",textbox1);Thread.sleep(5000);
        js.executeScript("arguments[0].value='120';",textbox2);Thread.sleep(5000);
        js.executeScript("arguments[0].click();",calculateButton);Thread.sleep(5000);

        driver.quit();

    }
}

package Basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        String baseDir = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",baseDir + "\\src\\main\\resources\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();

        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
        WebElement alertBoxButton = driver.findElement(By.xpath("//*[@id=\"page-top\"]/div/div/div/div/div/div[2]/input[1]"));
        Thread.sleep(2000);
//        alertBoxButton.click();
//        Thread.sleep(2000);
//
//        Alert alert1=driver.switchTo().alert();
//        System.out.println(alert1.getText());
//        alert1.accept();

//        WebElement alertConfirmationBoxButton = driver.findElement(By.xpath("//*[@id=\"page-top\"]/div/div/div/div/div/div[2]/input[2]"));
//        alertConfirmationBoxButton.click();
//        Alert alert2=driver.switchTo().alert();
//        System.out.println(alert2.getText());
//        alert2.dismiss();
//        Thread.sleep(3000);

        WebElement promptAlert=driver.findElement(By.xpath("//*[@id=\"page-top\"]/div/div/div/div/div/div[2]/input[3]"));
        promptAlert.click();

        Alert alert3=driver.switchTo().alert();
        alert3.sendKeys("Pranav");
        Thread.sleep(4000);
        System.out.println(alert3.getText());
        alert3.accept();


        driver.quit();
    }
}

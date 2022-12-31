package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class UploadFileDemo {
    public static void main(String[] args) throws InterruptedException, IOException {
        String baseDir = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", baseDir + "\\src\\main\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
//        ((JavascriptExecutor)driver).executeScript("return window.stop");
//        Thread.sleep(2000);

        WebElement uploadField = driver.findElement(By.name("photo"));

//        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",uploadField);
//        Thread.sleep(2000);
//
//        Actions builder = new Actions(driver);
//        Action clickButton = builder.moveToElement(uploadField).click(uploadField).build();
//        clickButton.perform();
//        System.out.println("clicked");
//
//        Thread.sleep(3000);
//
//        Runtime.getRuntime().exec(baseDir + "\\src\\main\\utils\\autoIT\\fileUpload1.exe");
//        Thread.sleep(3000);
//        System.out.println("File uploaded is : " + uploadField.getText());
//        System.out.println("File uploaded is : "+((JavascriptExecutor)driver).executeScript("return arguments[0].value",uploadField));


        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",uploadField);
        Thread.sleep(10000);
        uploadField.sendKeys("F:\\Software testing\\Selenium Testing\\SeleniumTesting\\src\\main\\resources\\uploadfiles\\image.PNG");

//        Runtime.getRuntime().exec(baseDir + "\\src\\main\\utils\\autoIT\\clickOnInput.exe");
//        Thread.sleep(3000);
//        Action setFile = builder.sendKeys(baseDir + "\\src\\test\\testData\\uploadFile\\rubixCube3By3.png").sendKeys(Keys.ENTER).build();
//        setFile.perform();

//        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",uploadField);
//        uploadField.sendKeys(baseDir + "\\src\\test\\testData\\uploadFile\\rubixCube3By3.png");


        Thread.sleep(5000);
        driver.quit();
    }
}

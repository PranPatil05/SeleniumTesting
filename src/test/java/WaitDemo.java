import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class WaitDemo {
    public static void main(String ... a) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //Type 1 - Implicit Wait
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Type 2- Explicit Wait -
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));

        //Type 3- Fluent Wait -
//        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//                .withTimeout(Duration.ofSeconds(30))
//                .pollingEvery(Duration.ofSeconds(5))
//                .ignoring(NoSuchElementException.class);

        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

        //Case 1 -
//        WebElement buttonForAlert = driver.findElement(By.id("alert"));
//        buttonForAlert.click();
//        Thread.sleep(6000);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //Not Applicable to Alert
//        wait.until(ExpectedConditions.alertIsPresent());
//
//        Alert alert=driver.switchTo().alert();
//        alert.getText();
//        alert.accept();
//        System.out.println("Alert accepted");

        //Case 2 -

//        WebElement changeTextButton = driver.findElement(By.id("populate-text"));
//        changeTextButton.click();
////        Thread.sleep(11000);
////        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(11));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Selenium Webdriver']")));
//
//        WebElement changedText=driver.findElement(By.xpath("//h2[text()='Selenium Webdriver']"));
////        wait.until(ExpectedConditions.visibilityOf(changedText));
////        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Selenium Webdriver']")));
//        System.out.println(changedText.getText());

        //Case 3 -

//        WebElement displayOtherButton = driver.findElement(By.id("display-other-button"));
//        WebElement enabledButton = driver.findElement(By.id("hidden"));
//        System.out.println(enabledButton.isDisplayed());
//        displayOtherButton.click();
//
////        Thread.sleep(11000);
////        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hidden")));
//
//        enabledButton.click();
//        System.out.println(enabledButton.isDisplayed());
//        System.out.println("Enable is Clicked");

        //Case 4 -
//        WebElement enableButton = driver.findElement(By.id("enable-button"));
//        WebElement enabledButton2 = driver.findElement(By.id("disable"));
//        System.out.println("Is Displayed : " + enabledButton2.isDisplayed());
//        System.out.println("Is Enabled : " + enabledButton2.isEnabled());
//        enableButton.click();
//        System.out.println("Is Enabled before wait: " + enabledButton2.isEnabled());
//
////        Thread.sleep(11000);
////        wait.until(ExpectedConditions.elementToBeClickable(enabledButton2));
//
//        enabledButton2.click();
//        System.out.println("Is Enabled : " + enabledButton2.isEnabled());

        //Case 5 -
        //Both checkbox and text box selecteted simultaneously

//        WebElement changeTextButton = driver.findElement(By.id("populate-text"));
//        WebElement checkboxButton= driver.findElement(By.xpath("//button[@id='checkbox']"));
//        WebElement chekBox= driver.findElement(By.xpath("//input[@type='checkbox']"));
//        checkboxButton.click();
//        changeTextButton.click();
//        WebElement changedText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Selenium Webdriver']")));
//        Boolean changedText2 = wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//input[@type='checkbox']")));
//        System.out.println("Text is : " + changedText.getText());
//        System.out.println("checkBox Isselected---"+chekBox.isSelected());

        //Both checkbox and text box selecteted diff time
        WebElement changeTextButton = driver.findElement(By.id("populate-text"));
        changeTextButton.click();
        WebElement checkboxButton= driver.findElement(By.xpath("//button[@id='checkbox']"));
        WebElement chekBox= driver.findElement(By.xpath("//input[@type='checkbox']"));
        WebElement changedText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Selenium Webdriver']")));
        checkboxButton.click();
        wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//input[@type='checkbox']")));
//        Boolean changedText2 = wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//input[@type='checkbox']")));
        System.out.println("checkBox Isselected---"+chekBox.isSelected());
        System.out.println("Text is : " + changedText.getText());

        driver.quit();



    }
}

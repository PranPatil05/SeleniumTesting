package Basics;

import org.openqa.selenium.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ScreenShotDemo {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.autoitscript.com/site/autoit/downloads/");
//        driver.navigate().to("https://www.google.com");

        System.out.println("Taking Normal Screenshot");
        generateScreenShot(driver);
        Thread.sleep(1000);

        WebElement downloadButton = driver.findElement(By.cssSelector("img[title='Download AutoIt']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", downloadButton);
        System.out.println("Taking Focused Screenshot");
        generateScreenShot(driver);
        Thread.sleep(1000);

        System.out.println("Taking Full Screenshot");
        generateFullScreenshot(driver);

        Thread.sleep(1000);

        driver.quit();

    }

    public static void generateScreenShot(WebDriver driver) throws IOException {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        LocalDateTime now=LocalDateTime.now();
        String currentDirectory = System.getProperty("user.dir");
        String filpath=currentDirectory+"\\src\\test\\Output\\Screenshot\\";
        String filrname=filpath+dtf.format(now)+".png";
        File Screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(Screenshot,new File(filrname));
        System.out.println("ScreenShot Saved File name ="+filrname);
    }

    public static void generateFullScreenshot(WebDriver driver) throws IOException{
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        LocalDateTime now=LocalDateTime.now();

        String currentDirectory = System.getProperty("user.dir");
        String filpath=currentDirectory+"\\src\\test\\Output\\Screenshot\\";
        String filrname=filpath+dtf.format(now)+".png";

        Screenshot screenshot=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
        ImageIO.write(screenshot.getImage(),"PNG",new File(filrname));

        System.out.println("ScreenShot Saved File name ="+filrname);
    }
}

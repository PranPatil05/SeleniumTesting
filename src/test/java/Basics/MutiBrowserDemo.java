package Basics;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MutiBrowserDemo {
    public static void main(String[] args) throws InterruptedException {
        String baseDir = System.getProperty("user.dir");
        WebDriver driver;

//        Chrome
//        System.setProperty("webdriver.chrome.driver",baseDir + "\\src\\main\\resources\\drivers\\chromedriver.exe");
//        driver = new ChromeDriver();


//        Edge
//        System.setProperty("webdriver.edge.driver",baseDir + "\\src\\main\\resources\\drivers\\msedgedriver_win.exe");
//        driver = new EdgeDriver();

//        Firefox
        System.setProperty("webdriver.firefox.marionette",baseDir + "\\src\\main\\resources\\drivers\\geckodriver.exe");
//        System.setProperty("webdriver.gecko.driver",baseDir + "\\src\\main\\resources\\drivers\\geckodriver.exe" );
        driver = new FirefoxDriver();

//        System.setProperty("webdriver.gecko.driver",baseDir + "\\src\\main\\resources\\drivers\\geckodriver.exe" );

//        DesiredCapabilities capabilities=new DesiredCapabilities();
//        capabilities.setCapability("marionette",true);
//        driver= new FirefoxDriver(capabilities);


//        Headless / Incognito chrome
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
//        System.setProperty("webdriver.chrome.driver",baseDir + "\\src\\main\\resources\\drivers\\chromedriver_win.exe");
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
//        options.addArguments("--incognito");
//        LocalDateTime now = LocalDateTime.now();
//        System.out.println("Test start at : " + dtf.format(now));
//        driver = new ChromeDriver(options);

//        HTMLUnit
//        driver = new HtmlUnitDriver();

//        PhantomJS
//        System.setProperty("phantomjs.binary.path",baseDir + "\\src\\main\\resources\\drivers\\phantomjs_win.exe");
//        driver = new PhantomJSDriver();

//        driver.manage().window().maximize();
//        driver.get("https://www.calculator.net/percent-calculator.html");
//        driver.findElement(By.id("cpar1")).sendKeys("10");
//        Thread.sleep(3000);
//        driver.findElement(By.id("cpar2")).sendKeys("123");
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//input[@id='cpar1']/following::input[@value='Calculate'][1]")).click();
//        Thread.sleep(2000);
//        System.out.println(driver.findElement(By.className("h2result")).getText());
//        Thread.sleep(2000);

        driver.get("https://www.google.com");


//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
//        LocalDateTime now = LocalDateTime.now();
//        String currentDirectory = System.getProperty("user.dir");
//        String filePath = currentDirectory + "\\src\\test\\Output\\Screenshots\\";
//        String fileName = filePath + dtf.format(now) + ".png";
//
//        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(screenshotFile, new File(fileName));
//
//        System.out.println("Screenshot Saved : " + fileName);


        Thread.sleep(5000);

        driver.quit();
//        now = LocalDateTime.now();
//        System.out.println("Test Ends at : " + dtf.format(now));
    }
}

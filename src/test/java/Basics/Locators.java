package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
        String baseDir = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",baseDir + "\\src\\main\\resources\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.calculator.net/percent-calculator.html");

        //1. Find By id -
//        WebElement element=driver.findElement(By.id("cpar1"));
//        element.sendKeys("100");

        //2. Find By name -
//        driver.findElement(By.name("c21par1")).sendKeys("110");

        //3. Find By Tag -

//        List<WebElement> tags=driver.findElements(By.tagName("p"));
//        System.out.println(tags);
//        for (WebElement ele:driver.findElements(By.tagName("p"))){
//            System.out.println(ele.getText());
//        }

        //4. Find By LinkText -

//        System.out.println("Linktext ="+driver.findElement(By.linkText("Scientific")).getText());
//        System.out.println("Linktext ="+driver.findElement(By.linkText("Scientific")).getTagName());

        //5. Find By partialLinkText -
//        System.out.println(driver.findElement(By.partialLinkText("Perce")).getText());

        //6. Find By className -
//        driver.findElement(By.className("inlong")).sendKeys("120");

//        List<WebElement> inlongList=driver.findElements(By.className("inlong"));
//        System.out.println(inlongList);

        //7.find by xpath

//        driver.findElement(By.xpath("//*[@id=\"cpar2\"]")).sendKeys("1000");

        driver.findElement(By.cssSelector("input[name='cpar1']")).sendKeys("10");   // tag[Attribute='value']
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input#cpar2")).sendKeys("120");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[name='cpar2']")).clear();
		Thread.sleep(5000);
		System.out.println("Value is " + driver.findElement(By.cssSelector("input[name='cpar1']")).getAttribute("value"));

        Thread.sleep(2000);
        driver.quit();
    }
}

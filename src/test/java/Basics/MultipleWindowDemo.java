package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class MultipleWindowDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://www.seleniumframework.com/Practiceform/");
        System.out.println("Title start = "+driver.getTitle());

        String patrentWindowHandle= driver.getWindowHandle();
        System.out.println("Parent Window Handle ="+patrentWindowHandle);

//        WebElement newBrowserWindowButton = driver.findElement(By.id("button1"));
		WebElement newMessageWindowButton = driver.findElement(By.cssSelector("button[onclick='newMsgWin()']"));
        WebElement newBrowserTabButton = driver.findElement(By.cssSelector("button[onclick='newBrwTab()']"));

        //Case -1 :
//        newBrowserWindowButton.click();

        //Case -2 :
//        newMessageWindowButton.click();

        //case 3 -
        newBrowserTabButton.click();
        
        System.out.println("Title Before Switch ="+driver.getTitle());
        Thread.sleep(5000);

        Set<String> handlers = driver.getWindowHandles();
        Iterator<String> itr= handlers.iterator();

        while (itr.hasNext()){
            String childHandler= itr.next();
            System.out.println("Child Handler ="+childHandler);
            if(!childHandler.equalsIgnoreCase(patrentWindowHandle)){
                System.out.println("Switching to Child");
                driver.switchTo().window(childHandler);
                System.out.println("Child Window Title="+driver.getTitle());

                System.out.println("Switching to Parent");
                driver.switchTo().window(patrentWindowHandle);
                System.out.println("Parent window Title="+driver.getTitle());
            }else {
                System.out.println("Not Switching");
            }

        }

        driver.close();
        driver.quit();

    }
}

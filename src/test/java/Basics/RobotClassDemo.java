package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotClassDemo {
    public static void main(String[] args) throws AWTException, InterruptedException {
        String baseDir = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",baseDir + "\\src\\main\\resources\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();

        driver.get("https://www.facebook.com/");

        Robot robot=new Robot();

        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_T);
        robot.keyPress(KeyEvent.VK_E);
////        robot.keyRelease(KeyEvent.VK_2);
        robot.keyPress(46);
        robot.keyPress(50); //@
        robot.keyPress(98);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_S);
        robot.keyPress(KeyEvent.VK_T);
        robot.keyPress(KeyEvent.VK_PERIOD);
//        robot.keyPress(110);
//        robot.keyPress(KeyEvent.VK_I);
//        robot.keyPress(KeyEvent.VK_N);
//        Thread.sleep(5000);
////        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_TAB);
//        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_B);
        robot.keyPress(KeyEvent.VK_E);
        robot.keyPress(KeyEvent.VK_S);
//        robot.keyPress(KeyEvent.VK_T);
//        robot.keyRelease(KeyEvent.VK_CONTROL);
//        robot.keyPress(KeyEvent.VK_C);
//
//        Thread.sleep(5000);
//
//        robot.keyPress(KeyEvent.VK_ENTER);
//
        Thread.sleep(5000);

//        robot.keyPress(KeyEvent.VK_CONTROL);
    }
}

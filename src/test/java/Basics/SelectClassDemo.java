package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassDemo {
    public static void main(String[] args) throws InterruptedException {
        String baseDir = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",baseDir + "\\src\\main\\resources\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();

        driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");

//        Select contienent=new Select(driver.findElement(By.name("continents")));
//
//        System.out.println(contienent.getFirstSelectedOption().getText());
//        Thread.sleep(2000);
//
//        contienent.selectByIndex(1);
//        contienent.deselectByIndex(1); //You Can deselect only when it Multiselect
//        System.out.println(contienent.getFirstSelectedOption().getText());
//        Thread.sleep(5000);
//
//        contienent.selectByValue("Africa");
//        contienent.selectByVisibleText("Africa");
//        System.out.println(contienent.getFirstSelectedOption().getText());
//        Thread.sleep(2000);

        Select selectMultiple=new Select(driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[6]/div/form/table/tbody/tr[10]/td[2]/select")));
        System.out.println(selectMultiple.isMultiple());

//        System.out.println("Deafualt Selected ="+selectMultiple.getFirstSelectedOption().getText()); //Multiple Selection there is no Default selected
        selectMultiple.selectByIndex(0);
        selectMultiple.selectByVisibleText("Navigation Commands");
//        selectMultiple.selectByValue("Switch Commands");
        System.out.println("Number Of total Options Options ="+selectMultiple.getOptions().size());
        System.out.println("All Options are =");
        for(WebElement option:selectMultiple.getOptions()){
            System.out.println(option.getText());
        }
        System.out.println("Deafualt Selected ="+selectMultiple.getFirstSelectedOption().getText());
        System.out.println("All Selected Options = ");
        for (WebElement selOption:selectMultiple.getAllSelectedOptions()){
            System.out.println(selOption.getText());
        }
        driver.quit();
    }
}

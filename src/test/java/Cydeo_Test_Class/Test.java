package Cydeo_Test_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {
WebDriver driver ;
WebElement Element;
public void Setting(){
    driver= new ChromeDriver();
    //drive= new FirefoxDriver();
    driver.manage().window().maximize();

}
public void ApplyNow(){
    driver.get("https://www.Cydeo.com");
    Element=driver.findElement(By.linkText("Apply Now"));
    Element.click();

}
public void StudentRegister(){
    Element=driver.findElement(By.id("input_2_2"));
    Element.sendKeys("Sara");
    Element=driver.findElement(By.id("input_2_3"));
    Element.sendKeys("Jon");
    Element= driver.findElement(By.id("input_2_16"));
    Element.sendKeys("Arron");
    Element= driver.findElement(By.id("input_2_28"));
    Element.sendKeys("Sara");
    Element= driver.findElement(By.id("input_2_27"));
    Element.sendKeys("Jon");
    Element= driver.findElement(By.id("input_2_7_2"));
    Element.sendKeys("22");
    Element=driver.findElement(By.id("input_2_7_1"));
    Element.sendKeys("9");
    Element=driver.findElement(By.id("input_2_7_3"));
    Element.sendKeys("1990");
    Element= driver.findElement(By.id("input_2_18"));
    Element.sendKeys("Male");
    Element= driver.findElement(By.id("input_2_4"));
    Element.sendKeys("bkimesfin12@gmail.com");
    Element=driver.findElement(By.id("input_2_17"));
    Element.sendKeys("+1-773-807-6443");
    Element=driver.findElement(By.id("input_2_12_1"));
    Element.sendKeys("5533 N Winthrop");


}

    public static void main(String[] args) {
        Test m = new Test();
        m.Setting();
        m.ApplyNow();
        m.StudentRegister();


    }
}

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumBasics {

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "/home/anum/selenium/chromedriver_linux64/chromedriver");

       WebDriver driver= new ChromeDriver();

       driver.get("https://get.askidact.com/automated-testing-tool/?gclid=Cj0KCQjw7sDlBRC9ARIsAD-pDFoV-f4F3_j5vaxtFCg8QD9EP8J58ZTRLOXpy0G3XVZ4gOCY17BJRkQaAkFTEALw_wcB/");
       driver.manage().window().fullscreen();
       
       WebElement firstname = driver.findElement(By.xpath("//input[@id='firstname-2c5d7748-6e27-4980-902a-170d04892e4a']"));
       firstname.sendKeys("Anum");
       
       WebElement lastname = driver.findElement(By.id("lastname-2c5d7748-6e27-4980-902a-170d04892e4a"));
       lastname.sendKeys("Anand");
       
       WebElement businessEmail = driver.findElement(By.id("email-2c5d7748-6e27-4980-902a-170d04892e4a"));
       businessEmail.sendKeys("testpms@pickmysolar.com");
       
       WebElement startButton = driver.findElement(By.xpath("//*[@id=\"hsForm_2c5d7748-6e27-4980-902a-170d04892e4a\"]/div[4]/div[2]/input"));
       startButton.click();
       
       Thread.sleep(2000);      
       
       JavascriptExecutor jse = (JavascriptExecutor) driver;
       jse.executeScript("window.scrollBy(0,250)", "");
       
       if(driver.findElement(By.xpath("//input[@id='firstname-0605d8f5-77eb-492f-a07f-3f47bf736067']"))!= null || driver.findElement(By.xpath("//input[@id='lastname-0605d8f5-77eb-492f-a07f-3f47bf736067']"))!= null){

       WebElement first = driver.findElement(By.id("firstname-0605d8f5-77eb-492f-a07f-3f47bf736067"));
       first.sendKeys("Anum");
       
       WebElement last = driver.findElement(By.id("lastname-0605d8f5-77eb-492f-a07f-3f47bf736067"));
       last.sendKeys("Anand");
       
       WebElement email = driver.findElement(By.id("email-0605d8f5-77eb-492f-a07f-3f47bf736067"));
       email.sendKeys("testpms@pickmysolar.com");
    	   
       }
       
       else {
//       WebElement email = driver.findElement(By.id("email-0605d8f5-77eb-492f-a07f-3f47bf736067"));
//       email.sendKeys("testpms@pickmysolar.com");
       
       WebElement phone = driver.findElement(By.id("phone-0605d8f5-77eb-492f-a07f-3f47bf736067"));
       phone.sendKeys("1236547890");
       }
       
//       WebElement phone = driver.findElement(By.id("phone-0605d8f5-77eb-492f-a07f-3f47bf736067"));
//       phone.sendKeys("1236547890");
       
       WebElement copyButton = driver.findElement(By.xpath("//*[@id=\"hsForm_0605d8f5-77eb-492f-a07f-3f47bf736067\"]/div[4]/div[2]/input"));
       copyButton.click();
       
       Thread.sleep(5000);
       

    }

}
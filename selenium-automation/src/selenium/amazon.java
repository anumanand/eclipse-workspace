package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


//import com.sun.org.apache.bcel.internal.generic.Select;

//import javax.swing.text.html.HTMLDocument.Iterator;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;
//import java.util.Iterator;

//import com.sun.tools.javac.util.List;


public class amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/anum/selenium/chromedriver_linux64/chromedriver");
		
	       WebDriver driver= new ChromeDriver();

	       driver.get("https://www.amazon.in/");
	       driver.manage().window().fullscreen();
	       
	       WebElement dropDown = driver.findElement(By.id("searchDropdownBox"));
	       
	       Select dropDownOption = new Select(dropDown);
//	       List<WebElement> allOptions = dropDownOption.getOptions();

	       dropDownOption.selectByValue("search-alias=apparel");
//	       dropdown.selectByIndex(1);
	       
	       WebElement searchOption = driver.findElement(By.id("twotabsearchtextbox"));
	       searchOption.sendKeys("women dresses");
	       
	       WebElement searchButton = driver.findElement(By.xpath("//input[@value='Go']"));
	       searchButton.click();
//	       
//	       JavascriptExecutor jse = (JavascriptExecutor) driver;
//	       jse.executeScript("window.scrollBy(0,500)", "");
//	       
//	       Thread.sleep(10000);      
	       
//	       if(driver.findElement(By.xpath("//*[@id=\"contentGrid_328522\"]/div/div[2]/div[1]/div/div/a/img")) != null) {
//		       WebElement imageButton = driver.findElement(By.xpath("//*[@id=\"contentGrid_328522\"]/div/div[2]/div[1]/div/div/a/img"));
//		       imageButton.click();
//	       }
//	       else if(driver.findElement(By.xpath("//*[@id=\"contentGrid_328522\"]/div/div[2]/div[2]/div/div/a/img")) != null){
//	    	   WebElement imageButton = driver.findElement(By.xpath("//*[@id=\"contentGrid_328522\"]/div/div[2]/div[2]/div/div/a/img"));
//		       imageButton.click();
//	       }
//	       else if(driver.findElement(By.xpath("//*[@id=\"contentGrid_328522\"]/div/div[2]/div[3]/div/div/a/img")) != null){
//	    	   WebElement imageButton = driver.findElement(By.xpath("//*[@id=\"contentGrid_328522\"]/div/div[2]/div[3]/div/div/a/img"));
//		       imageButton.click();
//	       }
//	       else{
//	    	   WebElement imageButton = driver.findElement(By.xpath("//*[@id=\"contentGrid_328522\"]/div/div[2]/div[4]/div/div/a/img"));
//		       imageButton.click();
//	       }
	       
	       //mouse hover
	       
	      WebElement womenButton = driver.findElement(By.xpath("//*[@id=\"nav-subnav\"]/a[2]/span[1]"));  
	     
	      Actions action = new Actions(driver);
		  action.moveToElement(womenButton).perform();
		  Thread.sleep(2000);
	      //new arrival option is selected
	      driver.findElement(By.xpath("//*[@id=\"nav-flyout-aj:https://images-eu.ssl-images-amazon.com/images/G/31/img16/wayfinding/json/subnavmay18.json:subnav-sl-megamenu-1:0\"]/div[2]/div/div[1]/ul/li[1]/a")).click();
	      Thread.sleep(2000);
	      
	      //dress is selected
	      WebElement itemSelected = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[1]/div[1]/div/div/div/div[2]/div[1]/div/div/span/a/div/img"));
	      itemSelected.click();
	     
//	      WebElement selectSize = driver.findElement(By.xpath("//*[@id=\"native_dropdown_selected_size_name\"]"));
//	      selectSize.click();
	      Thread.sleep(2000);
	     
	      Set<String> windows = driver.getWindowHandles();

	       System.out.println(windows);

	       Iterator<String> it= windows.iterator();

		    String parent= it.next();
	
		    String child1= it.next();
	
		    driver.switchTo().window(child1);
	      
	      WebElement selectSizeDropdown = driver.findElement(By.xpath("//*[@id=\"native_dropdown_selected_size_name\"]"));
	       
	       Select selectSizedropDownOption = new Select(selectSizeDropdown);
	       selectSizedropDownOption.selectByValue("5,B07LDKWFMH");
	      
	       Thread.sleep(2000);
	       
	       WebElement addCart = driver.findElement(By.id("add-to-cart-button"));
	       addCart.click();
	       
	       
	       
	}

	
}

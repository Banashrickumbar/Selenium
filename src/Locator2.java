import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locator2 {

	public static void main(String[] args) throws InterruptedException {
		// WebDriver driver=new ChromeDriver();
String name="BanashriCK";
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String Password=getPassword(driver);
        System.out.println("Login succesfull");
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        
        //driver.manage().timeouts().pageLoadTimeout(null)
        
        
        
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys(name);
		driver.findElement(By.cssSelector("input[type*='password']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		Thread.sleep(1000);
	System.out.println(driver.findElement(By.tagName("p")).getText());	
	Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
	
	//to check the name is displayed correct or not
	System.out.println(driver.findElement(By.tagName("h2")).getText());
	Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(),"Hello "+name+",");
	
	driver.findElement(By.xpath("//button[text()='Log Out']")).click();
	driver.close();
	}
public static String getPassword( WebDriver driver) throws InterruptedException {
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.findElement(By.linkText("Forgot your password?")).click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
    String msg=driver.findElement(By.className("infoMsg")).getText();
   String[] array= msg.split("'");
   //index 0='
   //index passowrd is in 1st index
   
   String[] array2=array[1].split("'");
   //index 0=password
   //index 1='
   String password=array2[0];
  return password;
    
}
}

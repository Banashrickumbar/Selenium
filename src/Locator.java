import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class Locator implements WebDriver{

	public static void main(String[] args) throws InterruptedException {

WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://rahulshettyacademy.com/locatorspractice/");


driver.findElement(By.id("inputUsername")).sendKeys("Banashri");
driver.findElement(By.name("inputPassword")).sendKeys("Banashrik");
driver.findElement(By.className("signInBtn")).click();
System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
driver.findElement(By.linkText("Forgot your password?")).click();

Thread.sleep(1000);
driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("BanashriCK");
driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("banashri2k@gmail.com");
driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
driver.findElement(By.cssSelector("input[placeholder='Email']:nth-child(3)")).sendKeys("rahulshettyacademy");
//driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("Hiii");
driver.findElement(By.xpath("//form/input[3]")).sendKeys("9869559875");
driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
System.out.println(driver.findElement(By.className("infoMsg")).getText());
driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
System.out.println("----------");
Thread.sleep(1000);

//driver.findElement(By.xpath("//button[contains(@class,'go-to-login-btn')")).click();
driver.findElement(By.cssSelector("#inputUsername")).sendKeys("BanashriCK");
driver.findElement(By.cssSelector("input[type*='password']")).sendKeys("rahulshettyacademy");
driver.findElement(By.id("chkboxOne")).click();
driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
System.out.println("Yes");


}

}

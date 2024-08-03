package SeleniumKodnest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframe {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("name")).sendKeys("Banashri");
		driver.switchTo().frame(driver.findElement(By.id("frm1")));
		WebElement dropdown = driver.findElement(By.id("course"));
		//dropdown.click();
		Select select =new Select(dropdown);
		select.selectByVisibleText("Java");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).sendKeys("I will get job");
		driver.close();

	}

}

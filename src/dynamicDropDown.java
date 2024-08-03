import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class dynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	driver.manage().window().maximize();
		Thread.sleep(1000);
		//check whether the return date is enabled in the calender
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
//		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
//		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
//		//System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
//		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
//		if((driver.findElement(By.id("Div1")).getAttribute("style")).contains("1"))
//		{
//			System.out.println("Enabled");
//			Assert.assertTrue(true);
//		}
//		else
//		{
//			Assert.assertTrue(false);
//		}
//		
		//check whether is calender is displayed after providing the from and return date
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[contains(@text,'Bengaluru (BLR)')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.partialLinkText("Amritsar ")).click();

		
		//Thread.sleep(2000);
		 //checking the checkbox is clicking 
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		System.out.println("calender is selected");
//		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
//		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
//		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
//	System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
//	
//	Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
//	
//	System.out.println(driver.findElements(By.cssSelector("input[text='checkbox']")).size());
//		
//		By.cssSelector("input[text='checkbox']");
//		
//		driver.findElement(By.id("divpaxinfo")).click();
//		Thread.sleep(1000);
//		
		//for adding the number of members 
//				for(int i=1;i<4;i++) {
//		driver.findElement(By.id("hrefIncAdt")).click();
//		 }
//				driver.findElement(By.id("btnclosepaxoption")).click();
//				System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
//	
//		
		//handling the dynamic list box 
//		driver.findElement(By.id("autosuggest")).sendKeys("ind");
//		Thread.sleep(3000);
//		List<WebElement> option=driver.findElements(By.cssSelector("li[class='ui-menu-item']"));
//		
//		for(WebElement options: option) {
//			if(options.getText().equalsIgnoreCase("India")) {
//				options.click();
//				break;
//			}
//	}
//		System.out.println("Success");
		driver.close();
	}

}

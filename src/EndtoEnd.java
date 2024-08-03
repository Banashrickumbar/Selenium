//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//
//public class EndtoEnd {
//
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		//driver.manage().window().maximize();
//
//
////		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
////		driver.findElement(By.xpath("//a[contains(@text,'Bengaluru (BLR)')]")).click();
////		Thread.sleep(1000);
////		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
////		System.out.println("mmmmmmmmmm");
////
////		//        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
////		//        System.out.println("nnnnnnnnnn");
////		//driver.findElement(By.id("divpaxinfo")).click();
////		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div[contains(@class,'paxinfo')]")).click();
//
//		driver.findElement(By.id("hrefIncAdt"));
//		for(int i=0;i<=2;i++) {
//			driver.findElement(By.id("hrefIncAdt")).click();
//
//		}
//		WebElement element=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//		Select dropdown=new Select(element);
//		dropdown.selectByIndex(2);
//		System.out.println(dropdown.getFirstSelectedOption().getText());
//		//System.out.println(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).getText().indexOf(2));
//		
//		
//
//
//		driver.findElement(By.id("ctl00_mainContent_view_date2")).getAttribute("style");
//		System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
//
//		//driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
//
//
//		driver.findElement(By.id("ctl00_mainContent_view_date2")).getAttribute("style");
//
//
//	}
//
//}

//package test;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EndtoEnd {

	public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

//WebDriver driver=new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
//Is displayed is used when particular object is in code base but it is in visible mode or not

		driver.get("http://www.makemytrip.com/");

		System.out.println(" Before clikcing on Multi city Radio button");

		System.out.println(driver.findElement(By.xpath(".//*[@id='return_date_sec']")).isDisplayed());

//driver.findElement(By.xpath(".//*[@id='multi_city_button']/span")).click();

//driver.findElement(By.xpath(".//*[@id='multi_city_button']/span")).isEnabled();

		System.out.println(" After clikcing on Multi city Radio button");

		driver.findElement(By.xpath(".//*[@id='start_date_sec']/span[3]")).click();

		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[5]/td[3]/a")).click();

		int i = 0;

		while (i < 5)

		{

			driver.findElement(By.xpath(".//*[@id='adult_count']/a[2]")).click();

			i++;

		}

//System.out.println(driver.findElement(By.xpath(".//*[@id='return_date_sec']")).isDisplayed());

//System.out.println(driver.findElement(By.xpath(".//*[@id='mui_city_button']/span")).isDisplayed());

		Thread.sleep(3000L);

//System.out.println(driver.findElement(By.xpath(".//*[@id='responsive_bottom']/div[2]/div[1]/div/div/h3")).getText());

//If you want to validate the object which is present in web page or code base

		int count = driver.findElements(By.xpath(".//*[@id='mui_city_button']/span")).size();

		if (count == 0)

		{

			System.out.println("verified");

		}

//

	}

}

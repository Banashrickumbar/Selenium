import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Locator3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
	
		//Select dropdown=new Select(element);
		//dropdown.selectByIndex(1);
		//System.out.println(dropdown.getFirstSelectedOption().getText());
		//dropdown.selectByValue("AED");
		//System.out.println(dropdown.getFirstSelectedOption().getText());
		//dropdown.selectByVisibleText("USD");
		//System.out.println(dropdown.getFirstSelectedOption().getText());
		
		//System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
		
				for(int i=1;i<4;i++) {
		driver.findElement(By.id("hrefIncAdt")).click();
		 }
				driver.findElement(By.id("btnclosepaxoption")).click();
				System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}

}

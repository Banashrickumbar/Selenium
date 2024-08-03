package SeleniumKodnest;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import wait.until;

public class windowHandlesAndWaits {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://iamsandesh23.github.io/selenium.github.io/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));

//		System.out.println("Hi");
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
  WebElement link = wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Open a popup wi")));
	link.click();
	
System.out.println("Hi");
	
  //driver.findElement(By.partialLinkText("Open a popup wi")).click();
  
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();
//to find how many windows are there
//		while(itr.hasNext()) {
//			String itrid = itr.next();
//			System.out.println(itrid);
//		}
//to store each windows in the object and switch to particular window of your choice
//		String parentWindow = itr.next();
//		String childWindow = itr.next();
//		driver.switchTo().window(childWindow);
//		String text = driver.findElement(By.xpath("//body/h2")).getText();
//		System.out.println(text);
//		driver.quit();
	}

}

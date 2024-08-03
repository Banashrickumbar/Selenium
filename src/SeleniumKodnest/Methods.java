package SeleniumKodnest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Methods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://iamsandesh23.github.io/selenium.github.io/");
		//		System.out.println(driver.getCurrentUrl());
		//		String title = driver.getTitle();
		//		System.out.println(title);
//		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().window().fullscreen();
		//		WebElement element = driver.findElement(By.name("q"));
		//		element.sendKeys("Banashri");
		//		driver.findElement(By.className("gsc-search-button")).click();
		//		Thread.sleep(4000);

		//		WebElement element1 = driver.findElement(By.linkText("onlytestingblog"));
		//		element1.click();
		//Thread.sleep(3000);
		//	 driver.findElement(By.id("textbox1")).click();
		//	
		//		Thread.sleep(3000);
		//		String text = driver.findElement(By.id("pah")).getText();
		//		System.out.println(text);
		//driver.quit();
//		String getattribute = driver.findElement(By.xpath("//*[@id=\"HTML29\"]/div[1]/img")).getAttribute("width");
//		System.out.println(getattribute);
//		boolean displayed = driver.findElement(By.id("but2")).isDisplayed();
//	System.out.println(displayed);
//	boolean enabled = driver.findElement(By.id("but1")).isEnabled();
//	System.out.println(enabled);
//		boolean selected = driver.findElement(By.id("radio1")).isSelected();
//		System.out.println(selected);
//		driver.findElement(By.partialLinkText("testwise")).click();
//		Thread.sleep(4000);
//		driver.navigate().back();
//		Thread.sleep(4000);
//		driver.navigate().forward();
//		Thread.sleep(3000);
	
	}

}

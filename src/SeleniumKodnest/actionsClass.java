package SeleniumKodnest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/p/page3.html");
		//driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		//driver.get("https://iamsandesh23.github.io/selenium.github.io/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//////////////MOUSE ACTIONS///////////////////////		
// to move the mouse course 	
		
//		WebElement blogs = driver.findElement(By.xpath("//li[@class='has-sub']"));
//		Actions action=new Actions(driver);
//		action.moveToElement(blogs).perform();
//		
//		WebElement sele143 = driver.findElement(By.xpath("//span[text()='Selenium143']"));
//		action.moveToElement(sele143).click().perform();

		//DragAndDropBy
		WebElement drag = driver.findElement(By.xpath("//*[@aria-labelledby='price-min-label']"));
		System.out.println("Hii");
		Actions action=new Actions(driver);
		action.dragAndDropBy(drag, 100, 0).perform();
		
// Right click 
//		WebElement rightclick = driver.findElement(By.xpath("//img[@src='pic.png']"));
//		Actions action=new Actions(driver);
//		action.contextClick(rightclick).perform();

//DoubleClick
//WebElement doubleclick = driver.findElement(By.name("q"));
//doubleclick.sendKeys("Banashri");
//Actions action=new Actions(driver);
//action.doubleClick(doubleclick).perform();

//DragAndDrop
//		WebElement sourceEleLocation= driver.findElement(By.id("box7"));
//		WebElement destinationEleLocation = driver.findElement(By.id("box106"));
//		Actions action=new Actions(driver);
//		action.dragAndDrop(sourceEleLocation, destinationEleLocation).perform();
		
		
///////////////Keyboard Actions/////////////
//		WebElement link = driver.findElement(By.linkText("onlytestingblog"));
//		Actions action=new Actions(driver);
//		action.keyDown(link,Keys.CONTROL).click().keyUp(link,Keys.CONTROL).perform();
	}

}

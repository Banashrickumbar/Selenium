import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class First implements WebDriver{

	public static void main(String[] args) {

WebDriver driver=new ChromeDriver();
//launch browser
driver.get("https://www.amazon.in/");

//get the title
System.out.println(driver.getTitle());

//get the current url
System.out.println(driver.getCurrentUrl());

//close the url
driver.close();
	}

}

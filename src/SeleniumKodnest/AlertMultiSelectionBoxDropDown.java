package SeleniumKodnest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlertMultiSelectionBoxDropDown {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.get("https://iamsandesh23.github.io/selenium.github.io/");
// Alert
//    driver.findElement(By.id("confirm")).click();
//    Alert alert = driver.switchTo().alert();
//    String text = alert.getText();
//    System.out.println(text);
//    //alert.accept();
//    alert.dismiss();
//    driver.close();
    
 //dropdownbox
    WebElement Dropdown = driver.findElement(By.id("drop1"));
    Dropdown.click();
    Select select=new Select(Dropdown);
    select.selectByIndex(3);
    
  // multi selectionBox
//    WebElement multiSelectionBox = driver.findElement(By.id("multiselect1"));
//   
//    Select select=new Select(multiSelectionBox);
//    select.selectByValue("volvox");
//    select.selectByIndex(1);
//    select.selectByVisibleText("Audi");
//    select.deselectByIndex(1);
//    
//    
//   driver.close();
    
	}
}

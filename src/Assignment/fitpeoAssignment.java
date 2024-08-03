package Assignment;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fitpeoAssignment {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		try {
			// Step 1: Navigate to the FitPeo Homepage
			driver.get("http://www.fitpeo.com");
			driver.manage().window().maximize();

			// Step 2: Navigate to the Revenue Calculator Page
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement revenueCalculatorLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Revenue Calculator")));
			revenueCalculatorLink.click();

			// Step 3: Scroll Down to the Slider section
			WebElement sliderSection = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(@class, 'MuiSlider-thumb') and contains(@class, 'MuiSlider-thumbColorPrimary')]")));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", sliderSection);

			// step 4: Ensure the element is fully visible
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -window.innerHeight / 2);");

			//step 5: Use Actions to move the sliderSection
			Actions action = new Actions(driver);
			action.clickAndHold(sliderSection).moveByOffset(94, 0).release().perform();

			//step 6:Use action class to move slider according to value	
			WebElement textbox = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='number']")));
			Actions action1 = new Actions(driver);
			action1.moveToElement(textbox).perform();
			textbox.clear();
			textbox.sendKeys("560");

			//clicking on check box
			Thread.sleep(100);
			driver.findElement(By.xpath("//div[@class='MuiBox-root css-rfiegf']//div[1]//label[1]//span[1]//input[1]")).click();
			driver.findElement(By.xpath("//div[@class='MuiBox-root css-1p19z09']//div[2]//label[1]//span[1]//input[1]")).click();
			driver.findElement(By.xpath("//div[3]//label[1]//span[1]//input[1]")).click();
			driver.findElement(By.xpath("//div[8]//label[1]//span[1]//input[1]")).click();

			//verifying the header details
			WebElement totalReimbursement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 inter css-1xroguk'][contains(text(),'Total Recurring Reimbursement for all Patients Per')]")));
			if (totalReimbursement.isDisplayed()) {
				System.out.println("Total Recurring Reimbursement validation passed");
			} else {
				System.out.println("Total Recurring Reimbursement validation failed");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			driver.close();
		}
	}
}




package Assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Assess {
    public static void main(String[] args) {
        // Set up WebDriver
        WebDriver driver=new ChromeDriver();
       
                try {
                    // Step 1: Navigate to the FitPeo Homepage
                    driver.get("http://www.fitpeo.com");
                    driver.manage().window().maximize();
                    System.out.println("HI");
                    
                    // Step 2: Navigate to the Revenue Calculator Page
                    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                    WebElement revenueCalculatorLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Revenue Calculator")));
                    revenueCalculatorLink.click();
                    System.out.println("H2");
                    
                    // Step 3: Scroll Down to the Slider section
                    WebElement sliderSection = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".MuiSlider-root.MuiSlider-colorPrimary.MuiSlider-sizeMedium.css-duk49p"))); 
                    System.out.println("H3");
                    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", sliderSection);
                    System.out.println("H4");
                    
                    // Step 4: Adjust the Slider to 820
                    
//                    WebElement des = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='MuiSlider-thumb MuiSlider-thumbSizeMedium MuiSlider-thumbColorPrimary MuiSlider-thumb MuiSlider-thumbSizeMedium MuiSlider-thumbColorPrimary css-sy3s50']")));
//                    System.out.println("H5");
//                    
//                    // Replace with actual XPath
//                    Actions moveSlider = new Actions(driver);
//                    System.out.println("H6");
//                   // Actions action=new Actions(driver);
//            		moveSlider.dragAndDropBy(des,820, 0).perform();
                    WebElement slider = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='range']"))); // Locate the slider input
                    Actions moveSlider = new Actions(driver);
                    moveSlider.clickAndHold(slider).moveByOffset(90, 0).release().perform(); // Adjust the offset based on your slider's range
                    Thread.sleep(1000);
            		System.out.println("H7");
                    //moveSlider.dragAndDropBy(slider, 0, 0)
                    //moveSlider.clickAndHold(slider).moveByOffset(820, 0).release().perform();
                    
                    
                    Thread.sleep(1000); // Wait for the text field to update
                    System.out.println("H8");
                    WebElement textField = driver.findElement(By.xpath("//input[@type='number']")); // Replace with actual XPath
                    System.out.println("H9");
                    assert textField.getAttribute("value").equals("820");
                    System.out.println("H10");
                    // Step 5: Update the Text Field to 560
                    textField.clear();
                    textField.sendKeys("560");
                    textField.sendKeys(Keys.RETURN);
                    Thread.sleep(1000);
                   System.out.println("H11");
                    // Wait for the slider to update
                    //assert slider.getAttribute("value").equals("560");
                    
                    // Step 6: Validate that the Slider reflects the value 560
                    //String sliderValue = slider.getAttribute("value");
                   // assert sliderValue.equals("560") : "Expected slider value to be 560, but got " + sliderValue;
                    
                    // Step 7: Select CPT Codes
//                    String[] cptCodes = {"CPT-99091", "CPT-99453", "CPT-99454", "CPT-99474"};
//                    for (String cptCode : cptCodes) {
//                        WebElement checkbox = driver.findElement(By.xpath("//input[@value='" + cptCode + "']")); // Replace with actual XPath
//                        if (!checkbox.isSelected()) {
//                            checkbox.click();
//                        }
//                    }
//                   Thread.sleep(100);
//                   driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/label[1]/span[1]/input[1]")).click();
//                   driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/label[1]/span[1]/input[1]")).click();
//                   driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/label[1]/span[1]/input[1]")).click();
//                   driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[8]/label[1]/span[1]/input[1]")).click();
//                    System.out.println("H12");
//                    
                   try {
                	    // Pause briefly to allow the page to load fully
                	    Thread.sleep(100);

                	    // Selecting CPT codes based on provided XPath expressions
                	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/label[1]/span[1]/input[1]")).click(); // CPT-99091
                	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/label[1]/span[1]/input[1]")).click(); // CPT-99453
                	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/label[1]/span[1]/input[1]")).click(); // CPT-99454
                	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[8]/label[1]/span[1]/input[1]")).click(); // CPT-99474
                	    
                	    System.out.println("CPT codes selected successfully!");
                	} catch (Exception e) {
                	    e.printStackTrace();
                	    System.out.println("Ht");
                	}
                    // Step 8: Validate Total Recurring Reimbursement
                    WebElement totalReimbursement = driver.findElement(By.id("total-reimbursement-id")); // Replace with actual ID
                    assert totalReimbursement.getText().equals("$110700") : "Expected total reimbursement to be $110700, but got " + totalReimbursement.getText();
                    
                    System.out.println("All test cases passed successfully!");
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    // Close the browser
                	 System.out.println("H13");
                }
            }
        }



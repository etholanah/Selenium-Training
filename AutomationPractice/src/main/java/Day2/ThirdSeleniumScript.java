package Day2;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ThirdSeleniumScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","Resources" + File.separator + "chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		//Get URL
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		String url = "http://automationpractice.com/index.php";
		driver.get(url);
		
		//Maximize browser
				driver.manage().window().maximize();
				
				//login
				driver.findElement(By.xpath("//a[@class='login']")).click();

				driver.findElement(By.xpath("//input[@id='email']")).sendKeys("etholanah@iqbusiness.net");
				driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("12345");
				driver.findElement(By.xpath("//p[@class='submit']//span[1]")).click();
				
				//Verify logged in name is correct
				String displayedName = driver.findElement(By.xpath("//span[contains(text(),'Mary Jane')]")).getText();
				System.out.println(displayedName);
				
				String expectedName = "Mary Jane";
				
				//check why this is failing
				if (displayedName == expectedName)
					System.out.println("Logged in user is correct");
				else
					System.out.println("Incorrect user logged in");
				
				//Click on Dresses
				driver.findElement(By.xpath("//body[@id='my-account']/div[@id='page']/div/header[@id='header']/div/div/div/div[@id='block_top_menu']/ul/li[2]/a[1]")).click();
				driver.findElement(By.xpath("//div[@id='categories_block_left']//div//a[contains(text(),'Casual Dresses')]")).click();
				
				Actions action = new Actions(driver);
				WebElement element = driver.findElement(By.xpath("//div[@id='center_column']//ul//li//div//div//a[contains(text(),'Printed Dress')]"));
				action.moveToElement(element).build().perform();
				
		         
		        //Thread.sleep just for user to notice the event
		        Thread.sleep(4000);
		       
		        WebElement select = driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]"));
		        action.moveToElement(select).click().build().perform();
		        
		        Thread.sleep(4000);
		        
		        /*WebElement alert =   driver.findElement(By.id("layer_cart"));
		        driver.switchTo().frame(alert);
		        
		        driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]")).click();*/
		        
		      
		        driver.findElement(By.xpath("//span[normalize-space(text())='Proceed to checkout']")).click();
		        
		        //driver.findElement(By.)
		        
		        driver.findElement(By.cssSelector("body.order.hide-left-column.hide-right-column.lang_en:nth-child(2) div.columns-container div.container div.row:nth-child(3) div.center_column.col-xs-12.col-sm-12 p.cart_navigation.clearfix:nth-child(8) a.button.btn.btn-default.standard-checkout.button-medium > span:nth-child(1)")).click();;
		        
		        //address
		        driver.findElement(By.xpath("//button[@name='processAddress']//span[contains(text(),'Proceed to checkout')]")).click();
		    
		        //shipping: continue without accepting terms and conditions
		        driver.findElement(By.cssSelector("body.order.hide-left-column.hide-right-column.lang_en:nth-child(2) div.columns-container div.container div.row:nth-child(3) div.center_column.col-xs-12.col-sm-12 div:nth-child(1) form:nth-child(3) p.cart_navigation.clearfix button.button.btn.btn-default.standard-checkout.button-medium:nth-child(4) > span:nth-child(1)")).click();
		        
		        Thread.sleep(4000);
		        
		        driver.switchTo().frame("Fancybox-frame").close();
		        
		  
	}

}

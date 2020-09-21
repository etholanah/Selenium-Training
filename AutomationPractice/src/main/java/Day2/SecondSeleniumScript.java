package Day2;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;





public class SecondSeleniumScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","Resources" + File.separator + "chromedriver.exe");
		
		driver = new ChromeDriver();
		
	//Get URL
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
		
	//Click on Casual Dresses
		driver.findElement(By.xpath("//body[@id='my-account']/div[@id='page']/div[@class='header-container']/header[@id='header']/div/div[@class='container']/div[@class='row']/div[@id='block_top_menu']/ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[2]/a[1]")).click();
		driver.findElement(By.xpath("//div[@class='block_content']//ul[@class='tree dynamized']//a[contains(text(),'Casual Dresses')]")).click();
		
	//Select dress
		/*WebElement element = driver.findElement(By.xpath("//div[@class='block_content']//ul[@class='tree dynamized']//a[contains(text(),'Casual Dresses')]"));
		//Hover over and click
		Actions action = new Actions(driver);
		action.moveToElement(element);*/
		
		driver.findElement(By.xpath("//div[@id='center_column']//ul//li//div//div//div//a//img")).click();
		
		Thread.sleep(4000);
		//switch to iFrame
		
		WebElement frame =   driver.findElement(By.className("fancybox-iframe"));
		driver.switchTo().frame(frame);
	
		Thread.sleep(4000);
		
		//Click on add to cart
		driver.findElement(By.name("Submit")).click();
		//driver.findElement(By.className("btn btn-default btn-twitter")).click();
		driver.switchTo().defaultContent();
		
		//driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout")).click();
		
		
		
		
	
	}

}

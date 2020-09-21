package TestParictice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FistSeleniumScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\etholanah\\eclipse-workspace\\OnlineStore\\AutomationPractice\\Resources\\chromedriver.exe");
		
		//create a new instance of the Chrome driver
		driver = new ChromeDriver();
		
		String URL = "http://automationpractice.com";
		driver.get(URL);
		
		driver.manage().window().maximize();
		
		String browserTitle = driver.getTitle();
		
		System.out.println(browserTitle);
		
		String 	URL2 = driver.getCurrentUrl();
		System.out.println(URL2);
		
		if (URL2 == URL)
			System.out.println("pass");
		else
			System.out.println("fail");
	}

}

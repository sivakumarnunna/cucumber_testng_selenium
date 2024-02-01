package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BasePage {
	
	private WebDriver driver;
	
	public BasePage() {
		driver = new ChromeDriver();
	}

}

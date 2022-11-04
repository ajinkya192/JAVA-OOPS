package inheritance;

import org.openqa.selenium.chrome.ChromeDriver;

public class SingleParent {
	
	public void Login(){
		System.setProperty("webdriver.chrome.driver", "D:\\chaitu\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		
		
	}

	

}

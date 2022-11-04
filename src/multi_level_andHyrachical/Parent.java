package multi_level_andHyrachical;

import org.openqa.selenium.chrome.ChromeDriver;

public class Parent {
	
	public void URL() {
		System.setProperty("webdriver.chrome.driver", "D:\\chaitu\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
	}

}

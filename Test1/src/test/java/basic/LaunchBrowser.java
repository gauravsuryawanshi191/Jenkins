package basic;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
  @Test
  public void launchChrome() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.google.com/");
	  
	  driver.manage().window().maximize();
	  
	  System.out.println(driver.getTitle());
	  System.out.println(driver.getCurrentUrl());
	  
//	  driver.close();
	  
  }
}

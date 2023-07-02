package org.home.category.Risva_Rachna;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Configuration {

	WebDriver driver;

	@SuppressWarnings("deprecation")
	@BeforeClass
	public void startDriver() {
		try {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}catch(Exception e ) {
			System.out.print(e);
		}
	}

//	@AfterClass
//	public void closeDriver() {
//		driver.close();
//	}
}


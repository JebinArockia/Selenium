package org.debug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("ajitha");

		WebElement userPass = driver.findElement(By.id("pass"));
		userPass.sendKeys("jebin");
		WebElement logIn = driver.findElement(By.name("login"));
		logIn.click();
		Thread.sleep(5000);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
	}

}

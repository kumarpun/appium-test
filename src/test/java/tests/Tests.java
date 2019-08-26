package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Tests extends BaseClass {
	
	@Test	
	public void testOne(){
		driver.get("https://google.com");
		driver .findElement(By.name("q")).sendKeys("Automation");
		driver .findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		System.out.println("Completed test one..");

		
	}
	
	@Test	
	public void testTwo(){
		driver.get("https://google.com");
		driver .findElement(By.name("q")).sendKeys("kumar");
		driver .findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		System.out.println("Completed test two..");

		
	}
	
	@Test
	public void loginTest() throws InterruptedException {
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).clear();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).click();
		driver.findElement(By.id("txtPassword")).clear();
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("txtPassword")).sendKeys(Keys.ENTER);
        Thread.sleep(5000);

	}

}

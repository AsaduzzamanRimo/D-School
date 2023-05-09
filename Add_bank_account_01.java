package testcasepackage;



import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

import org.testng.annotations.Test;



import driverpackage.baseDriver;



public class Add_bank_account_01 extends baseDriver {
	String baseUrl = "https://test-schoolerp.celloscope.net/login";
	@Test

	public void locatorlearning() throws InterruptedException {
		
		driver.findElement(By.xpath("//span[contains(text(),'Bank Account')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Add Bank Account')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//body/app-root[1]/app-app-school[1]/div[1]/main[1]/div[1]/div[1]/div[1]/app-app-school-bank-account[1]/app-school-bank-account-add[1]/section[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys("নাদিয়া সুলতানা");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//body/app-root[1]/app-app-school[1]/div[1]/main[1]/div[1]/div[1]/div[1]/app-app-school-bank-account[1]/app-school-bank-account-add[1]/section[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[2]/input[1]")).sendKeys("Nadia sultana");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='accountType']")).sendKeys("DPS");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='accountNumber']")).sendKeys("5678904321");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/app-root[1]/app-app-school[1]/div[1]/main[1]/div[1]/div[1]/div[1]/app-app-school-bank-account[1]/app-school-bank-account-add[1]/section[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ng-select[1]/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Agrani Bank Limited')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='branchName']")).sendKeys("Motijil branch");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='mobileNo']")).sendKeys("01887949170");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sabina.yeasmin@doer.com.bd");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='automation-421']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//body/app-root[1]/app-app-school[1]/div[1]/main[1]/app-navbar[1]/nav[1]/div[1]/div[1]/div[1]/div[2]/a[1]/p[1]")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[@id='automation-18']")).click();
		//Thread.sleep(2000);
		
		
	}
}

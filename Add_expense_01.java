package testcasepackage;



import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

import org.testng.annotations.Test;



import driverpackage.baseDriver;



public class Add_expense_01 extends baseDriver {

String baseUrl = "https://test-schoolerp.celloscope.net/login";

@Test

public void locatorlearning() throws InterruptedException {
	
	driver.findElement(By.xpath("//span[contains(text(),'Expense')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[contains(text(),'Add Expense')]")).click();
	Thread.sleep(7000);
	driver.findElement(By.xpath("//input[@id='expenseDateId']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//tbody/tr[5]/td[5]/span[1]")).click();
	Thread.sleep(2000);	
	driver.findElement(By.xpath("//body/app-root[1]/app-app-school[1]/div[1]/main[1]/div[1]/div[1]/div[1]/app-app-school-expense[1]/app-school-expense-add[1]/section[1]/section[1]/div[1]/div[2]/div[1]/div[3]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[contains(text(),'Md. Rakibul Islam')]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//body/app-root[1]/app-app-school[1]/div[1]/main[1]/div[1]/div[1]/div[1]/app-app-school-expense[1]/app-school-expense-add[1]/section[1]/section[1]/div[1]/div[2]/div[1]/div[4]/ng-select[1]/div[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[contains(text(),'Cash in Bank')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//body/app-root[1]/app-app-school[1]/div[1]/main[1]/div[1]/div[1]/div[1]/app-app-school-expense[1]/app-school-expense-add[1]/section[1]/section[1]/div[1]/div[2]/div[1]/div[5]/input[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//textarea[@id='automation-500']")).sendKeys("cash done");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//option[contains(text(),'Select Reference Type')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//tbody/tr[1]/td[2]/select[1]/option[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//option[contains(text(),'Select Teacher Name')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//option[contains(text(),'Abul Mansur Ahmed')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//body/app-root[1]/app-app-school[1]/div[1]/main[1]/div[1]/div[1]/div[1]/app-app-school-expense[1]/app-school-expense-add[1]/section[1]/section[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/button[1]/i[1]")).click();
	Thread.sleep(2000);	
	driver.findElement(By.xpath("//body[1]/app-root[1]/app-app-school[1]/div[1]/main[1]/div[1]/div[1]/div[1]/app-app-school-expense[1]/app-school-expense-add[1]/section[1]/section[1]/div[1]/div[2]/div[2]/div[2]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")).click();
	Thread.sleep(2000);		
	driver.findElement(By.xpath("//body[1]/app-root[1]/app-app-school[1]/div[1]/main[1]/div[1]/div[1]/div[1]/app-app-school-expense[1]/app-school-expense-add[1]/section[1]/section[1]/div[1]/div[2]/div[2]/div[2]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")).sendKeys("Expense");
	Thread.sleep(2000);	
	driver.findElement(By.xpath("//input[@id='attendanceFilterByDate']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//tbody/tr[5]/td[5]/span[1]")).click();	
	Thread.sleep(4000);
	driver.findElement(By.xpath("//tbody/tr[1]/td[3]/div[1]/ng-select[1]/div[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[contains(text(),'Tax Expense')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//tbody/tr[1]/td[4]/input[1]")).sendKeys("Done");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//tbody/tr[1]/td[5]/input[1]")).sendKeys("200");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@id='automation-510']")).click();
	Thread.sleep(2000);
}
}

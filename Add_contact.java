package testcasepackage;



import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

import org.testng.annotations.Test;



import driverpackage.baseDriver;



public class Add_contact extends baseDriver {

String baseUrl = "https://test-schoolerp.celloscope.net/login";
@Test

public void locatorlearning() throws InterruptedException {
	
	driver.findElement(By.xpath("//body/app-root[1]/app-app-school[1]/div[1]/app-sidebar[1]/nav[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[2]/ul[1]/li[26]/ul[1]/li[1]/a[1]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//body/app-root[1]/app-app-school[1]/div[1]/main[1]/div[1]/div[1]/div[1]/app-app-school-contact[1]/app-school-contact-add[1]/section[1]/section[1]/div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("Jannatul ferdos");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//body/app-root[1]/app-app-school[1]/div[1]/main[1]/div[1]/div[1]/div[1]/app-app-school-contact[1]/app-school-contact-add[1]/section[1]/section[1]/div[1]/div[2]/div[1]/div[2]/input[1]")).sendKeys("জান্নাতুল ফেরদৌস");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//body/app-root[1]/app-app-school[1]/div[1]/main[1]/div[1]/div[1]/div[1]/app-app-school-contact[1]/app-school-contact-add[1]/section[1]/section[1]/div[1]/div[2]/div[3]/div[1]/textarea[1]")).sendKeys("Dhaka");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//select[@id='contactGroup']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//option[contains(text(),'Teacher Group')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//body/app-root[1]/app-app-school[1]/div[1]/main[1]/div[1]/div[1]/div[1]/app-app-school-contact[1]/app-school-contact-add[1]/section[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]")).sendKeys("01887949170");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//body/app-root[1]/app-app-school[1]/div[1]/main[1]/div[1]/div[1]/div[1]/app-app-school-contact[1]/app-school-contact-add[1]/section[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[2]/input[1]")).sendKeys("sabina.yeasmin@doer.com.bd");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//body/app-root[1]/app-app-school[1]/div[1]/main[1]/div[1]/div[1]/div[1]/app-app-school-contact[1]/app-school-contact-add[1]/section[1]/section[2]/div[1]/div[1]/div[1]/div[1]/button[2]")).click();
	Thread.sleep(2000);
	
	
	
	
}

}

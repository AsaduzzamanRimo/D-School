package testcasepackage;



import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

import org.testng.annotations.Test;



import driverpackage.baseDriver;



public class Add_contact_group_01 extends baseDriver {
	String baseUrl = "https://test-schoolerp.celloscope.net/login";
	@Test
	public void locatorlearning() throws InterruptedException {
		
		driver.findElement(By.xpath("//a[contains(text(),'Add Contact Group')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//body/app-root[1]/app-app-school[1]/div[1]/main[1]/div[1]/div[1]/div[1]/app-app-school-contact-group[1]/app-school-contact-group-add[1]/section[1]/section[1]/div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("jannatul ferdos");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/app-root[1]/app-app-school[1]/div[1]/main[1]/div[1]/div[1]/div[1]/app-app-school-contact-group[1]/app-school-contact-group-add[1]/section[1]/section[1]/div[1]/div[2]/div[1]/div[2]/input[1]")).sendKeys("জান্নাতুল ফেরদৌস");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='contact']")).sendKeys("jannatul ferdos");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/app-root[1]/app-app-school[1]/div[1]/main[1]/div[1]/div[1]/div[1]/app-app-school-contact-group[1]/app-school-contact-group-add[1]/section[1]/section[1]/div[1]/div[2]/div[2]/div[1]/textarea[1]")).sendKeys("done");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/app-root[1]/app-app-school[1]/div[1]/main[1]/div[1]/div[1]/div[1]/app-app-school-contact-group[1]/app-school-contact-group-add[1]/section[1]/section[2]/div[1]/div[1]/div[1]/div[1]/button[2]")).click();
		Thread.sleep(2000);

		
	}
}

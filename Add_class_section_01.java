package testcasepackage;


import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverpackage.baseDriver;

public class Add_class_section_01 extends baseDriver {
String baseUrl = "https://test-schoolerp.celloscope.net/login";

@Test
public void locatorlearning() throws InterruptedException {


driver.findElement(By.xpath("//a[contains(text(),'Add Class Section')]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//body/app-root[1]/app-app-school[1]/div[1]/main[1]/div[1]/div[1]/div[1]/app-app-school-class-section[1]/app-school-class-section-create[1]/section[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ng-select[1]/div[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//span[contains(text(),'2021-2022')]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//body/app-root[1]/app-app-school[1]/div[1]/main[1]/div[1]/div[1]/div[1]/app-app-school-class-section[1]/app-school-class-section-create[1]/section[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[2]/ng-select[1]/div[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//body/app-root[1]/app-app-school[1]/div[1]/main[1]/div[1]/div[1]/div[1]/app-app-school-class-section[1]/app-school-class-section-create[1]/section[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[3]/ng-select[1]/div[1]")).click();
Thread.sleep(2000);

driver.findElement(By.xpath("//input[@id='sectionCapacity']")).sendKeys("400");
Thread.sleep(2000);
driver.findElement(By.xpath("//body/app-root[1]/app-app-school[1]/div[1]/main[1]/div[1]/div[1]/div[1]/app-app-school-class-section[1]/app-school-class-section-create[1]/section[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//span[contains(text(),'Class 6')]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='sectionNameEn']")).sendKeys("section-3");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='sectionNameBn']")).sendKeys("অধ্যায়-3");
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@id='automation-171']")).click();
Thread.sleep(2000);
//driver.findElement(By.xpath("//body/app-root[1]/app-app-school[1]/div[1]/main[1]/app-navbar[1]/nav[1]/div[1]/div[1]/div[1]/div[2]/a[1]/p[1]")).click();
//Thread.sleep(2000);
//driver.findElement(By.xpath("//a[@id='automation-18']")).click();
//Thread.sleep(2000);

}

	}

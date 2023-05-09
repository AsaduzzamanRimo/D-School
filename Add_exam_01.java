package testcasepackage;



import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

import org.testng.annotations.Test;



import driverpackage.baseDriver;



public class Add_exam_01 extends baseDriver {

String baseUrl = "https://test-schoolerp.celloscope.net/login";
@Test

public void locatorlearning() throws InterruptedException {




driver.findElement(By.xpath("//body/app-root[1]/app-app-school[1]/div[1]/app-sidebar[1]/nav[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[2]/ul[1]/li[13]/a[1]/span[1]")).click();
Thread.sleep(2000);		
driver.findElement(By.xpath("//body/app-root[1]/app-app-school[1]/div[1]/app-sidebar[1]/nav[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[2]/ul[1]/li[13]/ul[1]/li[1]/a[1]")).click();
Thread.sleep(5000);	

driver.findElement(By.xpath("//input[@id='nameEn']")).sendKeys("Final exam");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='nameBn']")).sendKeys("চূড়ান্ত পরীক্ষা");
Thread.sleep(2000);
driver.findElement(By.xpath("//body/app-root[1]/app-app-school[1]/div[1]/main[1]/div[1]/div[1]/div[1]/app-app-school-exam[1]/app-school-exam-add[1]/section[1]/section[1]/div[1]/div[2]/div[3]/div[1]/ng-select[1]/div[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//span[contains(text(),'2022-2023')]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//body/app-root[1]/app-app-school[1]/div[1]/main[1]/div[1]/div[1]/div[1]/app-app-school-exam[1]/app-school-exam-add[1]/section[1]/section[1]/div[1]/div[2]/div[3]/div[2]/ng-select[1]/div[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//span[contains(text(),'Class Test Exam')]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='startDate']")).click();
Thread.sleep(2000);	
driver.findElement(By.xpath("//tbody/tr[5]/td[5]/span[1]")).click();
Thread.sleep(2000);		
driver.findElement(By.xpath("//input[@id='endDate']")).click();
Thread.sleep(2000);	
driver.findElement(By.xpath("//tbody/tr[5]/td[6]/span[1]")).click();
Thread.sleep(2000);		
driver.findElement(By.xpath("//input[@id='startTime_0']")).sendKeys("10:00AM");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='endTime_0']")).sendKeys("12:00PM");
Thread.sleep(2000);
driver.findElement(By.xpath("//tbody/tr[2]/td[7]/div[1]/input[1]")).click();
Thread.sleep(2000);	
driver.findElement(By.xpath("//tbody/tr[2]/td[6]/div[1]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
Thread.sleep(2000);	
driver.findElement(By.xpath("//span[contains(text(),'Secondary Education Grading System')]")).click();
Thread.sleep(2000);	
driver.findElement(By.xpath("//button[@id='automation-312']")).click();
Thread.sleep(2000);	


}
	}

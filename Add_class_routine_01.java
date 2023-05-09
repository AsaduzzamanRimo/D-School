package testcasepackage;


import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverpackage.baseDriver;

public class Add_class_routine_01 extends baseDriver {
String baseUrl = "https://test-schoolerp.celloscope.net/login";

@Test
public void locatorlearning() throws InterruptedException {


driver.findElement(By.xpath("//span[contains(text(),'Class Routine')]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//a[contains(text(),'Add Class Routine')]")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//select[@id='session']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//body/app-root[1]/app-app-school[1]/div[1]/main[1]/div[1]/div[1]/div[1]/app-app-school-class-routine[1]/app-school-class-routine-add[1]/section[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/select[1]/option[3]")).click();
Thread.sleep(2000);	
driver.findElement(By.xpath("//select[@id='shift']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//option[contains(text(),'Day')]")).click();
Thread.sleep(2000);	
driver.findElement(By.xpath("//select[@id='classVersion']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//option[contains(text(),'Bangla Version')]")).click();
Thread.sleep(2000);	
driver.findElement(By.xpath("//select[@id='className']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//option[contains(text(),'Class 6')]")).click();
Thread.sleep(2000);	
driver.findElement(By.xpath("//select[@id='classSection']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//option[contains(text(),'A')]")).click();
Thread.sleep(2000);		
driver.findElement(By.xpath("//button[@id='automation-173']")).click();
Thread.sleep(2000);	
}
}

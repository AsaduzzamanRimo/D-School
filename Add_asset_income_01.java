package testcasepackage;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverpackage.baseDriver;

public class Add_asset_income_01 extends baseDriver {
String baseUrl = "https://test-schoolerp.celloscope.net/login";

@Test
public void locatorlearning() throws InterruptedException {


driver.findElement(By.xpath("//body/app-root[1]/app-app-school[1]/div[1]/main[1]/div[1]/div[1]/div[1]/app-app-school-asset-income[1]/app-school-asset-income-add[1]/section[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ng-select[1]/div[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//span[contains(text(),'স্কুল শপিং কমপ্লেক্স')]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//body/app-root[1]/app-app-school[1]/div[1]/main[1]/div[1]/div[1]/div[1]/app-app-school-asset-income[1]/app-school-asset-income-add[1]/section[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ng-select[1]/div[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//span[contains(text(),'দোকান নম্বর - ১০০')]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='titleEn']")).sendKeys("service");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='titleBn']")).sendKeys("সেবা");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='issueDate']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//tbody/tr[4]/td[4]/span[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='dueDate']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//span[contains(text(),'19')]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//textarea[@id='automation-475']")).sendKeys("done");
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@id='automation-477']")).click();
Thread.sleep(2000);

}
}

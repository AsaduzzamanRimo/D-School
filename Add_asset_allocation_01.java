package testcasepackage;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverpackage.baseDriver;

public class Add_asset_allocation_01 extends baseDriver {
String baseUrl = "https://test-schoolerp.celloscope.net/login";

@Test
public void locatorlearning() throws InterruptedException {


driver.findElement(By.xpath("//span[contains(text(),'Asset Allocation')]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//a[contains(text(),'Add Asset Allocation')]")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//body/app-root[1]/app-app-school[1]/div[1]/main[1]/div[1]/div[1]/div[1]/app-app-school-asset-allocation[1]/app-school-asset-allocation-add[1]/section[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ng-select[1]/div[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//span[contains(text(),'School Shoping Complex')]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//body/app-root[1]/app-app-school[1]/div[1]/main[1]/div[1]/div[1]/div[1]/app-app-school-asset-allocation[1]/app-school-asset-allocation-add[1]/section[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[2]/ng-select[1]/div[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//span[contains(text(),'Shop No - 101')]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//body/app-root[1]/app-app-school[1]/div[1]/main[1]/div[1]/div[1]/div[1]/app-app-school-asset-allocation[1]/app-school-asset-allocation-add[1]/section[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[3]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//span[contains(text(),'MD KHIRUL ALAM MILON')]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='rentAmount']")).sendKeys("500");
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@id='advancedAmount']")).sendKeys("600");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='accountsReceivable']")).sendKeys("700");
Thread.sleep(2000);
driver.findElement(By.xpath("//body/app-root[1]/app-app-school[1]/div[1]/main[1]/div[1]/div[1]/div[1]/app-app-school-asset-allocation[1]/app-school-asset-allocation-add[1]/section[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ng-select[1]/div[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//span[contains(text(),'Monthly')]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='adjustmentAdvanceWithRent']")).sendKeys("1000");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='contractDate']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//span[contains(text(),'11')]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='commencementDate']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//span[contains(text(),'19')]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='endDateOfContract']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//span[contains(text(),'22')]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//textarea[@id='automation-465']")).sendKeys("done");
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@id='automation-464']")).click();
Thread.sleep(2000);




}
}

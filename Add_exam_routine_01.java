package testcasepackage;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

import org.testng.annotations.Test;

import driverpackage.baseDriver;

public class Add_exam_routine_01 extends baseDriver {

String baseUrl = "https://test-schoolerp.celloscope.net/login";
@Test

public void locatorlearning() throws InterruptedException {

driver.get("https://test-schoolerp.celloscope.net/login");
driver.manage().window().maximize();
Thread.sleep(2000);

driver.findElement(By.xpath("//a[contains(text(),'Add Exam Routine')]")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//body/app-root[1]/app-app-school[1]/div[1]/main[1]/div[1]/div[1]/div[1]/app-app-school-exam-routine[1]/app-school-exam-routine-add[1]/section[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[1]/ng-select[1]/div[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//span[contains(text(),'Pre-Test exam -- 2022')]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='examDate_0_0']")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//span[contains(text(),'25')]")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//tbody/tr[1]/td[7]/div[1]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//span[contains(text(),'10:00 --- 12:00')]")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//button[@id='automation-332']")).click();
Thread.sleep(5000);


}
	}

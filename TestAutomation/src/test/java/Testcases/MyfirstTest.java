package Testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import UI_Elements.Locater;
import base.BaseTest;

public class MyfirstTest extends BaseTest{
	
	@Test
public void loginTest() throws IOException {
    getdata();
	driver.findElement(By.className(Locater.Login.getLoc())).click();
	driver.findElement(By.id(Locater.Email_ID.getLoc())).sendKeys(p.getProperty("Email"));
	driver.findElement(By.id(Locater.Next_Btn.getLoc())).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Locater.Password.getLoc())));
	driver.findElement(By.xpath(Locater.Password.getLoc())).click();
	driver.findElement(By.xpath(Locater.Password.getLoc())).sendKeys(p.getProperty("Password"));
	driver.findElement(By.id(Locater.Submit_btn.getLoc())).click();
}
}

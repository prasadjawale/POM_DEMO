package com.flipcart.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.flipcart.base.TestBase;

public class LoginPage extends TestBase{ 
	
	By emailLoc = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input");
	By passwordLoc =By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input");
	By loginButtonLoc = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button/span");
	
	public String validateLogin(String email, String pwd) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.findElement(emailLoc).sendKeys(email);
		wait(1000);
		driver.findElement(passwordLoc).sendKeys(pwd);
		wait(1000);
		driver.findElement(loginButtonLoc).click();
		try {
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Prasad']")));
		}catch (TimeoutException te) {                                 
			captureScreenshot("Login Page Error");//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[2]/form/button
		}
		String actResult =  driver.findElement(By.xpath("//*[text()='Prasad']")).getText();
		return actResult;
	}

	}



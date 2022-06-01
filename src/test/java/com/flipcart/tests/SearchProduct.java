package com.flipcart.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.flipcart.base.TestBase;

public class SearchProduct extends TestBase{
	By Search = By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input");
   By SearchBtn = By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button");
	public String searchOne(String pdt) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
     driver.findElement(Search).sendKeys("Laptop");
     wait (1000);
     driver.findElement(SearchBtn).click();
     try {
    		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Flights']")));
    			}catch (TimeoutException te) {
    				captureScreenshot("Login Page Error");
    			}
     String actResult =  driver.findElement(By.xpath("//*[text()='Flights']")).getText();
	return pdt ;
	}
	}
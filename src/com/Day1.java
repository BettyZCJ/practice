package com;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;

public class Day1 {
	WebDriver driver;
	public void invokeBrose() {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\bettyzheng\\Anaconda3\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//			navigateCommands();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	public void navigateCommands() {
		try {
			driver.get("http://www.baidu.com");
			driver.findElement(By.xpath("//input[@id='kw']")).sendKeys("test");
			driver.findElement(By.id("su")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			driver.navigate().to("https://www.yatra.com/");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='BE_flight_origin_date']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@id='month-scroll0']/div/div/table/tbody/tr[1]/td[4]")).click();
			
			Thread.sleep(2000);
			driver.close();
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
	}
	public void TakeScreenShot() {
		
		driver.get("https://www.google.com");
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File(".\\screen.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
						
	}
	public void searchHomeonEbay() {
		
	}
	public static void main(String[] args) {
		Day1 test= new Day1();
		test.invokeBrose();
//		test.navigateCommands();
		test.TakeScreenShot();
		
	}

}

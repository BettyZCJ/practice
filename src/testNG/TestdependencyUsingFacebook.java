package testNG;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestdependencyUsingFacebook {
	WebDriver driver;
	@Test
	public void openBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\bettyzheng\\Anaconda3\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//			navigateCommands();
			driver.get("http://mail.10086.cn/");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(dependsOnMethods= {"openBrowser"})
	public void loginToFacebook() {
		driver.findElement(By.id("txtUser")).sendKeys("13642754854");
		driver.findElement(By.id("txtPass")).sendKeys("jr081541125");
		driver.findElement(By.id("loginBtn")).click();
	}
	

}

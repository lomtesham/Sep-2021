package part1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lomte Sir\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.location='https://www.facebook.com/'");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement english=driver.findElement(By.xpath("//a[text()='English (UK)']"));
		js.executeScript("arguments[0].click();",english);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		/*
		Select day=new Select(driver.findElement(By.id("email")));
		day.selectByValue("10");
		Select month=new Select(driver.findElement(By.id("month")));
		month.selectByValue("9");
		Select year=new Select(driver.findElement(By.id("year")));
		year.selectByValue("2021");
		*/
	/*	Select day=new Select(driver.findElement(By.id("email")));
		day.selectByIndex(9);
		Select month=new Select(driver.findElement(By.id("month")));
		month.selectByIndex(9);
		Select year=new Select(driver.findElement(By.id("year")));
		year.selectByIndex(0);
		*/
		Select day=new Select(driver.findElement(By.id("email")));
		day.selectByVisibleText("10");
		Select month=new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Sep");
		Select year=new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("2021");
		

	}

}

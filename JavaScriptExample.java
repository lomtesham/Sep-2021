package part1;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lomte Sir\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.location='https://www.facebook.com/'");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement english=driver.findElement(By.xpath("//a[text()='English (UK)']"));
		js.executeScript("arguments[0].click();",english);
		
		
	String url=	js.executeScript("return document.URL;").toString();
       System.out.println(url);
       String title=js.executeScript("return document.title;").toString();
       System.out.println(title);
       
       js.executeScript("alert('convert to english')");
       driver.switchTo().alert().accept();
       
       WebElement username=driver.findElement(By.id("email"));
       js.executeScript("arguments[0].value='9970125080';",username);
       WebElement password=driver.findElement(By.id("pass"));
       js.executeScript("arguments[0].value='Sanju@1234';",password);
       
        WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
		js.executeScript("arguments[0].click();",login);
       
       
       
	}

}

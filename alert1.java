package part1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alert1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lomte Sir\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		//driver.navigate().to("https://www.naukri.com/");
		//driver.navigate().to("https://demoqa.com/browser-windows");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement alertbutton=driver.findElement(By.xpath("//button[@id='alertButton']"));
		alertbutton.click();
		driver.switchTo().alert().accept();
		
		WebElement timerAlertButton=driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		timerAlertButton.click();
		WebDriverWait wait=new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.alertIsPresent()).accept();
		
		WebElement confirmButton=driver.findElement(By.xpath("//button[@id='confirmButton']"));
		confirmButton.click();
		String text=driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().dismiss();
		
		WebElement promtButton=driver.findElement(By.xpath("//button[@id='promtButton']"));
		promtButton.click();
		driver.switchTo().alert().sendKeys("Sham madhukar lomte");
		
		driver.switchTo().alert().accept();
		
	}

}

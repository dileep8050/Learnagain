import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll {

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",path+"\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(4000);
		
		//Vertical scroll
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=500");
		System.out.println("test");
		System.out.println(driver.findElement(By.cssSelector(".totalAmount")).getText());
	
		String url=driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
	HttpURLConnection conn=	(HttpURLConnection)new URL(url).openConnection();
	conn.setRequestMethod("HEAD");
	conn.connect();
	
	System.out.println(conn.getResponseCode());

	}

}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkselenium {

	public static void main(String[] args) {
		String path=System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver",path+"\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("www.google.com");
		
		
	}

}

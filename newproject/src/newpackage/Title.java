package newpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title{
	
	public static WebDriver driver=null;
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Milijana\\Desktop\\chromedriver_win32");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		//open the web application
		driver.navigate().to("http://computer-database.gatling.io/computers");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		
		if (title.equalsIgnoreCase("Computer database"))
	        System.out.println("Title maches");
		else 
			System.out.println(title);	
		
		//locate web element
		String tagname= " ";
		tagname= driver.findElement(By.xpath("/html/body/header/h1/a")).getText();
	    System.out.println(tagname);
	    
	}
	
	
}

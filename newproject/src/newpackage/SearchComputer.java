package newpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchComputer{
	
	public static WebDriver driver=null;
	public static void main(String[] args) throws InterruptedException
	
	    {
	    System.getProperty("webdriver.chrome.driver","C:\\Users\\Milijana\\git\\SelenijumTest\\newproject\\driver\\chromedriver.exe");   
	    WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    
	    //open the web application
	    driver.navigate().to("http://computer-database.gatling.io/computers");
	    driver.manage().window().maximize();
	    
	    //fill in the search bar
	    driver.findElement(By.xpath("//*[@id=\"searchbox\"]")).sendKeys("ACE");
	    driver.findElement(By.xpath("//*[@id=\"searchsubmit\"]")).click();
	    

	    if (driver.findElement(By.xpath("//*[@id=\"main\"]/h1")).equals("6 computers found"))
	        System.out.println("ACE word in name is found");
		else 
			System.out.println("Faild search");	
		
	    
	    
	    driver.quit();
	    
	    }   

	 
}
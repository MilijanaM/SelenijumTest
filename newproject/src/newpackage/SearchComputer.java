package newpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchComputer{
	
	public static WebDriver driver=null;
	public static void main(String[] args) throws InterruptedException
	
	    {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\Milijana\\git\\SelenijumTest\\newproject\\driver\\chromedriver.exe");   
	    WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    
	    //open the web application
	    driver.navigate().to("http://computer-database.gatling.io/computers");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    
	    //fill in the search bar
	    driver.findElement(By.xpath("//*[@id=\"searchbox\"]")).sendKeys("ACE");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"searchsubmit\"]")).click();
	    Thread.sleep(5000);
	    
	    WebElement Element1 = driver.findElement(By.xpath("//*[@id=\"main\"]/h1"));
	    
	   if (Element1.getText().equals("6 computers found"))
	        System.out.println("Successful");
		else 
			System.out.println("Faild search");	
		
	    
	    driver.quit();
	    
	    }   

	 
}
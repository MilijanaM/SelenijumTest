package newpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AddComputer {
	
	 public static void main(String[] args) throws InterruptedException

	    {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\Milijana\\git\\SelenijumTest\\newproject\\driver\\chromedriver.exe");   
	    WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    
	    //open the web application
	    driver.navigate().to("http://computer-database.gatling.io/computers");
	    driver.manage().window().maximize();
	  		
	    //fill in the form and submit
	    driver.findElement(By.xpath("//*[@id=\"add\"]")).click();
	    driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Milijana");
	    driver.findElement(By.xpath("//*[@id=\"introduced\"]")).sendKeys("2020-01-01");
	    driver.findElement(By.xpath("//*[@id=\"discontinued\"]")).sendKeys("2021-09-01");

	    
	    Select sel = new Select(driver.findElement(By.xpath("//*[@id=\"company\"]")));
	    sel.selectByIndex(3);
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//*[@id=\"main\"]/form/div/input")).click();
	    //end of filling in the form
	    
	    WebElement Element2 = driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]"));

	    
	    if (Element2.getText().equals("Done ! Computer Milijana has been created"))
	        System.out.println("Computer is added");
		else 
			System.out.println("Faild adding");	
		
	 
	    driver.quit();
	    
	    }   

	 
}
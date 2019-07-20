  package Gmailediting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchandDeletemails {
	
  public void initialize() {

    System.setProperty("webdriver.chrome.driver","C:\\Users\\Ashwini\\eclipse-workspace\\makemytrip\\resources\\chromedriver.exe");
    
	WebDriver driver = new ChromeDriver();
     
    driver.get("https://mail.google.com/");
    
 // driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();
  driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("ashwinidhanodkar26@gmail.com");
  driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
  try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
  
  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Pass@1234");
  driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
  
  try {
	Thread.sleep(30000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
  
  WebElement searchbox= driver.findElement(By.xpath("//input[@class='gb_xf']"));
  searchbox.sendKeys("myntra");
  searchbox.sendKeys(Keys.ENTER);
  
  
  
  //driver.switchTo().frame("hist_frame");
  
  try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  
  //List <WebElement> name= driver.findElements(By.xpath("//span[class=\"yP\"] and contains(text(),'@e.farmers.co.nz')"));
  //int x=name.size();
  
 // System.out.println("number of elements present" + x);
  
  
  WebElement Panel= driver.findElement(By.xpath("//div[@id=':5']//div[@class='D E G-atb' and @gh='tm']//div[@class='nH aqK']//div//div//div//div//div//div//span"));
  JavascriptExecutor js = (JavascriptExecutor)driver;
  js.executeScript("arguments[0].click();", Panel);

  try {
	Thread.sleep(1000);
} catch (InterruptedException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
  
  
  WebElement del= driver.findElement(By.xpath("//*[@id=\":5\"]/div[2]/div[1]/div[1]/div/div/div[2]/div[3]"));
  del.click();

  WebElement number= driver.findElement(By.xpath("//div[@id=':5']//div[@class='D E G-atb' and @gh='tm']//div[@class='nH aqK']//div//div//span//div//span//span//span[2]"));
  String xyz= number.getText();
  
  System.out.println(xyz + "Value of xyz");
  int val= Integer.parseInt(xyz);
 
  
  WebElement nextarrow = driver.findElement(By.xpath("//div[@id=':5']//div//div//div//div//span//div[@class='T-I J-J5-Ji amD T-I-awG T-I-ax7 T-I-Js-Gs L3']"));
  
  
  try {
	  //nextarrow.
  if (val>=50) {
	  
  while(nextarrow.isEnabled() && nextarrow.isDisplayed()){
	  
 try {
	Thread.sleep(10000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

 nextarrow = driver.findElement(By.xpath("//div[@id=':5']//div//div//div//div//span//div[@class='T-I J-J5-Ji amD T-I-awG T-I-ax7 T-I-Js-Gs L3']"));
 
WebElement Panel2= driver.findElement(By.xpath("//*[@id=\":m8\"]/div[1]/span"));
JavascriptExecutor js2 = (JavascriptExecutor)driver;
js2.executeScript("arguments[0].click();", Panel2);

try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
WebElement del2= driver.findElement(By.xpath("//*[@id=\":5\"]/div[2]/div[1]/div[1]/div/div/div[2]/div[3]"));

del2.click();

number= driver.findElement(By.xpath("//div[@id=':5']//div[@class='D E G-atb' and @gh='tm']//div[@class='nH aqK']//div//div//span//div//span//span//span[2]"));
xyz= number.getText();

System.out.println(xyz + "Value of xyz inside loop");
val= Integer.parseInt(xyz);

  }}else
  {System.out.println("Mails are lesser than 50 ");}
  
  }catch(Exception e)
  {
	  System.out.println(e + "No more elements in list");
  }
  }  
}

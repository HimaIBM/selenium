package TestNGExample;



 import java.util.Set;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.testng.Assert;
	import org.testng.annotations.Test;

	//import org.junit.Test;

	public class HandleWindows extends basetestclass{
	    
	    
	    @Test
	    public void verifyLoginfeature() throws Exception {
	        
	        String parentWindow = driver.getWindowHandle();         //unique window id ---- current focus of driver
	        
	        WebElement btn_hotels = driver.findElement(By.partialLinkText("HOTELS"));
	        btn_hotels.click();
	        
	        
	        Thread.sleep(4000);
	        Set<String> allWindow1 = driver.getWindowHandles();                             //set of strings --- multiple window id
	        
	        
	        
	        String MainWindow = (String)allWindow1.toArray()[0];
	        String hotelWindow = (String)allWindow1.toArray()[1];
	        
	        System.out.println("MainWindow: " + MainWindow);
	        System.out.println("parentWindow: " + parentWindow);
	        System.out.println("HotelWindow: " + hotelWindow);
	        
	        System.out.println("window count after click on Hotel: " + allWindow1.size());
	        
	        
	        
	        
	        
	        //Alert/frame/window ---- driver.switchTo
	        
	        Thread.sleep(4000);
	        driver.switchTo().window(hotelWindow);
	        System.out.println("Application Title of hotel winodw: " + driver.getTitle());
	        
	        
	        
	        
	        driver.findElement(By.partialLinkText("Login")).click();
	        Thread.sleep(4000);
	        
	        
	        
	        
	        
	        
	        
	        Thread.sleep(4000);
	        
	        driver.switchTo().window(MainWindow);
	        
	        
	        System.out.println("Application Title: " + driver.getTitle());
	        
	        
	        driver.findElement(By.partialLinkText("CONTACT US")).click();
	        Thread.sleep(4000);
	        
	        
	        
	        System.out.println("===============Switch back to hotel window===========");
	        Thread.sleep(4000);
	        driver.switchTo().window(hotelWindow);
	        
	        driver.findElement(By.cssSelector("input[name=\"username\"]")).sendKeys("demo@gmail.com");
	        
	        
	        
	    }
	}


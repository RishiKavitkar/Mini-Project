package org.rk.pp;



import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CodeRed extends Read{
	public static void main(String[] args) throws IOException {
		
		//configuration
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\admin\\eclipse-workspace\\DellUser\\driver\\chromedriver.exe");
				
				//launching
				WebDriver driver  = new ChromeDriver();
				
				//navigating url
				driver.get("https://money.rediff.com/index.html");
				
				String cu = driver.getCurrentUrl();
				System.out.println(cu);
				
				//find the locator
				driver.findElement(By.xpath("//*[@id=\"signin_info\"]/a[1]")).click();
				
				//login username and password
				WebElement login= driver.findElement(By.xpath("//*[@id=\"useremail\"]"));
				login.sendKeys("rishikavitkar97");
				login.click();
				
				WebElement txtpwd= driver.findElement(By.xpath("//*[@id=\"userpass\"]"));
				txtpwd.sendKeys("Rk@rediff97");
				txtpwd.click();
				
				WebElement signin= driver.findElement(By.xpath("//*[@id=\"loginsubmit\"]"));
				signin.click();
				System.out.println("successfully sign in");
				System.out.println("Portfolio Exists");
				
				List<String> aList= new ArrayList<String>();
				aList.add("large capital");
				aList.add("mid capital");
				aList.add("mutual fund");
				
				
				driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/b/div[2]/div[3]/table/tbody/tr[1]"
						+ "/td[2]/span/a"));
				System.out.println("TCS");
				
				driver.findElement(By.xpath("/html/body/div[4]/div[2]/"
						+ "div/b/div[2]/div[3]/table/tbody/tr[2]/td[2]/span/a"));
				System.out.println("Tata Motors");
				
				driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/b/div[3]"
						+ "/div[3]/table/tbody/tr/td[2]/span/a"));
				System.out.println("ICICI");
				
				
     File f1 = new File("C:\\Users\\admin\\eclipse-workspace\\DellUser\\Text");
     boolean b = f1.mkdir();
     System.out.println("folder created successfully"+b);
     File f2 = new File("C:\\Users\\admin\\eclipse-workspace\\DellUser\\Text\\uka");
     boolean c = f2.createNewFile();
     System.out.println("file created successfully");
     
     try {
		Robot r = new Robot();
	} catch (AWTException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     String[] rw= getData();
     for(int i=0;i<=2;i++) {
    	 
     }
     
				
				

	}

	private static String[] getData() {
		// TODO Auto-generated method stub
		return null;
	}
}

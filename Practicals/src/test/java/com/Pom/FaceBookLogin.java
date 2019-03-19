package com.Pom;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FaceBookLogin {
	WebDriver driver;
	Logger log=Logger.getLogger("FaceBookLogin");
	By userName=By.name("email");
	By passWord=By.id("pass");
	@BeforeMethod
	public static void LogFile()
	{
	Logger log=Logger.getLogger(FaceBookLogin.class);
//	PropertyConfigurator.configure("log4j.properties");
	
	}
	
	@BeforeSuite
	public void LaunchDriver()
	{
	log.info("Launching the driver");
		System.out.println("Launching");
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
	}
	@Test(priority=1,invocationCount=3)
	public void LoginPage()
	{
		System.out.println("WElcome");
		log.info("Welcome to login page");
		driver.findElement(By.name("email")).sendKeys("shalu93dwivedi@gmailcom");
		driver.findElement(By.id("pass")).sendKeys("R@dheyShyam");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}
	@Test(priority=2)
	public void nextPage()
	{
		driver.findElement(By.className("inputtext _55r1 inputtext _1kbt _4rer inputtext _1kbt")).sendKeys("Sh@liniDwivedi");
		driver.findElement(By.className("_42ft _4jy0 _52e0 _4jy6 _4jy1 selected _51sy")).click();
	}

}

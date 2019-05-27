package Hivelet;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class FunctionalTesting {
	
	
	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
		
		
		 File f=new File("src");
		   File fs=new File(f,"app-debug.apk");
		   
		   DesiredCapabilities cap=new DesiredCapabilities();
		  
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "ShoaibVD01");
			cap.setCapability("automationName", "uiautomator2");
		    cap.setCapability("appPackage","com.celeritas.hivelet");
		    cap.setCapability("appActivity","com.celeritas.hivelet.MainActivity");
			cap.setCapability(MobileCapabilityType.APP,fs.getAbsolutePath());
			AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
			return driver;

	}

	
  @Test(priority = '1')
  public void LoginToHome() throws InterruptedException, MalformedURLException {
	  AndroidDriver<AndroidElement> driver = Capabilities();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  List<AndroidElement> editemail = driver.findElements(By.className("android.widget.EditText"));
	  editemail.get(0).sendKeys("shoaibsiddiq01@gmail.com");
	  List<AndroidElement> editpass = driver.findElements(By.className("android.widget.EditText"));
	  editpass.get(1).sendKeys("Shoaib123@");
	  //Thread.sleep(1000);
	  driver.findElementByXPath("//android.widget.Button[@text = 'Login']").click();
	  //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  
  }
  
  @Test(priority = '2')
  public void HomeToDigitalLibrary() throws MalformedURLException, InterruptedException {
	  AndroidDriver<AndroidElement> driver = Capabilities();
//	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	  List<AndroidElement> editemail = driver.findElements(By.className("android.widget.EditText"));
//	  editemail.get(0).sendKeys("shoaibsiddiq01@gmail.com");
//	  List<AndroidElement> editpass = driver.findElements(By.className("android.widget.EditText"));
//	  editpass.get(1).sendKeys("Shoaib123@");
//	  Thread.sleep(1000);
//	  driver.findElementByXPath("//android.widget.Button[@text = 'Login']").click();
	  //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElementByXPath("//android.widget.Button[@text = 'Digital Library ']").click();
	  
  }
  
  
}

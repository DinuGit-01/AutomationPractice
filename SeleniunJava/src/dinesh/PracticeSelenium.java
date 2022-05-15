package dinesh;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PracticeSelenium {
public static void main(String[] args) {
	//Absolute path
			String driverPath1="E:\\Java\\eclipse-jee-photon-R\\SeleniunJava\\Executable\\msedgedriver.exe ";
			//or Relative path --> '.' indicate current working dir
			String driverPath2=".\\Executable\\msedgedriver.exe ";
			//or using System class
			String driverPath3=System.getProperty("user.dir")+"\\Executable\\msedgedriver.exe";
			//Set the driver executable path using System.setProperty(String key,String value)
		System.setProperty("webdriver.edge.driver", driverPath3);
			//create an instance of required browser class
			WebDriver cdriver=new EdgeDriver();
		cdriver.get("https:\\www.google.com");
		String actualurl=cdriver.getCurrentUrl();
		String exptUrl="https://www.google.com/";
		System.out.println("actual Url ="+actualurl);
		System.out.println("expected url is="+exptUrl);
		if ( actualurl.contains(exptUrl)) {
System.out.println(" url validation is passed");
}
		else {
			System.out.println(" url validation is failed");
		}
		String actual=cdriver.getTitle();
		String expectedTitle="Google";
		System.out.println("ExpectedTitle: "+actual);
		System.out.println("ActualTitle:"+cdriver.getTitle());
		System.out.println("ExpectedTitle: "+expectedTitle);
		if(actual.equals(expectedTitle)) {
			System.out.println("Title validation is passed");
		}else {
			System.out.println("Title validation is Failed");
		}
		//get the webpage source content
		String sourceContent=cdriver.getPageSource();
		System.out.println("Source content lenght:"+sourceContent.length());
		//close current browser
		cdriver.close();
}
}

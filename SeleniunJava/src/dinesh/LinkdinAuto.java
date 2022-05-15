package dinesh;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LinkdinAuto {

	public static void main(String[] args) throws InterruptedException {

		String Link1 = "E:\\Java\\eclipse-jee-photon-R\\SeleniunJava\\Executable\\msedgedriver.exe";// absolute path
		String Link2 = ".\\Executable\\msedgedriver.exe";// ******relative path2
		String Link3 = System.getProperty("user.dir") + "Executable\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver",Link2);
		WebDriver link = new EdgeDriver();
		link.get("https://www.linkedin.com");
		
		Thread.sleep(3000);
		Dimension D=new Dimension(400,500);
		link.manage().window().maximize();
		Thread.sleep(2000);
		link.findElement(By.name("session_key")).sendKeys("dj12774@gmail.com");
		link.findElement(By.name("session_password")).sendKeys("@12357Dinesh");
	//	link.findElement(By.xpath("//button[text()= 'Sign in']")).click();
		
			
}
}
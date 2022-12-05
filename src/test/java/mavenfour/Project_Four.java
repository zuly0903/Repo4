package mavenfour;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project_Four {
	
	public static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links are : "+links.size());
		
		/*for (int i = 1; i < links.size(); i++) {
			System.out.println(links.get(i).getText());
		}
		
		driver.close();*/
		
		Iterator<WebElement> itr = links.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().getText());
		}
		
		driver.close();
	}

}

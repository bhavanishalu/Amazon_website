import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\CHITHRA S\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co= new ChromeOptions();
		co.setBinary("C:\\Users\\CHITHRA S\\Downloads\\chrome-win64 (1)\\chrome-win64\\chrome.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("dell Laptops");
		//searchBox.sendKeys("DellLaptop");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		driver.findElement(By.id("a-autoid-0-announce")).click();
		
		driver.findElement(By.id("s-result-sort-select_2")).click();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//div[@id='reviewsRefinements']//following::section[@aria-label='4 Stars & Up']")).click();

		//driver.findElement(By.linkText(", Intel Core i9-11980HK, 32Gb, 1TB SSD, 17.3\" (43.94 Cms) FHD1ms 360Hz, NVIDIA RTX 3080 (16GB GDDR6). Windows 11 + MSO'21, Lunar Light (D569936WIN9, 3.02Kgs)")).click();   
		
		//driver.findElement(By.className("a-link-normal s-navigation-item (6)")).click();
		//try {
		//	Thread.sleep(10000);
		//} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
		//}
		
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("(//div[@cel_widget_id='MAIN-SEARCH_RESULTS-4']//following::h2)[1]")).click();
		
		
		
		String pw = driver.getWindowHandle();

	    Set<String> windows = driver.getWindowHandles();

	    Iterator<String> it = windows.iterator();

	 

	    while(it.hasNext()){

	    String cw = it.next();

	    if(!pw.equalsIgnoreCase(cw)){

	    driver.switchTo().window(cw);

	    String productDetails = driver.findElement(By.id("productTitle")).getText();

	    System.out.println(productDetails);

	    driver.close();

	    }

	 

	    }

	    driver.switchTo().window(pw);

	    driver.quit();

	 
		

	}

}

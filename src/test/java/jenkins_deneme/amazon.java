package jenkins_deneme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().fullscreen();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("kitchen aid KSM150PSER");
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		String a = driver.findElement(By.xpath("(//div[@class='s-item-container'])[1]")).getText();
		System.out.println(a);
	}

}

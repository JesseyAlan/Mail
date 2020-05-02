package mailCheck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Outlook {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\SELINIUM\\EclipsePrgrm\\Jap\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://outlook.live.com/owa/");
		WebElement signIn = driver.findElement(By.xpath("//a[text()='Sign in'][1]"));
		signIn.click();
		Thread.sleep(8000);

		driver.manage().window().maximize();

		WebElement txtmail = driver.findElement(By.xpath("//input[@type='email']"));
		txtmail.sendKeys("jesse_625@live.com");

		WebElement nxtBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		nxtBtn.click();

		Thread.sleep(8000);

		WebElement txtEmail2 = driver.findElement(By.xpath("//input[@name='passwd']"));
		txtEmail2.sendKeys("cuindreams@");

		WebElement btn2 = driver.findElement(By.xpath("//input[@type='submit']"));
		btn2.click();

		Thread.sleep(15000);

		WebElement btn3 = driver.findElement(By.xpath("//img[@alt='JP']"));
		btn3.click();

		Thread.sleep(3000);

		WebElement btn4 = driver.findElement(By.xpath("//a[@id='meControlSignoutLink']"));
		btn4.click();

		System.out.println("The End");

	}

}

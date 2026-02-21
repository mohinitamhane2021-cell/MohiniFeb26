package MavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MProjject1 {

			public static void main(String[] args) throws InterruptedException {
				
				System.setProperty("webdriver.chrome.driver" , "F:\\Mohini-2025 AUG\\Software\\chromedriver.exe");
				WebDriver dr = new ChromeDriver();
				dr.manage().window().maximize();
				dr.get("https://www.facebook.com");
				System.out.println("Facebook page is opened");
				dr.findElement(By.id("u_0_0_VX")).click();
				dr.findElement(By.id("email")).sendKeys("abc@test.com");
				dr.findElement(By.id("pass")).sendKeys("Mohini");
				System.out.println("Login");
				System.out.println("Mohini");
				System.out.println("Created branch A");
				
				Thread.sleep(3000);
				dr.close();
				System.out.println("Window closed");
				Thread.sleep(3000);

			}

	}

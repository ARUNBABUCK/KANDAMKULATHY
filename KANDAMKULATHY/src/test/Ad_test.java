package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Ad_pages;

public class Ad_test {
	WebDriver driver;

	String baseurl = "https://www.adithyahonda.com/";

	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
	}

	@BeforeMethod
	public void url() {
		driver.get(baseurl);
		driver.manage().window().maximize();
	}

	@Test
	public void test() throws InterruptedException {
		Ad_pages Adc = new Ad_pages(driver);

		Thread.sleep(4000);
		Adc.logodisplay();
		Thread.sleep(4000);
		Adc.logoclk();
		Thread.sleep(4000);
		Adc.homeclk();
		Thread.sleep(4000);
		Adc.aboutclk();
		Thread.sleep(4000);
		Adc.back();

//		Adc.networkclk();
//		Thread.sleep(3000);
//		Adc.back();
//
//		Adc.safetyclk();
//		Thread.sleep(2000);
//		Adc.back();
		
		Adc.careersclk();
		Thread.sleep(2000);

	}

}

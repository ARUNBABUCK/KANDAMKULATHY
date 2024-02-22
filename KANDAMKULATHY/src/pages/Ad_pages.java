package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Ad_pages {
	WebDriver driver;
	
	By logo = By.xpath("//*[@id=\"nav-red\"]/nav/div/a/div[1]/img");
	By home = By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[1]/a");
	By about = By.xpath("/html/body/div/div[1]/div[2]/nav/div/div/ul/li[2]/a");
//	By network = By.xpath("/html/body/div/div[1]/div[2]/nav/div/div/ul/li[3]/a");
	By safety =By.xpath("/html/body/div/div[1]/div[2]/nav/div/div/ul/li[4]/a");
	By careers=By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a");
	
	public Ad_pages(WebDriver driver) {

		this.driver=driver;
	}

	public void logodisplay() {
		boolean logo1= driver.findElement(logo).isDisplayed();
		
		if(logo1==true) {
			System.out.println("logo is displayed");
		}
		else {
			System.out.println("logo is not displayed");
		}
	}	
	public void logoclk() {
		driver.findElement(logo).click();
	}
	public void back() {
		driver.navigate().back();
	}
	public void homeclk() {
		driver.findElement(home).click();
	}
	public void aboutclk() {
		driver.findElement(about).click();
	}
	public void networkclk() {
		driver.findElement(network).click();
	}
	public void safetyclk() {
		driver.findElement(safety).click();
	}
	public void careersclk() {
		driver.findElement(careers);
	}
	
	
	
	
		

}

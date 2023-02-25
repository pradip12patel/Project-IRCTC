package ObjactPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjectIrctc {
	
	WebDriver driver;
	
	public By cancal=By.xpath("//img[@id='disha-banner-close']");
	public By from=By.xpath("//input[@class='ng-tns-c57-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']");
	public By city=By.xpath("//span[normalize-space()='NEW DELHI - NDLS']");
	public By to=By.xpath("//input[@class='ng-tns-c57-9 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']");
    public By tocity=By.xpath("//span[normalize-space()='JABALPUR - JBP']");
    public By qunta=By.xpath("//div[@class='ng-tns-c65-12 ui-dropdown ui-widget ui-state-default ui-corner-all']");
    public By classes=By.xpath("//li[@aria-label='TATKAL']");
    public By choose=By.xpath("//label[@class='css-label_c t_c']");
    public By date=By.xpath("//input[@class='ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']");
	public By plus=By.xpath("//span[@class='ui-datepicker-next-icon pi pi-chevron-right ng-tns-c58-10']");
	public By title=By.xpath("//div[@class='ui-datepicker-title ng-tns-c58-10']");
	public By pickdate=By.xpath("//tbody//tr//td");
	public By select=By.xpath("//div[@class='ng-tns-c65-11 ui-dropdown ui-widget ui-state-default ui-corner-all']");
    public By selectone=By.xpath("//li[@class='ui-dropdown-item ui-corner-all']");
    public By search=By.xpath("//button[@type='submit']");
    public By string=By.xpath("(//span[contains(text(),'JOURNEY CLASS')])[1]");
	
	public PageObjectIrctc(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement clickcancal()  {
		
		return driver.findElement(cancal);
	}
	
   public WebElement clickfrom()  {
		
		return driver.findElement(from);
	}
	
   public WebElement clickcity()  {
		
		return driver.findElement(city);
	}
	
   public WebElement clickto()  {
		
		return driver.findElement(to);
	}
	
   public WebElement clicktocity()  {
		
		return driver.findElement(tocity);
	}

   public WebElement clickqunta()  {
		
		return driver.findElement(qunta);
	}
   
   public WebElement clickclasses()  {
		
		return driver.findElement(classes);
	}
   
   public List<WebElement> clickchoose()  {
		
		return driver.findElements(choose);
	}
   
   public WebElement clickdate()  {
		
		return driver.findElement(date);
	}
   
   public WebElement clickplus()  {
		
		return driver.findElement(plus);
	}
   
   public WebElement matchtitle()  {
		
		return driver.findElement(title);
	}
   
   public List<WebElement> clickpickdate()  {
		
		return driver.findElements(pickdate);
	}
   
   public WebElement clickselect()  {
		
		return driver.findElement(select);
	}
   
   public List<WebElement> clickone()  {
		
		return driver.findElements(selectone);
	}
   
   public WebElement clicksearch()  {
		
		return driver.findElement(search);
	}
   
   public WebElement matchstring()  {
		
		return driver.findElement(string);
	}
  
}




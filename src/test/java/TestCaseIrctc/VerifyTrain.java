package TestCaseIrctc;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import ObjactPage.PageObjectIrctc;
import ResourceIrctc.BaseClassIrctc;
import ResourceIrctc.CommanMethod1;
import ResourceIrctc.Constants;

public class VerifyTrain extends BaseClassIrctc {

	@Test
	public void searchtrain()   {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		PageObjectIrctc obj=new PageObjectIrctc((WebDriver) driver);
	
		obj.clickcancal().click();
        obj.clickfrom().sendKeys(Constants.from);	
        obj.clickcity().click();
        obj.clickto().sendKeys(Constants.to);
        obj.clicktocity().click();
        obj.clickqunta().click();
        obj.clickclasses().click();
        CommanMethod1.handleselection(obj.clickchoose(), "Flexible With Date");
        obj.clickdate().click();
        
        String title="";
        while(!(title.equalsIgnoreCase("March2023")))    {
        	
        	obj.clickplus().click();
        	obj.matchtitle();
        	
        	title=obj.matchtitle().getText();
        }	
        	
        CommanMethod1.handleselection(obj.clickpickdate(), "2");
        	
        	obj.clickselect().click();
        	
        CommanMethod1.handleselection(obj.clickone(), "AC First Class (1A)");	
        	
        	obj.clicksearch().click();
        	
        CommanMethod1.handleassertion(obj.matchstring().getText(), "JOURNEY CLASS", "search train is failed");	
        	
        	
        	
        	
        }
        
        
        
	}
 

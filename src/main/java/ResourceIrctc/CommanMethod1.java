package ResourceIrctc;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

   public class CommanMethod1 {
	
	public static void handleselection(List<WebElement> az,String idx)  {
		
		List<WebElement> as=az;
		
	  for(WebElement v1:as)    {
		  
		  
    if(v1.getText().equalsIgnoreCase(idx))		{	
    	 
			  v1.click();
			  break;
		  }
	  }
	}  
	
	public static void handleassertion(String actual,String expected, String message )   {
		
		SoftAssert s=new SoftAssert();
		
		String ac=actual;
		String ep=expected;
		
		s.assertEquals(ac, ep, message);
		
		s.assertAll();
		
	}

}

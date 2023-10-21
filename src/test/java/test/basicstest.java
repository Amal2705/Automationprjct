package test;

import org.testng.annotations.Test;

import Base.URL;
import Page.basicslogin;
import excelsheet.excelcall;


public class basicstest extends URL
{
@Test
public void login() throws InterruptedException
{
	basicslogin ob=new basicslogin(driver);
	String xl="C:\\Users\\ahi78\\OneDrive\\Desktop\\Basicsfile.xlsx";
	String sheet="Basicscred";
	int rowcount=excelcall.getrowcount(xl, sheet);
	for(int i=1;i<=rowcount;i++)
	{
		String Username= excelcall.getcellvalue(xl, sheet, i, 0);
		String password=excelcall.getcellvalue(xl, sheet, i, 1);
		ob.setvalues(Username, password);
		ob.clicksignin();
		driver.navigate().refresh();
		
		
		
		
		
		
		
	}
	
	ob.searching("shirts");
	Thread.sleep(2000);
	ob.shirtclick();
	Thread.sleep(2000);
	ob.sizeandcart();
	Thread.sleep(2000);
	ob.tocheckout();	
	ob.toreturncart();
	
	
	
	
	
	
	
	
	
	
	
	
}
}

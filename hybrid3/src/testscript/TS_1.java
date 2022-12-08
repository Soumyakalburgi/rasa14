package testscript;

import java.io.IOException;
import org.testng.Assert;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericscripts.Base_Test;
import genericscripts.GenericDDTreadexcel;

import pomscript.pomfblogin;


public class TS_1 extends Base_Test{
	@Test
	public void script() throws EncryptedDocumentException, IOException
	{
		String username=GenericDDTreadexcel.getData("Sheet1",0,0);
		String password=GenericDDTreadexcel.getData("Sheet1",1,0);
		
		pomfblogin pmc=new pomfblogin(driver);
		pmc.userName(username);
		pmc.password(password);
		Assert.fail();
		pmc.login();
		
		
	}

}

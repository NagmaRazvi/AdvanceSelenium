package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genaricLib.stepGroup;
import pomPages.SkillraryDemoLogin;
import pomPages.SkillraryLogin;
import pomPages.Testing;

public class Testcase2 extends stepGroup {
	
	@Test
	public void tc2() throws IOException {
		
		SkillraryLogin l=new SkillraryLogin(driver);
		l.gearsButton();
		l.demoskillraryapp();
		
		//demologin
		SkillraryDemoLogin sd=new SkillraryDemoLogin(driver);
		driverutilies.switchTab(driver);
		driverutilies.dropdown(sd.getCoursedd(), pdata.getPropertydata(null));
		
		Testing t=new Testing(driver);
		driverutilies.draganddrop(driver, t.getSelenium(),t.getCart());
		Point loc =t.getFacebook().getLocation();
		int x=loc.getX();
		int y=loc.getY();
		
		
		driverutilies.scrollbar(driver, x, y);
		t.facebookicon();
	}
	
	

}

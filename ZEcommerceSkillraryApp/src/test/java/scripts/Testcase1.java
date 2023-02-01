package scripts;

import org.testng.annotations.Test;

import genaricLib.stepGroup;
import pomPages.SkillraryDemoLogin;
import pomPages.SkillraryLogin;

public class Testcase1 extends stepGroup{
	
	@Test
	public void tc1() {
		//login
		SkillraryLogin l=new SkillraryLogin(driver);
		l.gearsButton();
		l.demoskillraryapp();
		
		//demologin
		SkillraryDemoLogin sd=new SkillraryDemoLogin(driver);
		driverutilies.switchTab(driver);
		driverutilies.mouseHover(driver, sd.getCoutrsetab());
		sd.seleniumtrainingntn();
		
		//addtocart
	}
	

}

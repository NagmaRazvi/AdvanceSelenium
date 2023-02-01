package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLogin {
	
	
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearstab;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement demoapp;
	
	public SkillraryLogin(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void gearsButton() {
		gearstab.click();
	}
	public void demoskillraryapp() {
		demoapp.click();
	}
	

}

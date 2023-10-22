package Pages;

import Utilities.DriverCenter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LocatorPage extends Parent{
    public LocatorPage() {
        PageFactory.initElements(DriverCenter.getDriver(), this);

    }

    @FindBy(css="input[formcontrolname='username']")
    public WebElement username;

    @FindBy(css="input[formcontrolname='password']")
    public WebElement password;

    @FindBy(css="button[aria-label='LOGIN']")
    public WebElement loginbutton;

    @FindBy(css="span[class='mat-mdc-tooltip-trigger logo-text']")
    public WebElement textTechnoStudy;

    @FindBy(xpath="//ms-add-button[contains(@tooltip,'ADD')]//button")
    public WebElement addButton;

    @FindBy(xpath="//ms-save-button/button")
    public WebElement saveButton;
    @FindBy(xpath="//mat-form-field//input[@data-placeholder='Name']")
    public WebElement searchInput;

    @FindBy(xpath="//ms-search-button//button")
    public WebElement searchButton;

    @FindBy(xpath="(//ms-delete-button//button)[1]")
    public WebElement deleteImageBtn;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement deleteDialogBtn;

    @FindBy(xpath="//div[contains(text(),'successfully')]")
    public WebElement successMessage;

    @FindBy(xpath="(//span[text()='Setup'])[1]")
    public WebElement Setup;

    @FindBy(xpath = "//span[text()='Parameters']")
    public WebElement Parameters;

    @FindBy(xpath = "//span[text()='Bank Accounts']")
    public WebElement BankAccounts;

    @FindBy(xpath = "//span[text()='Bank Accounts']")
    public WebElement editButton;


    public WebElement getWebELement (String Element) {
        switch (Element) {
            case "addButton": return this.addButton;
            case "saveButton": return this.saveButton;
            case "BankAccounts": return this.BankAccounts;

        }
        return null;
    }
    public void DeleteItem (String SearchText) {
    mySendKeys(searchInput,SearchText);
    myClick(searchButton);

    wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"),0));

    myClick(deleteImageBtn);
    myClick(deleteDialogBtn);

    }







}

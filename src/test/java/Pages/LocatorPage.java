package Pages;

import Utilities.DriverCenter;
import org.openqa.selenium.support.PageFactory;

public class LocatorPage extends Parent{
    public LocatorPage() {
        PageFactory.initElements(DriverCenter.getDriver(), this);

    }
}

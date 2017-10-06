package StepDefinitions;

import Base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;

/**
 * Created by arianapaz on 10/5/17.
 */
public class CcDenmarkSteps extends BaseUtil{
    private  BaseUtil base;

    public CcDenmarkSteps(BaseUtil base) {
        this.base = base;
    }

    @Given("^I land on 'Compare Denmark' site$")
    public void iLandOnCompareDenmarkSite() throws Throwable {

        System.out.println("Navigating to Compare ");
        base.Driver.navigate().to("https://www.samlino.dk/");

    }
}

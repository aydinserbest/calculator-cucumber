package calculator.actions.navigate;

import net.serenitybdd.core.steps.UIInteractionSteps;

public class NavigateActions extends UIInteractionSteps {
    public void toTheCalculatorApplication() {
        openUrl("https://juliemr.github.io/protractor-demo/");
    }
}

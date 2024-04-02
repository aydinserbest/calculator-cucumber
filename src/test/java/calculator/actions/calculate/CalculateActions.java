package calculator.actions.calculate;

import calculator.domain.MathOperation;
import com.paulhammant.ngwebdriver.ByAngular;
import net.serenitybdd.core.steps.UIInteractionSteps;
import org.openqa.selenium.By;

import static calculator.actions.calculate.CalculatorForm.*;

public class CalculateActions extends UIInteractionSteps {

    public void theAnswerTo(MathOperation calculations) {
        $(LEFT_OPERAND).type(calculations.getLeftOperand());
        $(OPERATOR).selectByVisibleText(calculations.getOperator());
        $(RIGHT_OPERAND).type(calculations.getRightOperand());
        $(GO_BUTTON).click();
        waitForAngularRequestsToFinish();
    }

    public String answer() {
        return $(ANSWER).getText();
    }
}

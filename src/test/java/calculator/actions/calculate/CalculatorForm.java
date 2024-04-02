package calculator.actions.calculate;

import com.paulhammant.ngwebdriver.ByAngular;
import org.openqa.selenium.By;

public class CalculatorForm {
    public static By LEFT_OPERAND = ByAngular.model("first");
    public static By OPERATOR = ByAngular.model("operator");
    public static By RIGHT_OPERAND = ByAngular.model("second");
    public static By GO_BUTTON = By.id("gobutton");
    public static By ANSWER = By.tagName("h2");
}

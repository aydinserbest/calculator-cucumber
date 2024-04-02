package calculator.stepdefinitions;

import calculator.actions.calculate.CalculateActions;
import calculator.actions.navigate.NavigateActions;
import calculator.domain.MathOperation;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class PerformCalculationsStepDefinitions {
    @Steps
    NavigateActions navigate;

    @Given("Matt a maths student has opened the calculator")
    public void matt_a_maths_student_has_opened_the_calculator() {
        navigate.toTheCalculatorApplication();
    }

    @DataTableType
    public MathOperation mathOperation(Map<String, String> data) {
        return new MathOperation(
                data.get("Left Operand"),
                data.get("Right operand"),
                data.get("Operator")
        );
    }
    @Steps
    CalculateActions calculate;
    @When("Matt performs the following calculations:")
    public void matt_performs_the_following_calculations(List<MathOperation> calculations) {
        calculations.forEach(
                calculation -> calculate.theAnswerTo(calculation)
        );
    }



    @Then("He should see a result of {string}")
    public void he_should_see_a_result_of(String expectedValue) {
        assertThat(calculate.answer()).isEqualTo(expectedValue);

    }

}


//    public void matt_performs_the_following_calculations(List<Map<String, String>> calculations) {
//        System.out.println(calculations);
//    }

//    public void matt_performs_the_following_calculations(DataTable dataTable) {
//        System.out.println(dataTable.asMaps());
//    }
package calculator.stepdefinitions;

import calculator.domain.MathOperation;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class PerformCalculationsStepDefinitions {

    @Given("Matt a maths student has opened the calculator")
    public void matt_a_maths_student_has_opened_the_calculator() {

    }
    @DataTableType
    public MathOperation mathOperation(Map<String, String> data) {
        return new MathOperation(
                data.get("Left Operand"),
                data.get("Right operand"),
                data.get("Operator")
        );
    }
    @When("Matt performs the following calculations:")
    public void matt_performs_the_following_calculations(List<MathOperation> calculations) {
        System.out.println(calculations);
    }

    @Then("He should see a result of {string}")
    public void he_should_see_a_result_of(String string) {

    }

}


//    public void matt_performs_the_following_calculations(List<Map<String, String>> calculations) {
//        System.out.println(calculations);
//    }

//    public void matt_performs_the_following_calculations(DataTable dataTable) {
//        System.out.println(dataTable.asMaps());
//    }
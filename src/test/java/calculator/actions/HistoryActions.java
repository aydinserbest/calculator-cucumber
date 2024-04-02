package calculator.actions;

import com.paulhammant.ngwebdriver.ByAngular;
import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractionSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HistoryActions extends UIInteractionSteps {
    public List<Map<String, String>> displayedOperations() {
        // This list will contain a map for each row.
        List<Map<String, String>> operations = new ArrayList<>();

        for (WebElementFacade row : findAll(By.cssSelector("tbody > tr"))) {
            Map<String, String> operation = new HashMap<>();

            // To get the column values, find each 'td' element and the 'span's within them.
             List<String> cells = row.thenFindAll(("td")).texts();

            // You can process based on time; for example, I'm only taking the 2nd and 3rd columns here.
            operation.put("Expression", cells.get(1));
            operation.put("Result", cells.get(2));

            // Add each row to the operations list.
            operations.add(operation);
        }
        return operations;

    }
}

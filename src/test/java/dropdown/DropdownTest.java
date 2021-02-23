package dropdown;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTest extends BaseTest {

    @Test
    public void testSelectedOption(){
       var dropDownPage = homePage.clickDropdown();
       String option = "Option 1";
       dropDownPage.selectFormDropdown(option);
       var selectedOptions = dropDownPage.getSelectedOptions();
       assertEquals(selectedOptions.size(), 1, "Iconrrect number of selections");
       assertTrue(selectedOptions.contains(option), "Option not selected");
    }
}

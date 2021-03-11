package slider;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SliderTest extends BaseTest {

    @Test
    public void testSlideToWholeNumber(){
        String VALUE = "4";
        var sliderPage = homePage.clickHorizontalSlider();
        sliderPage.setSliderValue(VALUE);
        assertEquals(sliderPage.getSliderValue(), VALUE, "Slider value is incorrect");
    }

}


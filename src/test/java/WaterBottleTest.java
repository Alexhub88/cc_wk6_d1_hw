import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    private WaterBottle myWaterBottle;

    @Before
    public void before() {
            myWaterBottle = new WaterBottle(100);
        }

    @Test
    public void hasVolume() {
        assertEquals(100, myWaterBottle.getVolume());
    }

    @Test
    public void drinksCorrectly() {
        myWaterBottle.drink();
        assertEquals(90, myWaterBottle.getVolume());
    }

    @Test
    public void emptiesCorrectly() {
       myWaterBottle.empty();
       assertEquals(0, myWaterBottle.getVolume());
    }

    @Test
    public void fillsCorrectly() {
       myWaterBottle.empty();
       assertEquals(0, myWaterBottle.getVolume());
       myWaterBottle.fill();
       assertEquals(100, myWaterBottle.getVolume());
    }

}

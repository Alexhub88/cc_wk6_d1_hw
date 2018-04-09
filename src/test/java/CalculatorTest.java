import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


    public class CalculatorTest {

        private Calculator myCalculator;

        @Before
        public void before() {
            myCalculator = new Calculator();
        }

        @Test
        public void addsCorrectly() {
            assertEquals(35, myCalculator.add(12,23));
        }

        @Test
        public void subtractsCorrectly() {
            assertEquals(11, myCalculator.subtract(23,12));
        }

        @Test
        public void multipliesCorrectly() {
            assertEquals(48, myCalculator.multiply(6,8));
        }

        @Test
        public void dividesCorrectly() {
            assertEquals(12, myCalculator.divide(48,4));
        }

}

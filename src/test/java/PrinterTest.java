import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer myPrinter;

    @Before
    public void before() {
        myPrinter = new Printer(100, 75);
    }

    @Test
    public void hasNumberSheetsLeft() {
       assertEquals(100, myPrinter.getNumSheetsLeft());
    }

    @Test
    public void printsCorrectly() {
        myPrinter.print(6,5);
        assertEquals(70, myPrinter.getNumSheetsLeft());
    }

    @Test
    public void refillsCorrectly() {
        myPrinter.print(6,5);
        assertEquals(70, myPrinter.getNumSheetsLeft());
        myPrinter.refill(50);
        assertEquals(120, myPrinter.getNumSheetsLeft());
    }

    @Test
    public void hasTonerVolume() {
        assertEquals(75, myPrinter.getTonerVolume());
    }

    @Test
    public void tonerReducesCorrectly() {
        myPrinter.print(6,5);
        assertEquals(45, myPrinter.getTonerVolume());
    }

}

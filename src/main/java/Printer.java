public class Printer {

    private int numSheetsLeft;
    private int tonerVolume;

    public Printer(int numSheetsLeft, int tonerVolume) {
        this.numSheetsLeft = numSheetsLeft;
        this.tonerVolume = tonerVolume;
    }

    public int getNumSheetsLeft() {
        return this.numSheetsLeft;
    }

    public void print(int pages, int copies) {
        if (this.numSheetsLeft >= pages * copies) {
            this.numSheetsLeft -= pages * copies;
            this.tonerVolume -= pages * copies;
        };
    }

    public void refill(int refillPages) {
            this.numSheetsLeft += refillPages;
    }

    public int getTonerVolume() {
        return this.tonerVolume;
    }

}

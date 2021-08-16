package variant2;

public class IllegalISBN extends Exception{

    private int cntDigits;

    public IllegalISBN(int cntDigits) {
        this.cntDigits = cntDigits;
    }
}

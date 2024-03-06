public class InsufficientFundsException extends Exception  {
    public InsufficientFundsException (String message){
        super("Insufficient Funds. Minimum balance required : $100.0");
    }
}

package dz_seminar_3.exception;

public class DataAmountException extends RuntimeException {
    
    public DataAmountException (){
        super("Invalid amount of data entered. Amount of data must be six!");
    }
}

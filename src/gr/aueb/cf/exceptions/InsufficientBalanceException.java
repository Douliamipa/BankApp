package gr.aueb.cf.exceptions;

public class InsufficientBalanceException extends Exception {
    private  static final long serialVersionUniqueID = 1L;

    public InsufficientBalanceException(double balance , double amount){
        super("Insufficient Ballance :" + balance + "for amount " + amount);
    }

}

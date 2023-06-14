package gr.aueb.cf.model;

public class JoinedAccount extends  Account{
    private User secondHolder = new User();

    public JoinedAccount(){}

    public JoinedAccount(User holder, String iban, double balance, User secondHolder) {
        super(holder, iban, balance);
        this.secondHolder = secondHolder;
    }

    public User getSecondHolder() {
        return secondHolder;
    }

    public void setSecondHolder(User secondHolder) {
        this.secondHolder = secondHolder;
    }

    @Override
    public String toString() {
        return "JoinedAccount{" + "First Holder"+ getHolder()+
                "secondHolder=" + secondHolder + "IBAN"+ getIban() + "Blance "+ getBalance() +
                '}';
    }

    @Override
    protected boolean isSsnValid(String ssn) {
        return super.isSsnValid(ssn) || secondHolder.getSsn().equals(ssn);
    }


}

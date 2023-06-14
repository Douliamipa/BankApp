package gr.aueb.cf.model;

public class User extends IdentifiableEntity {
    private String firstname;
    private String lastaname ;
    private String ssn ;

    public User(){}

    public User(String firstname, String lastaname, String ssn) {
        this.firstname = firstname;
        this.lastaname = lastaname;
        this.ssn = ssn;
    }

    //Copy constructor

    public User(User user){
        firstname = user.getFirstname();
        lastaname = user.getLastaname();
        ssn = user.getSsn();
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastaname() {
        return lastaname;
    }

    public void setLastaname(String lastaname) {
        this.lastaname = lastaname;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstname='" + firstname + '\'' +
                ", lastaname='" + lastaname + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}

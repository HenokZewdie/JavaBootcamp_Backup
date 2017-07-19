package ATMPackage;


public class index {
    private int Accountid;
    private double deposit,  balance;
    private String fName;


    public int getAccountid() {
        return Accountid;
    }

    public void setAccountid(int accountid) {
        Accountid = accountid;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }
}
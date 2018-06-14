import java.util.*;

public class Account {
    private String userName;
    private int accountNumber;
    private double balance;
    private int pinNumber;
    private double deposit;
    private double withdrew;


    //use hashmap to store account user name and pin
    HashMap<String, Integer> account = new HashMap<>();

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;

    }

    public double getWithdrew() {
        return withdrew;
    }

    public void setWithdrew(double withdrew) {
        this.withdrew = withdrew;
    }

    public void setAccount(HashMap<String, Integer> account) {
        this.account = account;
   }

    public Account() {
        account.put("1", 1);
       account.put("2", 2);
        account.put("3", 3);
       balance = 1000;

    }
    public double balance() {
        balance = balance - withdrew + deposit;
       return balance;
   }
}

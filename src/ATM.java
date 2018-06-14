import java.util.*;


public class ATM {


    static Scanner keyboard = new Scanner(System.in);
    static String acctNum, pwd;
    static boolean result;
    static double oldBalance=500;
    static double newBalance, deposit, withdraw;
    static int choose;
    static double balance;



    public static void login() {




            System.out.println("Enter your account number");
            acctNum = keyboard.nextLine();

            System.out.println("Enter your account password");
            pwd = keyboard.nextLine();

            result = checkID();
            if (result==false) {
                int run=1;
                if(run<3)
                {
                    System.out.println("Enter your account number");
                    acctNum = keyboard.nextLine();

                    System.out.println("Enter your account password");
                    pwd = keyboard.nextLine();

                    result = checkID();
                    run++;
                }
                else
                {
                    System.out.println("MAXIMUM TRIES EXCEEDED");
                }

            } else {
                menu();

            }

        }


    public static boolean checkID() {
        int accountNumer= 1982;
        int pin = 1224;
        if (accountNumer== 1982 && pin== 1224 ){
            //login();
            return true;
        }
        else
        {
            return false;
        }


    }

    public static int menu() {


        System.out.println("Choose one of the following: \n1.Display Balance\n2.Deposit\n3.Withdraw\n4.Log Out");
        choose = keyboard.nextInt();

        if (choose == 1) {// 1. Display Balance
            System.out.println(displayBalance());
            menu();
            return 1;

        }
        if (choose == 2) {// 2. Deposit
            deposit();
            menu();
            return 2;

        }
        if (choose == 3) {// 3. Withdraw
            withdraw();
            menu();
            return 3;

        }
        if (choose == 4) {// 4. Log out
            System.out.println("You are logged out.");
            return 4;

        }
        if (choose <= 5) {// type in anything greater than 4 and you will get a
            // system error
            System.out.println("System Error");
            menu();
            return 5;
        }
        if (choose >= 1) {// type in anything less than 1 and you will get a
            // system error
            System.out.println("System Error");
            menu();
            return 6;
        }
        return choose;

    }

    public static double deposit() {
        System.out.println("How much would you like to deposit?");
        double deposit = keyboard.nextDouble();
        double newBalance = oldBalance+deposit;
        System.out.println("Your new balance is : $"+newBalance);// deposit money into balance
        return newBalance;
    }

    public static String displayBalance() {
        //oldBalance = 500.00;
        String display="Your current balance: $" + oldBalance;
        return display;
    }

    public static double withdraw() {
        System.out.println("How much would you like to withdraw?");
        withdraw = keyboard.nextDouble();
        double newBalance = oldBalance-withdraw;
        System.out.println("After widthrawl your current balance is: "+newBalance);// withdraw money from balance
        return newBalance;
    }
}
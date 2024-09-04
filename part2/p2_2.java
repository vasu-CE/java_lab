
import java.util.*;

class account {

    Scanner sc = new Scanner(System.in);
    int acc_id;
    double acc_balance;
    double aunnualinterestrate;
    double monthinterest;
    Date datecreate;

    public account() {
        acc_id = 0;
        acc_balance = 500;
        aunnualinterestrate = 0.07;
        datecreate = new Date();
    }

    public Date getdate() {
        return datecreate;
    }

    public int Accid() {
        System.out.print("Enter account id:");
        acc_id = sc.nextInt();
        return acc_id;
    }

    public double Acc_balance() {
        System.out.print("Enter initial amount to deposit:");
        acc_balance = sc.nextDouble();
        return acc_balance;
    }

    public double getmonthlyinterestrate() {
        return 0.07 / 12;
    }

    public double getmontlyinterest() {
        double x = getmonthlyinterestrate();
        monthinterest = acc_balance / x;
        return monthinterest;
    }

    public double withdraw(double withammount) {

        acc_balance = acc_balance - withammount;
        return acc_balance;
    }

    public int searchacc(int searchid) {
        if (searchid == acc_id) {

            return 1;
        }
        return -1;
    }

    public void display() {
        System.out.println("Account holder id : " + acc_id);
        System.out.println("Balance : " + acc_balance);
        System.out.println("Annual interest rate : " + ((float) aunnualinterestrate * 100) + "%");
        System.out.println("Account creation time : " + getdate());

    }

    public double deposite(double depammount) {
        acc_balance = acc_balance + depammount;
        return depammount;
    }

};

public class p2_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number account :");
        n = sc.nextInt();
        account a[] = new account[n];
        char ch='y';
        int choice;
        int i = 0;
        while (ch=='y' || ch=='Y') {
            System.out.println("Enter 1 to create a new account");
            System.out.println("Enter 2 to withdraw ammount");
            System.out.println("Enter 3 to deposite ammount");
            System.out.println("Enter 4 to see account detail");
            System.out.println("Enter 5 to exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    for (int j = 0; j < n; j++) {
                        a[j] = new account();
                        a[j].Accid();
                        a[j].Acc_balance();
                        System.out.println("Account created successfully");
                    }
                    break;
                case 2:
                    double withammount;
                    int searchid;
                    System.out.print("Enter the account id:");
                    searchid = sc.nextInt();
                    System.out.print("Enter the withdraw ammount:");
                    withammount = sc.nextDouble();

                    for (int j = 0; j < n; j++) {
                        int x = a[j].searchacc(searchid);

                        if (x == 1) {
                            a[j].withdraw(withammount);
                            System.out.println("Withdraw successfully");
                        }
                    }
                    break;
                case 3:
                    double depammount;
                    int searchId;
                    System.out.print("Enter the account id:");
                    searchId = sc.nextInt();
                    System.out.print("Enter the deposite ammount:");
                    depammount = sc.nextDouble();
                    for (int j = 0; j < n; j++) {
                        int x = a[j].searchacc(searchId);
                        if (x == 1) {
                            a[j].deposite(depammount);
                            System.out.println("Deposite successfully");
                        }
                    }
                    break;
                case 4:
                    int SearchId;
                    System.out.print("Enter the account id:");
                    SearchId = sc.nextInt();
                    for (int j = 0; j < n; j++) {
                        int x = a[j].searchacc(SearchId);
                        if (x == 1) {
                            a[i].display();
                        }
                    }
                    break;
                case 5:
                    break;
            }
            System.out.print("Do you want another(y/n)? : ");
            ch = sc.next().charAt(0);
        }
        System.out.println("Prepared by 23CE054");
    }
}

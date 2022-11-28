import java.util.Objects;
import java.util.Scanner;

public class SimCard {
    private double balance;
    private double costRing;
    private double costSms;
    private double costMobileInternet;

    public SimCard(double balance, double costRing, double costSms, double costMobileInternet) {
        this.balance = balance;
        this.costRing = costRing;
        this.costSms = costSms;
        this.costMobileInternet = costMobileInternet;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getCostRing() {
        return costRing;
    }

    public void setCostRing(double costRing) {
        this.costRing = costRing;
    }

    public double getCostSms() {
        return costSms;
    }

    public void setCostSms(double costSms) {
        this.costSms = costSms;
    }

    public double getCostMobileInternet() {
        return costMobileInternet;
    }

    public void setCostMobileInternet(double costMobileInternet) {
        this.costMobileInternet = costMobileInternet;
    }

    public void buyInternet() {
        Scanner sc = new Scanner(System.in);
        System.out.println("HOW MANY GB YOU WANT TO BUY?");
        int buyGb = sc.nextInt();
        if (balance - (costMobileInternet * buyGb) < 0)
            System.out.println("NOT ENOUGH BALANCE");
        else balance = balance - (costMobileInternet * buyGb);

    }

    public void toSms() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("WRITE STOP TO STOP MESSAGING");

        for (int i = 0; balance >= costSms; i++) {
            String message = scanner.nextLine();
            if (Objects.equals(message, "STOP")) {
                break;
            } else if (balance < costSms) {
                System.out.println("NOT ENOUGH BALANCE");
                break;
            } else {
                System.out.println(message);
                balance = balance - costSms;
            }


        }


    }

    public void toRing() {

        Scanner sc = new Scanner(System.in);
        System.out.println("WHAT TIME DO YOU TALK (MIN) ?");
        int time = sc.nextInt();
        if (0 > this.balance - (costRing * time)) System.out.println("BALANCE IS TOO LOW");
        else {
            this.balance = this.balance - (costRing * time);
        }

    }
}
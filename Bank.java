//Реализовать класс Bank, имитирующий работу банковского учреждения.
// Сделать закрытые поля: баланс филиала, общий баланс банка (сумма балансов всех открытых филиалов).
// Сделать методы: узнать баланс филиала, узнать баланс банка, принять депозит, выдать депозит (с процентами), выдать кредит, принять платежи по кредиту.

import java.util.Scanner;

public class Bank {

    private static double branchBalance;
    private static double bankBalanceTotal;
    private static double range;
    private static double deposit;
    private static double credit;
    private static int months;
    private static double creditRange;
    private static double creditPayments;


    public static double getBranchBalance() {
        return branchBalance;
    }

    public static void setBranchBalance(double branchBalance) {
        Bank.branchBalance = branchBalance;
    }

    public static double getBankBalanceTotal() {
        return bankBalanceTotal;
    }

    public static void setBankBalanceTotal(double bankBalanceTotal) {
        Bank.bankBalanceTotal = bankBalanceTotal;
    }

    public static double getRange() {
        return range;
    }

    public static void setRange(double range) {
        Bank.range = range;
    }

    public static double getDeposit() {
        return deposit;
    }

    public static void setDeposit(double deposit) {
        Bank.deposit = deposit;
    }

    public static double getCredit() {
        return credit;
    }

    public static void setCredit(double credit) {
        Bank.credit = credit;
    }

    public static int getMonths() {
        return months;
    }

    public static void setMonths(int months) {
        Bank.months = months;
    }

    public static double getCreditRange() {
        return creditRange;
    }

    public static void setCreditRange(double creditRange) {
        Bank.creditRange = creditRange;
    }

    public static double getCreditPayments() {
        return creditPayments;
    }

    public static void setCreditPayments(double creditPayments) {
        Bank.creditPayments = creditPayments;
    }

    public static void receiveCreditPayments(){
        System.out.println("Please input the amount for your credit");
        Scanner scanner = new Scanner(System.in);
        double cash = scanner.nextDouble();
        creditPayments += cash;
        if (creditPayments > (credit + creditRange))
            System.out.println("We are so sorry! Your credit has been paid.");

    }

    public static void issueCredit(){
        System.out.println("Please input the amount for your credit");
        Scanner scanner = new Scanner(System.in);
        credit = scanner.nextDouble();
        System.out.println("Please input the period, months");
        months = scanner.nextInt();
        range = 12;
        creditRange = (credit * months / 12 * range / 100);

    }

    public static void createDeposit() {
        System.out.println("Please input the amount for your deposit");
        Scanner scanner = new Scanner(System.in);
        deposit = scanner.nextDouble();
        System.out.println("Please input the period, months");
        months = scanner.nextInt();
        range = 12;

    }

    public static double issueDeposit() {
        return deposit + (deposit * months / 12 * range / 100);
    }


    public static void main(String[] args) {

        Bank.createDeposit();
        System.out.println(Bank.issueDeposit());
        Bank.issueCredit();
        Bank.receiveCreditPayments();
        Bank.receiveCreditPayments();
    }
}
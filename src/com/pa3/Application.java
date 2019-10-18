package com.pa3;

public class Application {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();

        saver1.setSavingsBalance(2000.00);
        saver1.modifyInterestRate(0.04);
        saver1.setSaverName("saver1");
        saver1.setMonth(12);
        saver1.calculateMonthlyInterest();
        System.out.println("Setting interest rate to 5.0%");
        saver1.modifyInterestRate(0.05);
        saver1.setMonth(1);
        saver1.calculateMonthlyInterest();


        saver2.setSavingsBalance(3000.00);
        saver2.modifyInterestRate(0.04);
        saver2.setSaverName("saver2");
        saver2.setMonth(12);
        saver2.calculateMonthlyInterest();
        System.out.println("Setting interest rate to 5.0%");
        saver2.modifyInterestRate(0.05);
        saver2.setMonth(1);
        saver2.calculateMonthlyInterest();
    }
}

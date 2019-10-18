package com.pa3;

public class SavingsAccount {
    private static double annualInterestRate;
    private static double savingsBalance;
    private static String saverName;
    private static int monthsSaving;

    public void setSavingsBalance(double savings)
    {
        savingsBalance = savings;
    }
    public void setSaverName(String name)
    {
        saverName = name;
    }
    public void setMonth(int month)
    {
        monthsSaving = month;
    }
    public void modifyInterestRate(double interest)
    {
        annualInterestRate = interest;
    }
    public void calculateMonthlyInterest()
    {
        int i;

        System.out.println();
        System.out.println("Savings Per Month of " + saverName);
        for (i = 0; i < monthsSaving; i++)
        {
            savingsBalance += (savingsBalance * annualInterestRate) / 12;
            System.out.print("Month " + (i + 1));
            System.out.printf(" $%.2f\n", savingsBalance);
        }
    }



}

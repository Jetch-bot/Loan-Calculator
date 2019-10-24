package com.Eddie;

public class Main {

    public static void main(String[] args) {
        int principal = (int) Console.readNumber("Principal: ", 1000, 1_000_000);
        float annualInterest = (float) Console.readNumber ("Annual_Interest_Rate: ", 1, 30);
        byte years = (byte) Console.readNumber ("Period (years): ", 1, 30);

        var calculator = new MortgageCalculator(principal, annualInterest, years);

        var report = new MortgageReport(calculator);
        report.printMortage();
        report.printPaymentSchedule();
    }
}



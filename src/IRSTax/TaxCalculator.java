package IRSTax;

import java.util.Scanner;
/*
 Create a program to calculate federal and state tax based on income. Follow IRS rules

 Use enums in tax calculator, with the minimum, maximum range and tax rate for each range

Use separate classes for separation of concern

 */

public class TaxCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income");
        double userIncome = Double.parseDouble(sc.nextLine());
        double tax = calculateTax(userIncome);
        System.out.println("Your total tax is: "+tax);
    }

    public static double calculateTax(double userIncome){
        double federalExemption= 11327.0;
        double provincialExemption= 9863.0;
        double federalTax = 0.0;
        double ExemptIncome =  (userIncome - federalExemption);


        if (userIncome < 30000) {federalTax = ExemptIncome*0.15;}
        else if (userIncome < 80000 ) {federalTax = ExemptIncome*0.24;}
        else if (userIncome < 200000 ) {federalTax = ExemptIncome*0.32;}
        else if (userIncome > 80000 ) {federalTax = ExemptIncome*0.37;}

        double provincialTax= (userIncome - provincialExemption) * 0.0505;

        return federalTax + provincialTax;

    }
}

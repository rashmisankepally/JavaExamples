import java.util.Scanner;
/*
 Create a program to calculate federal and state tax based on income. Follow IRS rules

 Use enums in tax calculator, with the minimum, maximum range and tax rate for each range

Use separate classes for separation of concern

Create abstract classes with some concrete and abstract methods

Create multiple subclasses

Create interfaces and implement them

Create service as well as domain entities

Create all types of nested inner classes and with right examples

Create Wrapper classes for int, float and boolean, try to do autoboxing
 */

public class TaxCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income");
        double userIncome = Double.parseDouble(sc.nextLine());
        double tax = calculateTax(userIncome);
        System.out.println("Your total tax is: "+tax);
    }

    static double calculateTax(double userIncome){
        double federalExemption= 11327.0;
        double provincialExemption= 9863.0;
        double federalTax =  (userIncome - federalExemption) * 0.15;
        double provincialTax= (userIncome - provincialExemption) * 0.0505;
        return federalTax + provincialTax;

    }
}

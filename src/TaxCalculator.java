import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income");
        double userIncome = Double.parseDouble(sc.nextLine());
        double tax = calculateTax(userIncome);
        System.out.println("Your total tax is: "+tax);
    }

    static double calculateTax(double userIncome){
        double uIncome= userIncome;
        double federalExemption= 11327.0;
        double provincialExemption= 9863.0;
        double federalTax =  (uIncome- federalExemption) * 0.15;
        double provincialTax= (uIncome - provincialExemption) * 0.0505;
        double totalTax= federalTax + provincialTax;
        return totalTax;

    }
}

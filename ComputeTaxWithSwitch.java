/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computetaxwithswitch;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class ComputeTaxWithSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
         // Prompt the user to enter filing status
         
         
         String message = "Welcome to Kenya Revenue Authothority";
        System.out.println("Hello  " + message.toUpperCase() + " is " + message.length());
         
         
         
   System.out.print("(0-single filer, 1-married jointly or " +
           "qualifying widow(er), 2-married separately, 3-head of " +"household) Enter the filing status: ");
    
       int status = input.nextInt();
        System.out.print("Enter the basic salary: ");
             double basicSalary = input.nextDouble();
        System.out.print("Enter the entertainment allowance: ");
             double entertainment = input.nextDouble();
        System.out.print("Enter the house allowance: ");
             double house = input.nextDouble();
       System.out.print("Enter the tranport allowance: ");
             double transport = input.nextDouble();
           
  double income = basicSalary + entertainment + house + transport ;
  
  System.out.print("The taxable income is :" +income);
             
  
     // Compute tax
     double tax = 0;
     
        switch (status) {
            case 0:
                // Compute tax for single filers
                if (income <= 8350)
                    tax = income * 0.10;
                else if (income <= 33950)
                    tax = 8350 * 0.10 + (income - 8350) * 0.15;
                else if (income <= 82250)
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +(income - 33950) * 0.25;
                else if (income <= 171550)
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +(82250 - 33950) * 0.25 + (income - 82250) * 0.28;
                
                else if (income <= 372950)
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +(82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +(income - 171550) * 0.33;
                else
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +(82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +(372950 - 171550) * 0.33 + (income - 372950) * 0.35;
                break;
            case 1:
                // Compute tax for married file jointly or qualifying widow(er)
                if (income <= 16700)
                    tax = income * 0.10;
                else if (income <= 67900)
                    tax = 16700 * 0.10 + (income - 67900) * 0.15;
                else if (income <= 137050)
                    tax = 16700 * 0.10 + (67900 -16700 ) * 0.15 +(income - 67900) * 0.25;
                else if (income <= 208850)
                    tax = 16700 * 0.10 + (67900 - 16700) * 0.15 +(137050 - 67900) * 0.25 + (income - 137050) * 0.28;
                
                else if (income <= 372950)
                    tax = 16700 * 0.10 + (67900 - 16700) * 0.15 +(137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 +(income - 208850) * 0.33;
                else
                    tax = 16700 * 0.10 + (67900 - 16700) * 0.15 +(137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 +(372950 - 208850) * 0.33 + (income - 372950) * 0.35;
                break;
            case 2:
                // Compute tax for married separately
                if (income <= 8350)
                    tax = income * 0.10;
                else if (income <= 33950)
                    tax = 8350 * 0.10 + (income - 33950) * 0.15;
                else if (income <= 68525)
                    tax = 8350 * 0.10 + (33950 - 8350 ) * 0.15 +(income - 33950) * 0.25;
                else if (income <= 104425)
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +(68525 - 33950) * 0.25 + (income - 68525) * 0.28;
                
                else if (income <= 186475)
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +(68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 +(income - 104425) * 0.33;
                else
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +(68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 +(186475 - 104425) * 0.33 + (income - 186475) * 0.35;
                break;
            case 3:
                // Compute tax for head of household
                if (income <= 11950)
                    tax = income * 0.10;
                else if (income <= 45500)
                    tax = 11950 * 0.10 + (income - 45500) * 0.15;
                else if (income <= 117450)
                    tax = 11950 * 0.10 + (45500 - 11950 ) * 0.15 +(income - 45500) * 0.25;
                else if (income <= 190200)
                    tax = 11950 * 0.10 + (45500 - 11950) * 0.15 +(117450 - 45500) * 0.25 + (income - 117450) * 0.28;
                
                else if (income <= 372950)
                    tax = 11950 * 0.10 + (45500 - 11950) * 0.15 +(117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 +(income - 190200) * 0.33;
                else
                    tax = 11950 * 0.10 + (45500 - 11950) * 0.15 +(117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 +(372950 - 117450) * 0.33 + (income - 372950) * 0.35;
                break;
            default:
                System.out.println("Error: invalid status");
                System.exit(1);//The status 0 indicates that the program is terminated normally. A nonzero status code indicates abnormal termination.
        }
     // Display the result
 System.out.println("\nTax is " + (int)(tax * 100) / 100.0);
    
    }
    
}

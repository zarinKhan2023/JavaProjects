/** 
 * @author Zarin Khan 
 * ITSC1212- 202 Mazumder (Team 17)
 * @version 1.0
 * @since 2022-02-16
 * Demostrating using the concept of primitive variable and perform arithmatics
 */
public class Budget {
    public static void main(String[] args){
        //****** 
        //Project 1
        //****** 

     //Declare variables 
        int rent = 625;  
        int internetService = 27;
        int groceryBill = 250; 
        int activityAllowance = 150;
        int hrlyWage = 10;
        int wksInAMonth = 4;

     //Calculate total cost
         int totalCost = rent + internetService + groceryBill + activityAllowance;

     //Calculatw monthly and weekly work hrs
        double mnthlyWorkHrs = totalCost / (double) hrlyWage;
        double weeklyHrs = mnthlyWorkHrs / (double) wksInAMonth;

     //Calculate extra weekly hrs for saving
        int totalSaving = totalCost + 100;
        double hrSaving = (totalSaving / (double) hrlyWage) / wksInAMonth;
        double monthlySavingHr = hrSaving * 4;

     //Print statements
        System.out.println("My hourly wage is $" + hrlyWage + ".");
        System.out.println("The cost of rent, internet service, groceries, and leisure acttivities are:");
        System.out.println("$" + rent + ", $" + internetService + ", $" + groceryBill + " and $" + activityAllowance + ".");
        System.out.println("The total monthly expense is $" + totalCost + ".");

        System.out.println("I will have to work " + weeklyHrs + " hours weekly to afford the monthly expenses.");
        System.out.println("I will have to work " + hrSaving + " weekly to save addtional $100 after all the expenses.");
        System.out.println("Therefore, I will have to work " + monthlySavingHr + " total hours monthly to save $100.") ;
        System.out.println("Based on how expensive the living cost is, it is better to find another job!!!");
    }
    
}

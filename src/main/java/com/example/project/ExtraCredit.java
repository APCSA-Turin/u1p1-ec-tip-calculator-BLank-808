package com.example.project;
import java.util.Scanner;


public class ExtraCredit {


    public static String calculateTip(int people, int percent, double cost, String items) {
        StringBuilder result = new StringBuilder();
        double tip=(int)(((cost*(percent/100.0))*100.0)+.5)/100.0;/*By using int casting removing decimals and then dividing by 100 it effectivly rounds to the nearest hundreth */
        double costAP= ((tip*100 + cost*100)/100); /*For some reason when adding them as doubles it results in a number extreamly close but with more than two decimal points thus the coversion back and forth is needed */
                       
        result.append("-------------------------------\n");
        result.append("Total bill before tip: "+"$"+ cost +"\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: "+ percent+"%\n");
        result.append("Total tip: " +"$"+ tip+ "\n");
        result.append("Total Bill with tip: "+"$"+ costAP+ "\n");
        result.append("Per person cost before tip: "+"$"+((int)(((cost/people)*100.0)+.5)/100.0)+ "\n");
        result.append("Tip per person: "+"$"+((int)(((tip/people)*100.0)+.5)/100.0)+"\n");
        result.append("Total cost per person: "+"$"+ ((int)(((costAP/people)*100.0))/100.0)+"\n");
        result.append("-------------------------------\n");
        //the two lines  should go below result.append("-------------------------------\n"); 
        result.append("Items ordered:\n");
        result.append(items);


        return result.toString();
    }
                                   
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Hello");
        System.out.print ("How many people are paying? ");
        int people=scan.nextInt(); 
        System.out.print ("what percent tip are you giving? ");
        int percent=scan.nextInt();
        System.out.print ("what the cost of the meal? ");
        double cost=scan.nextDouble();            
        System.out.println("What did you order");
        String items=""; 
        StringBuilder itemsList= new StringBuilder();
        System.out.print("enter item name or 'done'");
        String check=scan.nextLine();
        //Your scanner object and while loop should go here
        while (!check.equalsIgnoreCase("done")) {
            itemsList.append(check+"\n");
            System.out.println("enter item name or 'done'");
            check=scan.nextLine();
        }
        scan.close();
        items=itemsList.toString();                 
        System.out.println(calculateTip(people,percent,cost,items));
    }
}

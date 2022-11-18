package com.jerzke;


import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){

        System.out.print("Principal: ");
        

        try (Scanner principalScanner = new Scanner(System.in)) {
			int principal = principalScanner.nextInt();
			//System.out.println("Principal: " + principal);

            
             System.out.print("Annual Interest Rate: ");
            try (Scanner interestScanner = new Scanner(System.in)) {
				double interest = interestScanner.nextFloat();
				//System.out.println("Annual Interest Rate: " + interest);


                System.out.print("Period (Years): ");

                try (Scanner yearScanner = new Scanner(System.in)) {
                    Byte period = yearScanner.nextByte();
                   // System.out.println("Period (Years): " + period);
                   
                  double monthlyInterest = (interest/100)/12;
                  double payments = Math.pow(monthlyInterest, period);
                
                    double mortage = principal * (monthlyInterest * ((1 + monthlyInterest) + payments)) / (((1 + monthlyInterest) + payments) - 1) ;

                   

                    System.out.print("Your Mortage is: " + mortage );
                }

    
			}
		}

    ;

        //try (Scanner scanner = new Scanner(System.in)) {100
		//String interest = scanner.nextLine().trim();
		//System.out.println("Annual Interest Rate: " + interest);
		//}

    }

}

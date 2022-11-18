package com.jerzke;

import java.util.Scanner;

public class NumberTesting {
    public static void main(String[] args){

    
         Scanner numberScanner = new Scanner(System.in);
         System.out.print("Number :");
         int numbers = numberScanner.nextInt();
    
    
      if(numbers % 5 == 0 && numbers % 3 == 0)
      System.out.println("FizzBuzz");
      else if(numbers % 5 == 0)
      System.out.println("Fizz");
      else if(numbers % 3 == 0)
      System.out.println("Buzz");
      else System.out.println(numbers);
      
       numberScanner.close();
    
       
    }
}
    



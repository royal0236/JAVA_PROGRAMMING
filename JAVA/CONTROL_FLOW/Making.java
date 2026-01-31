import java.util.Scanner;
public class Making {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Number Nature Analyzer
        // System.out.print("Enter a number:");
        // int number = sc.nextInt();
        // if (number > 0) {
        //     System.out.println("Positive Number.");
        // }
        // else if (number < 0) {
        //     System.out.println("Negative Number.");
        // }
        // else {
        //     System.out.println("Zero Number.");
        // }
        // // Even–Odd with Constraint
        // System.out.print("Enter a number:");
        // int Number = sc.nextInt(); // 6
        // if (Number < 0) {
        //     System.out.println("Invalid Number.");
        // }
        // else {
        //     if (Number % 2 == 0) { // 6 % 2 = 0
        //         System.out.println("It is a Even Number."); // prints
        //     } else {
        //         System.out.println("It is a Odd Number.");
        //     }
        // }

        // Exam Result System Rules:
        // System.out.println("Welcome to the Exam Results");
        // System.out.print("Enter your Marks:");
        // int marks = sc.nextInt(); // 86
        // if (marks < 0 || marks > 100) { 
        //     System.out.println("Invalid Marks.");
        // }
        // else if ( marks >= 75){  // 85 > 75
        //     System.out.println("You have Passed with Distinction."); // prints
        // }
        // else if (marks >= 60) {
        //     System.out.println("You have Passed with First Class");
        // }
        // else if (marks >= 35) {
        //     System.out.println("You have just Passed");
        // }
        // else {
        //     System.out.println("You have failed the Exam");
        // }

        // Electricity Bill
        // System.out.println("Welcome to the Electricity Board");
        // System.out.print("Enter the number of units consumned:");
        // int units = sc.nextInt();
        // int bill = 0;
        // if (units <= 0) {
        //     System.out.println("Invalid Units.");
        // }
        // else if (units <= 100) {
        //     bill = units * 1;
        //     System.out.println("Your Electricity Bill:" + bill);
        // }
        // else if (units <= 200) {
        //     bill = 100 * 1 + (units - 100) * 2;
        //     System.out.println("Your Electricity Bill:" + bill);
        // }
        // else {
        //     bill = 100 * 1 + 100 * 2 + (units - 200) * 3;
        //     System.out.println("Your Electricity Bill:" + bill);
        // }

        // Login System
        // System.out.print("Enter your age:");
        // int age = sc.nextInt();
        // boolean passwordCorrect = true;
        // boolean accountBlocked = false;
        // if (age <= 18) {
        //     System.out.println("Your Underage.");
        // }
        // else if (!passwordCorrect) {
        //     System.out.println("Wrong Password");
        // } 
        // else if (accountBlocked) {
        //     System.out.println("Account Blocked");
        // }
        // else {
        //     System.out.println("You have Logined Successfully");
        // }
        // Check Largest of Two Numbers
        // System.out.println("Check Largest of Two Numbers");
        // System.out.print("Enter the first number: "); // 65
        // int firstNumber = sc.nextInt();
        // System.out.print("Enter the second number: "); // 57
        //  int secondNumber = sc.nextInt();
        //  if ( firstNumber == secondNumber ){ // 65 = 75 (false)
        //     System.out.println("First Number is equals to the second Number:" + firstNumber + secondNumber);
        //  }
        //  else  if (firstNumber > secondNumber){ // 65 > 57 (true)
        //        System.out.println("First Number is Largerst to the second Number:" + firstNumber); // prints
        //  }
        //  else {
        //      System.out.println("Second Number is Largerst to the First Number:" + secondNumber);
        //  }
 //  Leap Year Check
    //  System.out.println("To Check Leap year OR not");
    //  System.out.print("Enter a year: "); // 2000
    //  int year = sc.nextInt();
    //  if ( (year % 400 == 0) || year % 4 == 0 && year % 100 != 0 ){ // conditin true
    //     System.out.println("It's a Leap year: " + year); // prints
    //  }
    //  else {
    //      System.out.println("It's not a Leap year: " + year);
    //  }
            //   System.out.print("Enter a year to check Leap OR not: ");
            //  int year = sc.nextInt();
            //  String result = (year % 400 == 0) ? "Leap year" : 
            //    (year % 4 == 0 && year % 100 != 0) ? "Leap year" : "Not a leap year";
            //  System.out.println(year + " is a " + result);
            
            //   Smallest of Three Numbers
            // System.out.println("Smallest of Three Numbers");
            // System.out.print("Enter the first number: ");
            // int firstNumber = sc.nextInt(); // 45
            // System.out.print("Enter the secoond number: "); 
            // int secondNumber = sc.nextInt(); // 76
            // System.out.print("Enter the third number: "); 
            // int thirdNumber = sc.nextInt(); // 8
            // if (firstNumber == secondNumber && secondNumber == thirdNumber) {
            //     System.out.println("All numbers are equal: " + firstNumber);
            // }
            // else if ( firstNumber < secondNumber && firstNumber < thirdNumber){
            //     System.out.println("First Number is the smallest Number: " + firstNumber);
            // }
            // else if ( secondNumber < thirdNumber && secondNumber < firstNumber){
            //     System.out.println("Second Number is the smallest Number: " + secondNumber);
            // }
            // else {
            //     System.out.println("Third Number is the smallest Number: " + thirdNumber);
            // }
            // // int smallest = Math.min(firstNumber, Math.min(secondNumber, thirdNumber));
            // // System.out.println("Smallest number is: " + smallest);

            
            //  //  Traffic Signal 
            //  System.out.println("Traffic Signal Control.");
            // System.out.print("Enter signal (red/yellow/green):");
            //     String signal = sc.next();
            //      if (signal.equals("red")) {
            //         System.out.println("STOP");
            //     } else if (signal.equals("yellow")) {
            //         System.out.println("READY");
            //     } else if (signal.equals("green")) {
            //         System.out.println("GO");
            //     } else {
            //         System.out.println("Invalid signal");
            //     }
            // Perfect Square
            System.out.print("Enter a number:");
            int number = sc.nextInt();  // 2
            double Number = Math.sqrt(number); // 2*2 = 4.0
            if (Number == (int) Number) { // 4.00 == 4
                System.out.println("Perfect Square"); // 4
            }
            else {
                System.out.println("Not a Perfect Square");
            }
                    



    }
}

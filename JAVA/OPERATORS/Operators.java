import java.util.Scanner;
public class Operators {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      //Arithmetic Operators  + , - , * , %(remainder) , / (quotient).
       // Take two numbers as input → print sum, difference, product, quotient, remainder.
      //  System.out.print("Enter the first number:");
      //  int First_number = sc.nextInt();
      //  System.out.print("Enter the second number:");
      //  int Second_number = sc.nextInt();
      //  System.out.println("Sum of two numbers is:" + (First_number + Second_number));
      //  System.out.println("Difference of two numbers is:" + (First_number - Second_number));
      //  System.out.println("Product of two numbers is:" + (First_number * Second_number));
      //  System.out.println("Quotient of two numbers is:" + (First_number / Second_number));
      //  System.out.println("Remainder of two numbers is:" + (First_number % Second_number));

       // Swap Two Numbers (NO THIRD VARIABLE)
        // System.out.print("Enter the first number:");
        // int a = sc.nextInt();  // 5
        // System.out.print("Enter the second number:");
        // int b = sc.nextInt(); // 10
        // a = a + b; // 5 + 10 = 15 , a=15
        // b = a - b; // 15 - 10 = 5 , b = 5
        // a = a - b; // 15 - 5 = 10 , a = 10
        // System.out.println(" a is swaped to " + b + " is swaped to " + a + ".");
        // // Check Even or Odd (USING %)
        // System.out.print("Enter an integer number:");
        // int number = sc.nextInt();
        // System.out.println(number % 2);


        // RELATIONAL OPERATORS  < , > , >= , <= , == , !=
        //Compare Two Numbers
        // System.out.print("Enter the first number:");
        // int fIrst_number = sc.nextInt();
        // System.out.print("Enter the second number:");
        // int sEcond_number = sc.nextInt();
        // System.out.println("Check both number are Equal or not:" + (fIrst_number == sEcond_number));
        // System.out.println("Check the given number:"
        //     + (fIrst_number > sEcond_number) + " and " + (fIrst_number < sEcond_number));
        //      //  Write a program to check if a number entered by the user is greater than 100.
        //  System.out.println("To check if a number entered by the user is greater than 100");
        //  System.out.print("Enter your number:");
        //  int greater = sc.nextInt();
        //  System.out.print((greater > 100) + "The number is grater then 100.");
        //  Check Not Equal Two Number are
        // int x = 10;
        // int y = 20;
        // System.out.println(x != y);
        // Store Result in Boolean Variable
        // int marks = sc.nextInt();
        // boolean result = marks >= 35;
        // System.out.println(result);
        // Compare User Input Numbers
        // int q = sc.nextInt();
        // int w = sc.nextInt();
        // System.out.println( q > w);
        // System.out.println(q < w);
        // System.out.println(q == w);
        //  check the eligability for vote
        // int age = sc.nextInt();
        // System.out.println(age >= 18);
        // Check if a given year is a leap year.
        //     System.out.println("To check year is leap year or not");
        //     System.out.print("Enter the year:");
        //     int year=sc.nextInt();
        //     if ( year % 400 == 0 || year % 100 != 0 || year  % 4 == 0){
        //         System.out.println("Entered leap year");
        //     }
        //     else {
        //       System.out.println("Not a leap year");
        //     }
        //     Job Eligibility
        //     System.out.println("Job Eligibility");
        //     System.out.print("Enter your age:");
        //     int age1=sc.nextInt();
        //     System.out.print("Enter your experiences:");
        //     int experiences=sc.nextInt();
        //     if ( (age1 >= 21 && age1 <= 35) && experiences >= 2 ) {
        //         System.out.println("Your eligible");
        //     }
        //     else {
        //       System.out.println("Your not eligible");
        //     }
        //     Cinema Ticket Discount
        //     System.out.println("Cinema Ticket Discount");
        //     System.out.print("Enter your Age:");
        //     int Age=sc.nextInt();
        //     System.out.print("Do you have membership card? (true/false):");
        //     boolean membershipCard=sc.nextBoolean();
        //     int discount = 0;
        //     if ( Age < 12){
        //         discount = 50;
        //         System.out.println("Congratulations! You get " + discount + "% discount.");}
        //     else if (Age >= 12 && Age <= 18){
        //           discount = 25;
        //           System.out.println("Congratulations! You get " + discount + "% discount.");
        //     }
        //     else if ( Age >= 60){
        //         discount = 30;
        //          System.out.println("Congratulations! You get " + discount + "% discount.");
        //     }
        //     else if ( membershipCard){
        //         discount = 5;
        //       System.out.println("Congratulations! You get " + discount + "% discount.");
        //     }
        //     else {
        //       System.out.println("Sorry, no discount available");
        //     }
        //     Festival Discount
        //     System.out.println("Festival Discount");
        //     System.out.print("Enter the Price of Purchased items:");
        //     int items_purchased = sc.nextInt();
        //      System.out.print("Do you have a membershipcard? (true/false): ");
        //     boolean membership_card=sc.nextBoolean();
        //     if (items_purchased > 5000 || membership_card){
        //         System.out.println("Congratulations! Discount applied");
        //     }
        //     else {
        //       System.out.println("Sorry no Discount applied");
        //     }
        //     Exam Promotion
        //     System.out.println("Exam Promotion");
        //     System.out.print("Enter the subject1 marks:");
        //     int subject1_marks=sc.nextInt();
        //     System.out.print("Enter the subject2 marks:");
        //     int subject2_marks=sc.nextInt();
        //     System.out.print("Enter the total marks:");
        //     int total_marks=sc.nextInt();
        //     if ((subject1_marks >= 35 && subject2_marks >= 35) || total_marks >= 100){
        //         System.out.println("Pass");
        //     }
        //     else {
        //         System.out.println("Fail");
        //     }
        //      Compare Two Strings
        //      System.out.println("Compareing of  Two Strings");
        //      sc.nextLine();
        //      System.out.println("Enter your first string:");
        //      String firstString=sc.nextLine();
        //      System.out.println("Enter your second string:");
        //      String secondString=sc.nextLine();
        //      if ( firstString.equals(secondString)){
        //         System.out.println("Two Strings are equal.");
        //      }
        //      else {
        //        System.out.println("Two Strings are not equal.");
        //      }
                
             
             //  LOGICAL OPERATORS     &&(ALL CONDITIONS MUST BE TRUE) , ||(ANY ONE CONDITION MUST BE TRUE) , !(REVERSES THE OPERATION)
             //  Check if a number is greater than 10 AND less than 50
//              System.out.println("Check number is >100 and <50");
//              System.out.print("Enter the number:");
//              int number = sc.nextInt();
//              System.out.println(number >= 100 && number <= 50);
//               //Loan Approval System
//               System.out.println("Loan Approval System");
//               System.out.print("Enter your income: ");
//                int income = sc.nextInt();
//                System.out.print("Enter your credit score: ");
//                int creditScore = sc.nextInt();
//                System.out.print("Enter your age: ");
//                int age = sc.nextInt();
//                if ((income >= 30000 && creditScore >= 700) && age >= 21 && age <= 60){
//               System.out.print("Loan Approved");
//              }
//              else {
//                System.out.println("Loan Rejected ");
//              }
//               // Online Exam Login
//            sc.nextLine();
//           System.out.println("Online Exam Login");
//          sc.nextLine();
//           System.out.print("Enter your username: ");
//           String userName1=sc.nextLine();
//           System.out.print("Enter your password: ");
//            String password=sc.nextLine();
//           System.out.print("Enter the otp: ");
//           int otp=sc.nextInt();
//           if (userName1.equals("Student") && password.equals("Java123") && otp == 9999) {
//              System.out.println("Login Successful! Welcome to Online Exam!");
//           }
//           else {
//             System.out.println("Login Failed");

//Login System Requirements:Username - should be at least 4 characters , Password - should be at least 8 characters , OTP - should be exactly 6 digits
//             String correctUsername = "admin123";
//             String correctPassword = "password123";
//             String correctOtp = "123456";
//             System.out.println("=== WELCOME TO LOGIN SYSTEM ===");
//             sc.nextLine();
//             System.out.print("Enter your username: ");
//             String userName = sc.nextLine();
//             if (userName.length() < 4) {
//               System.out.println("Username must be at least 4 characters long!");
//               return;
//             }
//             System.out.print("Enter your password: ");
//             String userPassword = sc.nextLine();
//             if (userPassword.length() < 5) {
//               System.out.println("Password must be at least 5 characters long!");
//               return;
//             }
//             System.out.print("Enter the otp received to your mobile: ");
//             String userOtp = sc.nextLine();
//             if (userOtp.length() != 6) {
//               System.out.println("OTP must be exactly 6 digits!");
//               return;
//             }
//             if (correctUsername.equals(userName) && correctPassword.equals(userPassword)
//                 && correctOtp.equals(userOtp)) {
//               System.out.println(" Login Successful! Welcome, " + correctUsername + "!");
//             } else {
//               System.out.println("Login Failed! Invalid credentials.");
//             }
//           }
//        College Admission  Input: marks, sportsQuota, recommendationLetter.
//         System.out.println("College Admission");
//         System.out.print("Enter your Marks: ");
//         int marks = sc.nextInt();
//         System.out.print("Sport Quota (true/false): ");
//         boolean sportsQuota=sc.nextBoolean();
//         System.out.print("recommendationLetter( true/false): ");
//         boolean recommendationLetter=sc.nextBoolean();
//         if ((marks >= 90) || (marks >= 70 && sportsQuota) || (recommendationLetter)){
//             System.out.println("Admission granted.");
//         }
//         else {
//           System.out.println("Admission rejected.");
//         }
//          Reverse a boolean value
//           boolean hlo = true;
//            hlo = !hlo; // flips the value
//            System.out.println(hlo); // FALSE
          
           //  SHIFT OPERATORS IN JAVA   <<(Multiply by 2) , >>(Divide by 2) , >>>
          // Store a number and left shift 
          // System.out.print("Enter a number:");
          // int num = sc.nextInt(); // 5
          // int left = num << 1; // 2*5=10
          // System.out.println("Number is Left Shifted :" + left);
          //  Store a number and Right shift it by 1
          // System.out.print("Enter a number:");
          // int Num = sc.nextInt(); // 5
          // int right = Num >> 1; // 5/2=2
          // System.out.println("Number is Right Shifted:" + right);
          // Check if left shifting a number gives result greater than 50.
        //   int num = 15;
        // boolean result = (num << 2) > 50;
        // System.out.println(result);
        // Multiply 9 by 8 using shift
        // int shift = 9 << 3;
        // System.out.println(shift);
        // Divide 32 by 4 using shift
        // int divide = 32 >> 2;
        // System.out.println(divide);
          // Salary Doubler 
  //       System.out.println("Salary Doubler");
  //       System.out.print("Enter your salary: ");
  //       int salary = sc.nextInt(); // 100
  //       int salaryDoubled= salary << 1;  // 100*2=200
  //       System.out.println("Salary is Doubled: " + salaryDoubled);
  //  Take an integer and perform left shift (<<) by 1, 2, 3 bits. Print results.
  //     System.out.println("Perform of left shift.");
  //     System.out.print("Enter a number: ");
  //     int n1=sc.nextInt(); //5
  //     int leftShift = n1 << 1; // 5*2=10
  //     int leftShift1= n1 << 2; // 5*(2*2)=20
  //     int leftShift2=n1 << 3; // 5*(2*2*2)=40
  //     System.out.println(leftShift);
  //     System.out.println(leftShift1);
  //     System.out.println(leftShift2);
  // Take an integer and perform right shift (>>) by 1, 2, 3 bits. Print result
      // System.out.println("Perform of right shift.");
      // System.out.print("Enter a number: ");
      // int n2=sc.nextInt();   // 8
      // int rightShift = n2 >> 1; // 8/2=4
      // int rightShift1= n2 >> 2; // 8/(2*2)=2
      // int rightShift2=n2 >> 3; // 8/(2*2*2)=1
      // System.out.println(rightShift);
      // System.out.println(rightShift1);
      // System.out.println(rightShift2);

      // BITWISE OPERATORS   &(AND) , |(OR) ,  ^(XOR) , ~(NOT)
      // Swap Two Numbers (Without Temp Variable)
        // System.out.println("Swap Two Numbers");
        // System.out.print("Enter the first number: ");
        // int firstNumber=sc.nextInt(); // 8 = 1000
        // System.out.print("Enter the second number: ");
        // int secondNumber = sc.nextInt(); // 2 = 0011
        // System.out.println("Before swap: firstNumber = " + firstNumber + ", secondNumber = " + secondNumber);
        //  firstNumber = firstNumber ^ secondNumber; //  1000 ^ 0011 = 1011(11) 
        //  secondNumber = firstNumber ^ secondNumber; // 1011 ^ 0011 = 1000(2)
        //  firstNumber = firstNumber ^ secondNumber; // 1000 ^ 0010 = 0010(8)
        //  System.out.println(
        //      "After swap: firstNumber = " + firstNumber + ", secondNumber = " + secondNumber);
        //   //Odd or Even Checker
        // System.out.println("Odd or Even Checker");
        // System.out.print("Enter the number: ");
        // int number=sc.nextInt();
        //  if ( (number & 1) == 0){
        //     System.out.println("It is a even number.");
        //  }
        //  else {
        //    System.out.println("It is a odd number.");
        //  }
        //    //   Find Unique Element
        // System.out.println("Enter 3 numbers (two same, one unique): ");
        // int a = sc.nextInt(); // 8
        // int b = sc.nextInt(); // 4
        // int c = sc.nextInt(); // 8
        //  int  unique = a ^ b ^ c; 
        //  System.out.println("Unique element is:" + unique);
         
         // Ternary Operators       condition ? value_if_true : value_if_false;
         //  Nested Ternary
        //  System.out.print("Enter your marks:");
        //  int marks = sc.nextInt();
        //  String result = ( marks >= 90) ? "Distancation" : ( marks >= 75) ? "First Class" : (marks <= 35) ? "Fail": "pass";
        //  System.out.println("Result:" + result);

         //  Check if a number is positive or negative
      //    System.out.print("Enter a number:");
      //    int number = sc.nextInt();
      //    int Result = (number >= 0) ? 1 : 2;
      //    System.out.println("Result:" + (Result == 1 ? "Positive" : "Negative"));

      //  // Pass or Fail Result 
      //    System.out.println("Pass or Fail Result");
      //    System.out.print("Enter your marks: ");
      // int marks1 = sc.nextInt();
      // String finalResult=(marks1 >= 40) ? "Pass" : "Fail" ;
      // String message=(marks1 >= 40) ? "Congratulations" : "Better luck next time" ;
      // System.out.println("Result: " + finalResult );
      // System.out.println("Message: " + message);
      // System.out.println("Marks obtained: " + marks1 + "/100");
      
//        //    Find Maximum  and Minimum of Two Numbers 
//     System.out.println("Maximum of Two numbers");
//     System.out.print("Enter the first number: ");
//     int firstNumber = sc.nextInt();
//     System.out.print("Enter the second number: ");
//     int secondNumber = sc.nextInt();
// String resulT = (firstNumber > secondNumber) ? "First number is bigger (" + firstNumber + ")" :
//                 (secondNumber > firstNumber) ? "Second number is bigger (" + secondNumber + ")" :
//                 "Both numbers are equal (" + firstNumber + ")";
//     String result2= (firstNumber < secondNumber) ? "First number is smaller (" + firstNumber + ")" :
//                 (secondNumber < firstNumber) ? "Second number is smaller (" + secondNumber + ")" :
//                 "Both numbers are equal (" + firstNumber + ")";            
//     System.out.println("Maximum of between two numbers is: " + resulT);
//      // Grade Calculator 
//    System.out.println("Grade Calculator");
//    System.out.print("Enter your marks: ");
//   int marks = sc.nextInt();
// String grades = (marks < 0 || marks > 100) ? "Invalid Marks" :
//                (marks >= 90) ? "A Grade" :
//                (marks >= 75) ? "B Grade" :
//                (marks >= 50) ? "C Grade" : "Fail";
// System.out.println("Final Grades: " + grades);
// System.out.println("Marks: " + marks + "/100");
// UNARY OPERATORS  ++(increment) , --(decrement)

    
 

      



        









        }
        }



import java.util.Scanner;
public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 // Take two numbers as input → print sum, difference, product, quotient, remainder.
 System.out.println("Performing Arithemtic Operations.");
 System.out.print("Enter the first number:");
 int i = sc.nextInt();
 System.out.print("Enter the second number:");
 int j = sc.nextInt();
 System.out.println("Sum of two number is:" + i + j);
 System.out.println("Difference of two number is:" + (i-j));
 System.out.println("Product  of two number is:" +(i*j));
 System.out.println("Quotient of two number is:" + (i%j));
 System.out.println("Remainder of two number is:" + (i / j));
 
       //  Input marks of 5 subjects, calculate total & average
      System.out.println("Marks Calculation of a student");
      System.out.print("Enter the subject1_marks:");
      int subject1_marks=sc.nextInt();
      System.out.print("Enter the subject2_marks:");
      int subject2_marks=sc.nextInt();
      System.out.print("Enter the subject3_marks:");
      int subject3_marks=sc.nextInt();
       System.out.print("Enter the subject4_marks:");
      int subject4_marks=sc.nextInt();
       System.out.print("Enter the subject5_marks:");
      int subject5_marks=sc.nextInt();
      int Total_marks=(subject1_marks + subject2_marks + subject3_marks + subject4_marks + subject5_marks);
      System.out.println("Total Marks:" + Total_marks);
      System.out.println("Average marks:" + Total_marks / 5);
      
       // Take two integers and show both int division and float division.
       System.out.println("Two integers and show both int division and float division");
       System.out.print("Enter your first number:");
       int number_1=sc.nextInt();
       System.out.print("Enter your second number:");
       int number_2=sc.nextInt();
       System.out.println("Both Integers in Division: " + number_1 / number_2);
       System.out.println("Both Integers in Division: " + (float) number_1 / number_2);
       
            // Convert Minutes into Hours & Minutes
      System.out.println("Converting Minutes into Hours & Minutes.");
      System.out.print("Enter The Minutes:");
      int minutes=sc.nextInt();
      int hour=minutes / 60;
      int remaining_minutes=minutes % 60;
      System.out.println("The Minutes Converted into Hours and minutes: "+ hour + " hour " + remaining_minutes + " minutes");











    }
}

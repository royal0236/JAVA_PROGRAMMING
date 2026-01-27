import java.util.Scanner;

public class Basics {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("HELLO WORLD!");
        System.out.println("ROYAL");
        //Create a variable to store your age and print it
             int age = 20;
            System.out.println("My age is:" + age);
        // Create two variables to store two numbers and print their sum.
            int first_number = 29;
            int second_number = 36;
            System.out.println("Sum of two number is:" + (first_number + second_number));
        //  Store your marks in 3 subjects in 3 variables and print the total marks.
            int subject_1 = 87;
            int subject_2 = 95;
             int subject_3 = 90;
             int result = subject_1 + subject_2 + subject_3;
             System.out.println("Total marks obtained:" + result);
        // Create a variable for year of birth and calculate your current age. 
             int year = 2005;
             System.out.println("My current age is:" + (2026 - year));
        // Store length and breadth of a rectangle in variables and print: Area , Perimeter
            int length = 3;
            int breadth = 10;
            System.out.println("Area of the rectangle is:" + (length * breadth) + "\n"
                + "Perimeter of the rectangle is:" + (2 * (length + breadth)));
        // Declare variables for:your age , your grade , whether you are a student. Print all.
            int Age = 21;
            char grade = 'A';
             boolean student = true;
                 System.out.println("My age is:" + age + "\n" + "My grade is:" + grade + "\n" + "I am Student:" + student);
         // Store price of a product and print it    
             double product = 99.989;
             System.out.println("The price of a product is:" + product);
         // Store marks of 5 subjects using different data types and print total.
             int Subject1 = 89;
             float Subject2 = 99f;
             long Subject3 = 97L;
             double Subject4 = 94;
             short Subject5 = 91;
             System.out.println("Marks of different subjects:" + "\n" + Subject1 + "\n" + Subject2 + "\n"+ Subject3 + "\n"+ Subject4 + "\n"+ Subject5);
         //Create a small program that stores:name (String) age (int) percentage (float) passed (boolean) and prints them in proper format.
            String name = "DAVANAM ROYAL";
            int Agee = 21;
             float percentage = 81.81f;
             boolean passed = true;
             System.out.println("My name is:" + name + "\n" + "My age is:" + age + "\n" + "My diploma percentage is:"+ percentage + "\n" + "I have completed diploma");
         // Take an integer from user and print it.
             System.out.print("Enter a integer:");
             int integer =sc.nextInt();
             System.out.println("Your entered number:" + integer);
         // Take three numbers from user and print their sum.
             System.out.print("Enter the First number:");
             int number1 = sc.nextInt();
             System.out.print("Enter the Second number:");
             int number2 = sc.nextInt();
             System.out.print("Enter the third number:");
             float number3 = sc.nextFloat();
             System.out.println("Sum of three numbers is:" + (number1 + number2 + number3));
         //  Take name and age from user and print:
              System.out.print("Enter your name:");
         //  String Name = sc.nextLine();
              String Name = sc.next();
             System.out.print("Enter your age:");
             int aGe = sc.nextInt();
             sc.nextLine(); 
             System.out.println("Hello " + Name + "," + " you are " + aGe + " years old.");
         //  Take marks of 5 subjects from user and calculate: Total and Average
             System.out.print("Subject1 Marks:");
             int Sub1 = sc.nextInt();
            System.out.print("Subject2 Marks:");
             int Sub2 = sc.nextInt();
             System.out.print("Subject3 Marks:");
            int Sub3 = sc.nextInt();
             System.out.print("Subject4 Marks:");
            int Sub4 = sc.nextInt();
            System.out.print("Subject5 Marks:"); 
            int Sub5 = sc.nextInt();
            System.out.println("Toatl Marks:" + (Sub1 + Sub2 + Sub3 + Sub4 + Sub5) + "/500" + "\n"
            + "Average of total marks:" + (Sub1 + Sub2 + Sub3 + Sub4 + Sub5) / 5);
        //Convert an int value to double and print both.
            System.out.print("Enter Interger Number:");
            int Integer = sc.nextInt();
            double Double = Integer;
            System.out.println("Integer Converted into Double:" + Double);
         //Convert a char to its ASCII and Integers value.
             System.out.print("Enter an Integer:");
              char ch = sc.next().charAt(0);
             int ASCII = ch;
              System.out.println("Character converted into ASCII:" + ASCII);
                  char cha2 = '0';
                int asci2 = cha2;
                 System.out.println(asci2);
                 char cha3 = '@';
                  int asci3 = cha3;
                  System.out.println(asci3);
            // Take a double number from user and convert it to int.
                    System.out.print("Enter a Double Value:");
                     double dou = sc.nextDouble();
                     int INteger = (int) dou;
                     System.out.println("Double is Converted into Integer:" + INteger);
            // Take marks as int, calculate percentage as double.
                     System.out.print("Enter the marks obtained:");
                     int Obatined = sc.nextInt();
                    System.out.print("Total Marks:");
                     int Total = sc.nextInt();
                    double doub = (Obatined * Total) / 100;
                     System.out.println("Percentage of the marks:" + doub); 
               //Take total bill amount as double and convert it to int (for cash payment) and show difference lost.
                    System.out.print("Total Bill:");
                    double Bill = sc.nextDouble();
                     int cash = (int) Bill;
                    System.out.println("The Total Final Bill" + cash + "\n" + "The lost amount:" + (Bill - cash));
                // Take two numbers and print quotient and remainder.
                     System.out.print("Enter the first number:");
                    int FIrst_Number = sc.nextInt();
                    System.out.print("Enter the second number:");
                    int SECond_Number = sc.nextInt();
                    System.out.println("Quotient of the two numbers is:" + FIrst_Number / SECond_Number + "\n"
                       + "Remainder for the to numbers is:" + FIrst_Number % SECond_Number);
                //Simple Interest Calculator 
                    System.out.println("Calculateing the Simple Interest Calulator");
                    System.out.print("Enter the value of Principle:");
                    double Principle=sc.nextDouble();
                    System.out.print("Enter the value of Rate:");
                    double Rate=sc.nextDouble();
                    System.out.print("Enter the value of Time:");
                    float Time=sc.nextFloat();
                    System.out.println("Simple Interest is:" + (Principle * Rate * Time) / 100);
                //Temperature Conversion. Converting  Celsius to Fahrenheit.
                  System.out.println("Temperature Conversion");
                  System.out.print("Enter the value of celsius:");
                  float celsius=sc.nextFloat();
                  double Fahrenheit=(celsius * 9/5) + 32;
                  System.out.println("Temperature Conversion Converting  Celsius to Fahrenheit is:"
                          + Fahrenheit);
                     //   ASCII Value of a Character
                  System.out.println("ASCII value of a character");
                  System.out.print("Enter the character:");
                  char character = sc.next().charAt(0);
                  int ASCII_value=(int)character;
                  System.out.println("The ASCII value of '" + character + "' is: " +  ASCII_value);
                //  Convert minutes into hours and remaining minutes.
                    System.out.print("Enter the minuntes:");
                    int minutes = sc.nextInt();
                    System.out.println("Minutes entered is:" + minutes + " Converted into hours and remaining minuntes:" + minutes / 60 + " hrs and"
                            + minutes % 60 + " min");
               // Find Largest of Three Numbers
                  System.out.println("Find the largest number");
                  System.out.print("Enter the first number:");
                  int first_number1=sc.nextInt();
                  System.out.print("Enter the second number:");
                  int second_number2=sc.nextInt();
                   System.out.print("Enter the third number:");
                   int third_number3=sc.nextInt();
                   int largest_number=Math.max(first_number1 , Math.max(second_number2, third_number3));
                    System.out.println("The Largest Number is:" + largest_number);
                    int smallest_number=Math.min(first_number1 , Math.min(second_number2, third_number3));
                    System.out.println("The Smallest Number is:" + smallest_number);
       
                //  Take a 3-digit number and print the sum of its digits (Hint: use / and %)
                    // System.out.print("Enter a three digit number:");
                    // int i = sc.nextInt();
                    // int j = i % 10;
                    // i = i / 10;
                    // int k = i % 10;
                    // int l = i / 10;
                    // System.out.println(j + k + l);
                    //  System.out.print("Enter a two digit number and sum :"); 1 + 2 + 3 = 6
                     int i = sc.nextInt();
                     int a = i % 10; // 123 = 3
                     i = i / 10; // 123/10=12
                     int b = i % 10; //12%10=2
                     int c = i / 10; // 12/10=1
                  System.out.println(a + b + c);
            //    Swap Two Numbers.
                     System.out.println("Swaping of Two numbers");
                    System.out.print("Enter your First number:");
                    int first=sc.nextInt(); // 1
                     System.out.print("Enter your Second number:");
                     int second=sc.nextInt(); // 2
                     int temp=first; // temp=1
                     first=second; // first=2
                     second=temp; // second=1
                     System.out.println("First number is swaped to second number:" + first
                             + "\nSecond number is swapped to first number:" + second);
                    
  




    









        

        



       
        


        

    }
}
        

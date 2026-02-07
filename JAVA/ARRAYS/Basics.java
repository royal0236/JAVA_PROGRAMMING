import java.util.*;

public class Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[] a = {12, 34, 443, 33};
        // System.out.println(a.length);
        //  a[2] = 29;
        // System.out.println(a[2]);
        // System.out.println(a[0]);   
        // int[] a = new int[5];
        // a[0]=0;  a[2]=2; a[3]=3;  a[1]=1;  a[4] = 4;
        // System.out.println(a.length);
        // System.out.println(a[3]);
        // int[] b;
        // b = new int[3];
        // b[0] = 29;
        // b[1] = 36;
        // b[2] = 15;
        // System.out.println(b.length);
        // System.out.println(b[2]);
        // int[] a= new int[3]; // 10 , 20 , 30
        // int x=10;
        // for (int i = 0; i < a.length; i++) {
        //     a[i] = x;
        //     x = x + 10;
        //     System.out.println(a[i]);
        // }
        // String[] name = new String[3];
        // name[0] = "ROYAL";
        // name[1] = "SOWMYA";
        // name[2] = "NADH";
        // System.out.println(name.length);
        //  System.out.println(name[0]);
        // int n[] = {29, 92, 1};
        // System.out.println(n[0]);
        // System.out.print("How many numbers? ");
        // int size = sc.nextInt(); // 5
        // int[] arr = new int[size]; // 5

        // for (int i = 0; i < size; i++) {
        //     System.out.print("Enter number " + (i + 1) + ": ");
        //     arr[i] = sc.nextInt();
        //     System.out.println(arr[i]);


        //  System.out.print("How many numbers? ");
        // int size = sc.nextInt();  //  How many boxes?
        // int arr[] = new int[size]; // storage for that boxes
        // for (int i = 0; i < size; i++) {
        //     System.out.print("Enter number " + (i + 1) + ": ");
        //     arr[i] = sc.nextInt(); // putting some stuff in each box
        //     // System.out.println(arr[i]);
        // }
        // System.out.println("You entered:");
        // for (int i = 0; i < arr.length; i++) {
        //     int num = arr[i];
        //     System.out.println(num);
        //  }

        // Take Input form user and do Arithemtic Operations
        // System.out.print("Enter size of first array: ");
        // int size1 = sc.nextInt(); 
        // int add1[] = new int[size1];
        // System.out.println("Enter elements of first array:");
        // for (int i = 0; i < size1; i++) {
        //     add1[i] = sc.nextInt();
        //     }
        // System.out.print("Enter size of second array: ");
        // int size2 = sc.nextInt();
        // if (size1 != size2) {
        //     System.out.println("Arrays must be of same size");
        //     return;
        // }
        // int add2[] = new int[size2];
        // for (int i = 0; i < size2; i++) {
        //     add2[i] = sc.nextInt();
        // }
        // int sum []= new int[size1];
        // for (int i = 0; i < size1; i++) {
        //     sum[i] = add1[i] + add2[i];
        // }
        // System.out.println("Sum array:");
        // for (int i = 0; i < size1; i++) {
        //     System.out.print(sum[i] + " ");
        // }

            //COUNT EVEN AND ODD ELEMENTS IN AN ARRAY
            System.out.print("Enter the Elements:");
            int size = sc.nextInt(); // for size like how many values
            int arr[] = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt(); // putting some stuff into the array
            }
            int evencount = 0;
            int oddcount = 0;
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    evencount++;
                } else {
                    oddcount++;
                }
            }
            System.out.println("Even Numbers:" + evencount);
            System.out.println("Odd Numbers:" + oddcount);
    
        

    }
}


    
    
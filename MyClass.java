import java.util.Scanner;

// public class SumCalculator {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         // Ask the user to input two numbers
//         System.out.print("Enter the first number: ");
//         int num1 = input.nextInt();

//         System.out.print("Enter the second number: ");
//         int num2 = input.nextInt();

//         // Calculate sum
//         int sum = num1 + num2;

//         // Output the result
//         System.out.println("The sum is: " + sum);
        
//         input.close();
//     }
// }
// public class MyClass{
//     int b=1; //usage
//     int a=10; //give error as 'a' is local variable.it ha local scope 
//         // means can be accessed within a method a method it is decalred.
//     public void myMethod(){
//         int a; //Decalaration 
//         a=5; //Initialization 
//         b=2; //instance variable. to can be accessed anywhere i class.
//     }
//     public static void main(String[] args)
// }
// //variables -3
// //local variable -dacalared within the method 
// //instance -declare outside method but within class
// //static-declare with static keyword
// class AnotherClass {
//     static int a = 3;  // Static variable
//     int b = 10;        // Non-static (instance) variable
// }

// public class MyClass {
//     public static void main(String[] args) {  // 'Main' should be lowercase 'main'
//         System.out.println("Static variable a: " + AnotherClass.a);

//         AnotherClass obj = new AnotherClass();  // Create object to access 'b'
//         System.out.println("Non-static variable b: " + obj.b);
//     }
// }



// public class Myname {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         System.out.print("Enter your name: ");
//         String name = input.nextLine();

//         System.out.println("My name is: " + name);
//         input.close();
//     }
// }


public class MyClass {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = a + b;  // Sum of a and b
        int d = a - b;  // Difference of a and b (currently not printed)

        System.out.println(c);  
        System.out.println(d);
    }
}

import java.sql.SQLOutput;
import java.util.Scanner;
public class basicdetail {
    public static void main(String[] ags){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Name:");
        String name=sc.nextLine();
        System.out.print("Enter The Age:");
        int age=sc.nextInt();
        System.out.print("Enter The RollNo:");
        int RollNo=sc.nextInt();
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("RollNo:"+RollNo);
    }
}

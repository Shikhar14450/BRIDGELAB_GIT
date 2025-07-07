import java.util.*;
public class statenment1 {
    public  static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String x=sc.nextLine();
        switch(x){
            case "red":System.out.print("STOP");
            break;
            case "yellow":System.out.print("wait");
            break;
            case "green":System.out.print("go");
            break;
        }

    }
}

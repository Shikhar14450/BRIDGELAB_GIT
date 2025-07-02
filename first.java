//public class first {
//    public void Myfirst() {
//        int x = 1;
//        int y = 2;
//        int q = x + y;
//        System.out.println(q);
//    }
//
//    public static void main(String[] args) {
//        System.out.println("project");
//
//        // Create an object to call non-static method
//        first obj = new first();
//        obj.Myfirst();  // This will print: 3
//    }
//}

//public class first{
//    public void Myfirst(){
//        int x=1;int y=2;
//        int q=x+y;
//        System.out.println(q);
//    }
//    public static void main(String[] args){
//        System.out.println("project");
//        first obj =new first();
//        obj.Myfirst();
//    }
//}
public class first {
    public void create() {
        int x = 1;
        int y = 2;
        int q = x + y;
        System.out.println(q);
    }

    public static void main(String[] args) {
        System.out.print("project");
        first obj = new first();
        obj.create();
    }
}
//with temporary variable
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        int a, b, temp;
        
        System.out.println("enter values of x and y");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        
         System.out.println("before swapping a is : " + a + "and b is : " + b);
         
         a=b;
         b=a;
         temp = b;
         
          System.out.println("after swapping a is : "+ a + "and b is : " + b);
        

    }
}

//without temporary variable
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        int a, b;
        
        System.out.println("enter values of x and y");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        
         System.out.println("before swapping a is : " + a + "and b is : " + b);
         
         a=a+b;
         b=a-b;
         a=a-b;
         
          System.out.println("after swapping a is : "+ a + "and b is : " + b);
        

    }
}



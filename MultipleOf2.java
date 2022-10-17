import java.util.Scanner;

class Main{
    static int closestMultiple(int dividend, int divisor)
    {  
      return dividend - (dividend%divisor);
        
    }
    public static void main(String[] args){
        
        System.out.println("please enter value : ");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        
        System.out.println("largest nearest multiple of inputed value is : " + closestMultiple(no,2));
    }
}
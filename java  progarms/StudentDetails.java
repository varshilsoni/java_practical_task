import static java.lang.System.*;
import java.util.Scanner;

class Main{
    public static void main(String[] args)
    {
        int maths, sci, eng;
        String name;
        
        Scanner sc = new Scanner(System.in);
        out.println("please enter student name : ");
        name = sc.nextLine();
        
        out.println("please enter marks of maths : ");
        maths = sc.nextInt();
        
        out.println("please enter marks of science : ");
        sci = sc.nextInt();
        
        out.println("please enter marks of english : ");
        eng = sc.nextInt();
        
        float total = maths + sci + eng / 100.0f;
        
        out.println("student name is : " + name + " and percentage is : " + total);
        
    }
    
    
}
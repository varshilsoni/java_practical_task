import static java.lang.System.*;
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        
        int no;
        Scanner sc = new Scanner(System.in);
        out.println("enetr value for table");
        no = sc.nextInt();
        for(int i=1; i<=10; i++){
            out.println(no +" * "+ i + " = " + no*i);
        }
    }
}


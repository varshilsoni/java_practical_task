import java.util.Scanner;

class Main{
    public static void main(String[] args){
        
        System.out.println("enter string to reverse : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        String reverse  = " ";
        
        for(int i = str.length()-1; i>=0; --i){
            reverse += str.charAt(i);
        }
        System.out.println(reverse);
    }
}

import java.util.Scanner;

class Main{
    public static void main(String[] args){
        
        System.out.println("enter string to reverse : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        String reverse  = " ";
        StringBuilder sb = new StringBuilder();
        
        for(int i = str.length()-1; i>=0; --i){
            sb.append(str.charAt(i));
        }
        System.out.println(sb.toString());
    }
}


import java.util.Scanner;

class Main{
    public static void main(String[] args){
        
        System.out.println("enter string to reverse : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        StringBuilder sb = new StringBuilder(str);
        
        
        System.out.println(sb.reverse().toString());

    }
}
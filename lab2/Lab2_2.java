package lab2;


import java.util.Scanner;

public class Lab2_2 {
    public static void main(String[] args){
        String s;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter string");
        s = keyboard.nextLine();
        System.out.println(s.length());
        System.out.println(s.substring(0,1));
        System.out.println(s.charAt(s.length()-1));

    }
}

package task5;

import java.util.Scanner;

public class Main5 {
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {


        while (true) {
            int number = hello();
            for (Integer x =0; x<=number; x++ ){
                char[] ch = x.toString().toCharArray();
                while (check(ch)){
                    System.out.println(x + " поллиндром");
                    break;
                }
            }
        }
    }

    public static int hello(){
        System.out.println("insert number from 1 to 100");
        int i = sc.nextInt();
        if(i>0 & i<=100){
            return i;
        } else return hello();
    }
    public static boolean check(char[] ch){
       for (int i = 0; i<ch.length; i++ ){
           if(ch[i]!=ch[ch.length-i-1]){
               return false;
           } return true;
       }return true;
    }

}

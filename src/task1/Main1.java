package task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        globalChecking();

    }

    public static void globalChecking() {
        Scanner sc = new Scanner(System.in);
        while (true) {

            try {
                int i = sc.nextInt();
                if (i == 0) {
                    throw new InputMismatchException();
                }
                evenCheck(i);
                simpleCheck(i);
            } catch (InputMismatchException e) {
                System.out.println("необходимо ввести целое число");
                globalChecking();
            }
        }
    }

    public static void evenCheck(int i) {
        if (i > 1 && i % 2 == 0) {
            System.out.println(i + " - четное");
        } else System.out.println(i + " - нечетное");

    }

    public static void simpleCheck(int i) {
        for (int x =2; x<=i; x++){
            while (x<i){
                if(i%x==0){
                    System.out.println(i+ " - не является простым числом");
                    globalChecking();
                } x++;
            }
            System.out.println(i+ " - является простым числом");
            globalChecking();
        }
        System.out.println(i+ " - не является простым числом");

    }
}
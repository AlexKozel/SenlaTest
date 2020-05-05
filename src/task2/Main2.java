package task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        nokAndNod();
    }

    private static void nokAndNod() {

        Scanner sc = new Scanner(System.in);
        while (true) {

            try {
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (a == 0 || b == 0) {
                    throw new InputMismatchException();
                }
                System.out.println("Наибольший общий делитель - " + a + " и " + b + " это - " + nod(a, b));
                System.out.println("Наименьщее общее кратное - " + a + " и " + b + " это - " + nok(a, b));

            } catch (InputMismatchException e) {
                System.out.println("необходимо ввести два целых числа");
                nokAndNod();
            }
        }
    }

    private static int nod(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        return (a + b);
    }

    private static int nok(int a, int b) {
        return a * b / nod(a, b);
    }
}

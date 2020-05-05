package task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (true) {
            System.out.println("insert text");
            String text = sc.nextLine();
            System.out.println("insert word");
            String word = sc.nextLine();


            ArrayList<String> words = new ArrayList<String>(Arrays.asList(text.split(" ")));
            for (String singleWord : words
            ) {
                if (singleWord.equalsIgnoreCase(word)) {
                    i++;
                }
            }
            System.out.println(i);
            i = 0;
        }
    }
}

package task3;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            ArrayList<String> words = new ArrayList<String>(Arrays.asList(wordsCount(sc.nextLine())));
            Collections.sort(words);
            for (String word: words
            ) {
                System.out.println( word.substring(0, 1).toUpperCase() + word.substring(1));
            }
        }
    }

    private static String[] wordsCount(String s) {
        String[] words =  s.split(" ");
        System.out.println(words.length);
        return words;
    }

}
